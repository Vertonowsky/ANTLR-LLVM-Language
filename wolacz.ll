; ModuleID = 'langx'
@.str0 = private constant [7 x i8] c"Bartek\00"
; ModuleID = 'langx'
declare void @llvm.memcpy.p0i8.p0i8.i64(i8*, i8*, i64, i1)
@.intFormat = private constant [4 x i8] c"%d\0A\00"
@.floatFormat = private constant [7 x i8] c"%.10f\0A\00"
@.stringFormat = private constant [4 x i8] c"%s\0A\00"
@.intRead = private constant [3 x i8] c"%d\00"
@.floatRead = private constant [4 x i8] c"%lf\00"
@.stringRead = private constant [3 x i8] c"%s\00"
declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
define i32 @main() {
%i = alloca i32, align 4
%f = alloca float, align 4
%d = alloca double, align 8
%1 = add i32 0, 3
store i32 %1, i32* %i
%2 = load i32, i32* %i
%3 = fadd double 0.0, 1.5
%4 = sitofp i32 %2 to double
%5 = fadd double %4, %3
%6 = fptrunc double %5 to float
store float %6, float* %f
%7 = load float, float* %f
%8 = add i32 0, 2
%9 = sitofp i32 %8 to float
%10 = fadd float %7, %9
%11 = fpext float %10 to double
store double %11, double* %d
%12 = load double, double* %d
%13 = call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @.floatFormat, i32 0, i32 0), double %12)
%imie = alloca [100 x i8], align 1
%14 = getelementptr [100 x i8], [100 x i8]* %imie, i32 0, i32 0
%15 = getelementptr [7 x i8], [7 x i8]* @.str0, i32 0, i32 0
call void @llvm.memcpy.p0i8.p0i8.i64(i8* %14, i8* %15, i64 7, i1 false)
%16 = getelementptr [100 x i8], [100 x i8]* %imie, i32 0, i32 0
%17 = call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @.stringFormat, i32 0, i32 0), i8* %16)
%nazwisko = alloca [100 x i8], align 1
%18 = getelementptr [100 x i8], [100 x i8]* %nazwisko, i32 0, i32 0
%19 = call i32 (i8*, ...) @scanf(i8* getelementptr ([3 x i8], [3 x i8]* @.stringRead, i32 0, i32 0), i8* %18)
%20 = getelementptr [100 x i8], [100 x i8]* %nazwisko, i32 0, i32 0
%21 = call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @.stringFormat, i32 0, i32 0), i8* %20)
; string literal (not yet supported): "asd"
%22 = call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @.intFormat, i32 0, i32 0), i32 %null)
ret i32 0
}
