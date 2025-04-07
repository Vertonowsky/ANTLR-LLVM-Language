declare i32 @printf(i8*, ...)
declare i32 @sprintf(i8*, i8*, ...)
declare i8* @strcpy(i8*, i8*)
declare i8* @strcat(i8*, i8*)
declare i32 @atoi(i8*)
declare i32 @scanf(i8*, ...)
declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg)
@strps = constant [4 x i8] c"%s\0A\00"
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strs = constant [5 x i8] c"%10s\00"
@strspi = constant [3 x i8] c"%d\00"
define i32 @main() nounwind{
%1 = add i32 1, 1
%2 = sitofp i32 %1 to double
%3 = fmul double 2.1, %2
%x = alloca double
store double %3, double* %x
%4 = load double, double* %x
%5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %4)
%6 = mul i32 3, 10
%7 = add i32 2, %6
%a = alloca i32
store i32 %7, i32* %a
%8 = load i32, i32* %a
%9 = sdiv i32 4, 4
%10 = add i32 %9, %8
%b = alloca i32
store i32 %10, i32* %b
%11 = load i32, i32* %b
%12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %11)
ret i32 0 }