package org.example;

import java.util.*;

public class LLVMGenerator {
   private int reg = 1;
   private StringBuilder code = new StringBuilder();
   private int labelCount = 0;
   private final Map<String, String> symbolTable = new HashMap<>();
   private final Map<String, String> stringLiterals = new LinkedHashMap<>();
   private int strLiteralCount = 0;


   public String newRegister() {
      return "%" + reg++;
   }

   public String newLabel() {
      return "L" + (labelCount++);
   }

   public String getLLVMType(String langxType) {
      return switch (langxType) {
         case "int" -> "i32";
         case "float", "Float64" -> "double";  // alias
         case "Float32" -> "float";
         case "string" -> "i8*";
         default -> throw new RuntimeException("Unknown type: " + langxType);
      };
   }


   public void declareVariable(String name, String type) {
      symbolTable.put(name, type);
      if (type.equals("i8*")) {
         emit("%" + name + " = alloca [100 x i8], align 1");
      } else if (type.equals("float")) {
         emit("%" + name + " = alloca float, align " + getAlignment(type)); // float ma 4 bajty
      } else if (type.equals("double")) {
         emit("%" + name + " = alloca double, align " + getAlignment(type)); // double ma 8 bajtów
      } else {
         emit("%" + name + " = alloca " + type + ", align " + getAlignment(type));
      }
   }


   public void assignVariable(String name, String valueReg) {
      String type = symbolTable.get(name);
      emit("store " + type + " " + valueReg + ", " + type + "* %" + name);
   }

   public void emit(String line) {
      code.append(line).append("\n");
   }


   public String getGeneratedCode() {
      StringBuilder all = new StringBuilder();
      all.append("; ModuleID = 'langx'\n");

      // Literals
      for (String literal : stringLiterals.values()) {
         all.append(literal).append("\n");
      }

      all.append(code);
      return all.toString();
   }


   private int getAlignment(String type) {
      return switch (type) {
         case "i32" -> 4;
         case "i1" -> 1;
         case "float" -> 4;
         case "double" -> 8;
         case "i8*" -> 8;
         default -> 4;
      };
   }


   public void startModule() {
      emit("; ModuleID = 'langx'");
      emit("declare void @llvm.memcpy.p0i8.p0i8.i64(i8*, i8*, i64, i1)");


      emit("@.intFormat = private constant [4 x i8] c\"%d\\0A\\00\"");
      emit("@.floatFormat = private constant [7 x i8] c\"%.10f\\0A\\00\"");
      emit("@.stringFormat = private constant [4 x i8] c\"%s\\0A\\00\"");

      emit("@.intRead = private constant [3 x i8] c\"%d\\00\"");
      emit("@.floatRead = private constant [4 x i8] c\"%lf\\00\"");
      emit("@.stringRead = private constant [3 x i8] c\"%s\\00\"");

      emit("@.divzero_msg = private unnamed_addr constant [22 x i8] c\"Error: divide by zero\\00\"");
      emit("declare void @puts(i8*)");
      emit("declare void @exit(i32)");

      emit("define void @print_error(i8* %message) {");
      emit("    call i32 @printf(i8* getelementptr ([4 x i8], [4 x i8]* @.stringFormat, i32 0, i32 0), i8* %message)");
      emit("    ret void");
      emit("}");

      emit("declare i32 @printf(i8*, ...)");
      emit("declare i32 @scanf(i8*, ...)");
      emit("define i32 @main() {");
   }


   public void endModule() {
      emit("ret i32 0");
      emit("}");
   }

   public void emitPrint(String reg, String type) {
      String formatLabel = switch (type) {
         case "i32" -> "@.intFormat";
         case "float", "double" -> "@.floatFormat";
         case "i8*" -> "@.stringFormat";
         default -> throw new RuntimeException("Unknown type: " + type);
      };

      if (type.equals("i8*")) {
         String cleanReg = reg.startsWith("%") ? reg.substring(1) : reg;
         String strPtr = newRegister();
         emit(strPtr + " = getelementptr [100 x i8], [100 x i8]* %" + cleanReg + ", i32 0, i32 0");
         String strPtr2 = newRegister();
         emit(strPtr2 + " = call i32 (i8*, ...) @printf(i8* getelementptr " +
                 "([4 x i8], [4 x i8]* " + formatLabel + ", i32 0, i32 0), i8* " + strPtr + ")");
      } else {
         String cleanReg = reg.startsWith("%") ? reg.substring(1) : reg;
         String strPtr = newRegister();
         emit(strPtr + " = call i32 (i8*, ...) @printf(i8* getelementptr " +
                 "([4 x i8], [4 x i8]* " + formatLabel + ", i32 0, i32 0), " + type + " %" + cleanReg + ")");
      }
   }

   public void emitRead(String varName, String type) {
      String formatLabel = switch (type) {
         case "i32" -> "@.intRead";
         case "double" -> "@.floatRead";
         case "i8*" -> "@.stringRead";
         default -> throw new RuntimeException("Unsupported type: " + type);
      };

      String labelSize = switch (type) {
         case "i32", "i8*" -> "[3 x i8]";
         case "double" -> "[4 x i8]";
         default -> "[3 x i8]";
      };

      if (type.equals("i8*")) {
         // 🟢 1. ZACHOWAJ KOLEJNOŚĆ REJESTRÓW
         String strPtr = newRegister(); // %1
         String callReg = newRegister(); // %2

         // 🟢 2. EMITUJ W TEJ SAMEJ KOLEJNOŚCI
         emit(strPtr + " = getelementptr [100 x i8], [100 x i8]* %" + varName + ", i32 0, i32 0");
         emit(callReg + " = call i32 (i8*, ...) @scanf(i8* getelementptr (" +
                 labelSize + ", " + labelSize + "* " + formatLabel + ", i32 0, i32 0), i8* " + strPtr + ")");
      } else {
         String callReg = newRegister();
         String pointerType = type + "*";
         emit(callReg + " = call i32 (i8*, ...) @scanf(i8* getelementptr (" +
                 labelSize + ", " + labelSize + "* " + formatLabel + ", i32 0, i32 0), " + pointerType + " %" + varName + ")");
      }
   }

   public String registerStringLiteral(String text) {
      if (stringLiterals.containsKey(text)) {
         return stringLiterals.get(text);
      }

      String label = "@.str" + strLiteralCount++;
      String escaped = text
              .replace("\\", "\\5C")
              .replace("\"", "\\22")
              .replace("\n", "\\0A");

      int len = text.length() + 1; // +1 for \00
      String llvmLiteral = label + " = private constant [" + len + " x i8] c\"" + escaped + "\\00\"";
      stringLiterals.put(text, llvmLiteral);
      return label;
   }


}
