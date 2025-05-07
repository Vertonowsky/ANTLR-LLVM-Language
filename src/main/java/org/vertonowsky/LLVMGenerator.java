package org.vertonowsky;

import java.util.*;

class LLVMGenerator {

   static String header_text = "";
   static String main_text = "";
   static String buffer = "";
   static int reg = 1;
   static int main_reg = 1;
   static int str = 1;
   static int br = 0;

   static Stack<Integer> brstack = new Stack<Integer>();

   static void func_call(String id, String ftype, List<Value> stackValues) {
      String functionType = ftype.equals("int") ? "i32" : (ftype.equals("float") ? "double" : "i1");
      buffer += "%" + reg + " = call " + functionType + " @" + id + "(";
      for (int i = 0; i < stackValues.size(); i++) {
         String type = stackValues.get(i).type.equals(VarType.INT) ? "i32" : (stackValues.get(i).type.equals(VarType.FLOAT) ? "double" : "i1");
         String name = stackValues.get(i).name;
         buffer += type + " " + name + ", ";
      }
      buffer = buffer.substring(0,buffer.length()-2);
      buffer += ")\n";
      reg++;
   }

   static void functionstart(String id, String ftype, String fargs) {
      String type = ftype.equals("int") ? "i32" : (ftype.equals("float") ? "double" : "i1");
      main_text += buffer;
      main_reg = reg;
      buffer = "define " + type + " @" + id + "(" + fargs + ") nounwind {\n";
      reg = 1;
   }

   static void functionend(String ftype, String retID) {
      String type = ftype.equals("int") ? "i32" : (ftype.equals("float") ? "double" : "i1");

      switch (ftype) {
         case "int" -> load_i32(retID);
         case "float" -> load_double(retID);
         case "bool" -> load_bool(retID);
      }

      buffer += "ret " + type + " %" + (reg-1) + "\n";
      buffer += "}\n";
      header_text += buffer;
      buffer = "";
      reg = main_reg;
   }

   static void close_main() {
      main_text += buffer;
   }

   static void repeatstart(String repetitions) {
      declare_i32(Integer.toString(reg), false);
      int counter = reg;
      reg++;
      assign_i32("%" + counter, "0");
      br++;
      buffer += "br label %cond" + br + "\n";
      buffer += "cond" + br + ":\n";

      load_i32("%" + counter);
      add_i32("%" + (reg - 1), "1");
      assign_i32("%" + counter, "%" + (reg - 1));

      buffer += "%" + reg + " = icmp slt i32 %" + (reg - 2) + ", " + repetitions + "\n";
      reg++;

      buffer += "br i1 %" + (reg - 1) + ", label %true" + br + ", label %false" + br + "\n";
      buffer += "true" + br + ":\n";
      brstack.push(br);
   }

   static void repeatend() {
      int b = brstack.pop();
      buffer += "br label %cond" + b + "\n";
      buffer += "false" + b + ":\n";
   }

   static void icmp(String id, String value) {
      buffer += "%" + reg + " = load i32, i32* " + id + "\n";
      reg++;
      buffer += "%" + reg + " = icmp eq i32 %" + (reg - 1) + ", " + value + "\n";
      reg++;
   }

   static void ifstart() {
      br++;
      buffer += "br i1 %" + (reg - 1) + ", label %true" + br + ", label %false" + br + "\n";
      buffer += "true" + br + ":\n";
      brstack.push(br);
   }

   static void ifend() {
      int b = brstack.pop();
      buffer += "br label %false" + b + "\n";
      buffer += "false" + b + ":\n";
   }

   static void writef_i32(String id) {
      buffer += "%" + reg + " = load i32, i32* " + id + "\n";
      reg++;
      buffer += "%" + reg + " = call i32 (ptr, ...) @printf(ptr noundef getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %" + (reg - 1) + ")\n";
      reg++;
   }

   static void writef_double(String id) {
      buffer += "%" + reg + " = load double, double* " + id + "\n";
      reg++;
      buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %" + (reg - 1) + ")\n";
      reg++;
   }

   static void writef_string(String id) {
      buffer += "%" + reg + " = load i8*, i8** " + id + "\n";
      reg++;
      buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %" + (reg - 1) + ")\n";
      reg++;
   }

   static void writef_bool(String id) {
      buffer += "%" + reg + " = load i1, i1* " + id + "\n";
      reg++;
      buffer += "%" + reg + " = zext i1 %" + (reg - 1) + " to i32\n";
      reg++;
      buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %" + (reg - 1) + ")\n";
      reg++;
   }

   static void declare_i32(String id, boolean global) {
      if (global) {
         header_text += "@"+id+" = global i32 0\n";
      } else {
         buffer += "%" + id + " = alloca i32\n";
      }
   }

   static void declare_double(String id, boolean global) {
      if (global) {
         header_text += "@"+id+" = global double 0.0\n";
      } else {
         buffer += "%" + id + " = alloca double\n";
      }
   }

   static void declare_string(String id, boolean global) {
      if (global) {
         header_text += "@" + id + " = global i8* null\n";
      } else {
         buffer += "%" + id + " = alloca i8*\n";
      }
   }

   static void declare_bool(String id, boolean global) {
      if (global) {
         header_text += "@" + id + " = global i1 0\n";
      } else {
         buffer += "%" + id + " = alloca i1\n";
      }
   }

   static void allocate_string(String id, int l) {
      buffer += "%" + id + " = alloca [" + (l + 1) + " x i8]\n";
   }

   static void assign_i32(String id, String value) {
      buffer += "store i32 " + value + ", i32* " + id + "\n";
   }

   static void assign_double(String id, String value) {
      buffer += "store double " + value + ", double* " + id + "\n";
   }

   static void assign_string(String id) {
      buffer += "store i8* %" + (reg - 1) + ", i8** " + id + "\n";
   }

   static void assign_bool(String id, String value) {
      buffer += "store i1 " + value + ", i1* " + id + "\n";
   }


   static void load_i32(String id) {
      buffer += "%" + reg + " = load i32, i32* " + id + "\n";
      reg++;
   }

   static void load_double(String id) {
      buffer += "%" + reg + " = load double, double* " + id + "\n";
      reg++;
   }

   static void load_string(String id) {
      buffer += "%" + reg + " = load i8*, i8** " + id + "\n";
      reg++;
   }

   static void load_bool(String id) {
      buffer += "%" + reg + " = load i1, i1* " + id + "\n";
      reg++;
   }

   static void sub_i32(String val1, String val2) {
      buffer += "%" + reg + " = sub i32 " + val2 + ", " + val1 + "\n";
      reg++;
   }

   static void sub_double(String val1, String val2) {
      buffer += "%" + reg + " = fsub double " + val2 + ", " + val1 + "\n";
      reg++;
   }

   static void add_i32(String val1, String val2) {
      buffer += "%" + reg + " = add i32 " + val1 + ", " + val2 + "\n";
      reg++;
   }

   static void add_double(String val1, String val2) {
      buffer += "%" + reg + " = fadd double " + val1 + ", " + val2 + "\n";
      reg++;
   }

   static void mult_i32(String val1, String val2) {
      buffer += "%" + reg + " = mul i32 " + val1 + ", " + val2 + "\n";
      reg++;
   }

   static void mult_double(String val1, String val2) {
      buffer += "%" + reg + " = fmul double " + val1 + ", " + val2 + "\n";
      reg++;
   }

   static void div_i32(String val1, String val2) {
      buffer += "%" + reg + " = sdiv i32 " + val2 + ", " + val1 + "\n";
      reg++;
   }

   static void div_double(String val1, String val2) {
      buffer += "%" + reg + " = fdiv double " + val2 + ", " + val1 + "\n";
      reg++;
   }

   static void and_short_circuit(String lhs, String rhs) {
      String checkLhs = "%" + reg++;
      String labelEvalRight = "and_rhs_" + reg;
      String labelFalse = "and_false_" + (reg + 1);
      String labelEnd = "and_end_" + (reg + 2);
      String rhsReg = "%" + (reg + 3);
      String phiReg = "%" + (reg + 4);
      reg += 5;

      // check if left side of the equation (lhs) is true
      buffer += checkLhs + " = icmp eq i1 " + lhs + ", 1\n";
      buffer += "br i1 " + checkLhs + ", label %" + labelEvalRight + ", label %" + labelFalse + "\n";

      // if lhs == false then conjunction will be 100% false
      buffer += labelFalse + ":\n";
      buffer += "br label %" + labelEnd + "\n";

      // check right side of the equation (rhs)
      buffer += labelEvalRight + ":\n";
      buffer += rhsReg + " = and i1 1, " + rhs + "\n";
      buffer += "br label %" + labelEnd + "\n";

      // choose right side of the equation (phi)
      buffer += labelEnd + ":\n";
      buffer += phiReg + " = phi i1 [0, %" + labelFalse + "], [" + rhsReg + ", %" + labelEvalRight + "]\n";
   }

   static void or_short_circuit(String lhs, String rhs) {
      String checkLhs = "%" + reg++;
      String labelEvalRight = "or_rhs_" + reg;
      String labelTrue = "or_true_" + (reg + 1);
      String labelEnd = "or_end_" + (reg + 2);
      String rhsReg = "%" + (reg + 3);
      String phiReg = "%" + (reg + 4);
      reg += 5;

      // check if left side of the equation (lhs) is true
      buffer += checkLhs + " = icmp ne i1 " + lhs + ", 0\n";
      buffer += "br i1 " + checkLhs + ", label %" + labelTrue + ", label %" + labelEvalRight + "\n";

      // if lhs == true then result will be 100% true
      buffer += labelTrue + ":\n";
      buffer += "br label %" + labelEnd + "\n";

      // if lhs == false then check right side (rhs)
      buffer += labelEvalRight + ":\n";
      buffer += rhsReg + " = or i1 1, " + rhs + "\n"; // if rhs is true, then result is true
      buffer += "br label %" + labelEnd + "\n";

      // pick result of OR operation with phi
      buffer += labelEnd + ":\n";
      buffer += phiReg + " = phi i1 [1, %" + labelTrue + "], [" + rhsReg + ", %" + labelEvalRight + "]\n";
   }

   static void xor_bool(String val1, String val2) {
      buffer += "%" + reg + " = xor i1 " + val1 + ", " + val2 + "\n";
      reg++;
   }

   static void neg_bool(String val) {
      buffer += "%" + reg + " = xor i1 1, " + val + "\n";
      reg++;
   }

   static void sitofp(String id) {
      buffer += "%" + reg + " = sitofp i32 " + id + " to double\n";
      reg++;
   }

   static void fptosi(String id) {
      buffer += "%" + reg + " = fptosi double " + id + " to i32\n";
      reg++;
   }

   static void scanf(String id, int l, boolean global) {
      allocate_string("str" + str, l);
      buffer += "%" + id + " = alloca i8*\n";
      buffer += "%" + reg + " = getelementptr inbounds [" + (l + 1) + " x i8], [" + (l + 1) + " x i8]* %str" + str + ", i64 0, i64 0\n";
      reg++;

      buffer += "store i8* %" + (reg - 1) + ", i8** %" + id + "\n";
      if (global)
         buffer += "store i8* %" + (reg - 1) + ", i8** @" + id + "\n";

      str++;
      buffer += "%" + reg + " = call i32 (ptr, ...) @scanf(ptr noundef getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), ptr noundef %" + (reg - 1) + ")\n";
      reg++;
   }

   static void constant_string(String content) {
      int l = content.length()+1;
      header_text += "@str" + str + " = constant [" + l + " x i8] c\"" + content + "\\00\"\n";
      String n = "str" + str;
      LLVMGenerator.allocate_string(n, (l - 1));
      buffer += "%"+reg+" = bitcast ["+l+" x i8]* %"+n+" to i8*\n";
      buffer += "call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %"+reg+", i8* align 1 getelementptr inbounds (["+l+" x i8], ["+l+" x i8]* @"+n+", i32 0, i32 0), i64 "+l+", i1 false)\n";
      reg++;
      buffer += "%ptr"+n+" = alloca i8*\n";
      buffer += "%"+reg+" = getelementptr inbounds ["+l+" x i8], ["+l+" x i8]* %"+n+", i64 0, i64 0\n";
      reg++;
      buffer += "store i8* %"+(reg-1)+", i8** %ptr"+n+"\n";
      str++;
   }

   static void add_string(String id1, int l1, String id2, int l2) {
      allocate_string("str" + str, l1 + l2);
      buffer += "%ptrstr" + str + " = alloca i8*\n";
      buffer += "%" + reg + " = getelementptr inbounds [" + (l1 + l2 + 1) + " x i8], [" + (l1 + l2 + 1) + " x i8]* %str" + str + ", i64 0, i64 0\n";
      reg++;
      buffer += "store i8* %" + (reg - 1) + ", i8** %ptrstr" + str + "\n";
      buffer += "%" + reg + " = load i8*, i8** %ptrstr" + str + "\n";
      reg++;
      buffer += "%" + reg + " = call i8* @strcpy(i8* %" + (reg - 1) + ", i8* " + id2 + ")\n";
      reg++;
      buffer += "%" + reg + " = call i8* @strcat(i8* %" + (reg - 2) + ", i8* " + id1 + ")\n";
      reg++;
      str++;
   }

   static void declare_i32_array(String id, int size) {
      buffer += "%" + id + " = alloca [" + size + " x i32], align 16\n";
      buffer += "%" + reg + " = bitcast [" + size + " x i32]* %" + id + " to i8*\n";
      reg++;
      buffer += "call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 16 %" + (reg - 1) +
              ", i8* align 16 bitcast ([" + size + " x i32]* @" + id + " to i8*), i64 " + (size * 4) + ", i1 false)\n";
   }

   static void declare_double_array(String id, int size) {
      buffer += "%" + id + " = alloca [" + size + " x double], align 16\n";
      buffer += "%" + reg + " = bitcast [" + size + " x double]* %" + id + " to i8*\n";
      reg++;
      buffer += "call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 16 %" + (reg - 1) +
              ", i8* align 16 bitcast ([" + size + " x double]* @" + id + " to i8*), i64 " + (size * 8) + ", i1 false)\n";
   }

   static void getelementptr_i32(String id, int size, int index) {
      buffer += "%" + reg + " = getelementptr inbounds [" + size + " x i32], [" + size + " x i32]* %" + id + ", i64 0, i64 " + index + "\n";
      reg++;
   }

   static void getelementptr_double(String id, int size, int index) {
      buffer += "%" + reg + " = getelementptr inbounds [" + size + " x double], [" + size + " x double]* %" + id + ", i64 0, i64 " + index + "\n";
      reg++;
   }

   static String getConsts(HashMap<String, Array> consts) {
      String text = "";
      for (Map.Entry<String, Array> entry : consts.entrySet()) {
         String ID = entry.getKey();
         Array array = entry.getValue();
         String type = array.type;
         if (array.type.equals("int[]")) {
            type = "i32";
         } else if (array.type.equals("float[]")) {
            type = "double";
         }

         if (type.equals("i32") || type.equals("double")) { // ARRAY
            text += "@" + ID + " = private unnamed_addr constant [" + array.values.size() + " x " + type + "] [";

            for (String v : array.values)
               text += type + " " + v + ", ";

            text = text.substring(0, text.length() - 2);
            text += "], align 16\n";

         }
      }
      return text;
   }


   static String generate(HashMap<String, Array> consts) {
      String text = "";
      text += "declare i32 @printf(ptr noundef, ...)\n";
      text += "declare i32 @scanf(ptr noundef, ...)\n";
      text += "declare i8* @strcpy(i8*, i8*)\n";
      text += "declare i8* @strcat(i8*, i8*)\n";
      text += "declare i32 @atoi(i8*)\n";
      text += "declare void @llvm.memcpy.p0.p0.i64(ptr noalias nocapture writeonly, ptr noalias nocapture readonly, i64, i1 immarg)\n";
      text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
      text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
      text += "@strps = constant [4 x i8] c\"%s\\0A\\00\"\n";
      text += "@strs = constant [3 x i8] c\"%s\\00\"\n";
      text += "@strspi = constant [3 x i8] c\"%d\\00\"\n";

      text += getConsts(consts);

      text += header_text;
      text += "define i32 @main() nounwind{\n";
      text += main_text;
      text += "ret i32 0 }\n";
      return text;
   }

}