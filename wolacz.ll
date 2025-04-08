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
@.divzero_msg = private unnamed_addr constant [22 x i8] c"Error: divide by zero\00"
declare void @puts(i8*)
declare void @exit(i32)
define void @print_error(i8* %message) {
    call i32 @printf(i8* getelementptr ([4 x i8], [4 x i8]* @.stringFormat, i32 0, i32 0), i8* %message)
    ret void
}
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
%a = alloca i32, align 4
%14 = add i32 0, 8
%15 = add i32 0, 3
%16 = add i32 0, 2
%17 = add i32 0, 4
%18 = sub i32 %16, %17
%19 = mul i32 %15, %18
%20 = add i32 %14, %19
%21 = add i32 0, 2
%22 = icmp eq i32 %21, 0
br i1 %22, label %L0, label %L1
L0:
call void @print_error(i8* getelementptr ([22 x i8], [22 x i8]* @.divzero_msg, i32 0, i32 0))
call void @exit(i32 1)
br label %L1
L1:
; continue division
%23 = sdiv i32 %20, %21
store i32 %23, i32* %a
%24 = load i32, i32* %a
%25 = call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @.intFormat, i32 0, i32 0), i32 %24)
%imie = alloca [100 x i8], align 1
%26 = getelementptr [100 x i8], [100 x i8]* %imie, i32 0, i32 0
%27 = getelementptr [7 x i8], [7 x i8]* @.str0, i32 0, i32 0
call void @llvm.memcpy.p0i8.p0i8.i64(i8* %26, i8* %27, i64 7, i1 false)
%28 = getelementptr [100 x i8], [100 x i8]* %imie, i32 0, i32 0
%29 = call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @.stringFormat, i32 0, i32 0), i8* %28)
%nazwisko = alloca [100 x i8], align 1
%30 = getelementptr [100 x i8], [100 x i8]* %nazwisko, i32 0, i32 0
%31 = call i32 (i8*, ...) @scanf(i8* getelementptr ([3 x i8], [3 x i8]* @.stringRead, i32 0, i32 0), i8* %30)
%32 = getelementptr [100 x i8], [100 x i8]* %nazwisko, i32 0, i32 0
%33 = call i32 (i8*, ...) @printf(i8* getelementptr ([4 x i8], [4 x i8]* @.stringFormat, i32 0, i32 0), i8* %32)
ret i32 0
}
