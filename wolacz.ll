declare i32 @printf(ptr noundef, ...)
declare i32 @scanf(ptr noundef, ...)
declare i8* @strcpy(i8*, i8*)
declare i8* @strcat(i8*, i8*)
declare i32 @atoi(i8*)
declare void @llvm.memcpy.p0.p0.i64(ptr noalias nocapture writeonly, ptr noalias nocapture readonly, i64, i1 immarg)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strs = constant [3 x i8] c"%s\00"
@strspi = constant [3 x i8] c"%d\00"
@arr = private unnamed_addr constant [3 x double] [double 4.1, double 7.2, double 9.3], align 16
@str1 = constant [1 x i8] c"\00"
@z = global i8* null
@str3 = constant [21 x i8] c"====================\00"
@przerwa = global i8* null
@koniunkcja = global i1 0
@alternatywa = global i1 0
@negacja = global i1 0
@xor = global i1 0
@elem = global double 0.0
define i32 @multiply(i32 %a, i32 %b) nounwind {
%1 = mul i32 %b, %a
%result = alloca i32
store i32 %1, i32* %result
%2 = load i32, i32* %result
ret i32 %2
}
@halo = global i32 0
@str4 = constant [15 x i8] c"hello, my turn\00"
@str = global i8* null
@str5 = constant [11 x i8] c"functions:\00"
@strsec = global i8* null
@i = global i32 0
@multi = global i32 0
@str6 = constant [4 x i8] c"lol\00"
@str7 = constant [18 x i8] c"I'm done, thanks!\00"
define i32 @main() nounwind{
%str1 = alloca [1 x i8]
%1 = bitcast [1 x i8]* %str1 to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %1, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str1, i32 0, i32 0), i64 1, i1 false)
%ptrstr1 = alloca i8*
%2 = getelementptr inbounds [1 x i8], [1 x i8]* %str1, i64 0, i64 0
store i8* %2, i8** %ptrstr1
store i8* %2, i8** @z
%str2 = alloca [17 x i8]
%z = alloca i8*
%3 = getelementptr inbounds [17 x i8], [17 x i8]* %str2, i64 0, i64 0
store i8* %3, i8** %z
store i8* %3, i8** @z
%4 = call i32 (ptr, ...) @scanf(ptr noundef getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), ptr noundef %3)
%5 = load i8*, i8** @z
%6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %5)
%str3 = alloca [21 x i8]
%7 = bitcast [21 x i8]* %str3 to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %7, i8* align 1 getelementptr inbounds ([21 x i8], [21 x i8]* @str3, i32 0, i32 0), i64 21, i1 false)
%ptrstr3 = alloca i8*
%8 = getelementptr inbounds [21 x i8], [21 x i8]* %str3, i64 0, i64 0
store i8* %8, i8** %ptrstr3
store i8* %8, i8** @przerwa
%9 = load i8*, i8** @przerwa
%10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %9)
%11 = icmp eq i1 1, 1
br i1 %11, label %and_rhs_12, label %and_false_13
and_false_13:
br label %and_end_14
and_rhs_12:
%15 = and i1 1, 0
br label %and_end_14
and_end_14:
%16 = phi i1 [0, %and_false_13], [%15, %and_rhs_12]
%17 = icmp ne i1 1, 0
br i1 %17, label %or_true_19, label %or_rhs_18
or_true_19:
br label %or_end_20
or_rhs_18:
%21 = or i1 1, %16
br label %or_end_20
or_end_20:
%22 = phi i1 [1, %or_true_19], [%21, %or_rhs_18]
store i1 %22, i1* @koniunkcja
%23 = icmp ne i1 0, 0
br i1 %23, label %or_true_25, label %or_rhs_24
or_true_25:
br label %or_end_26
or_rhs_24:
%27 = or i1 1, 1
br label %or_end_26
or_end_26:
%28 = phi i1 [1, %or_true_25], [%27, %or_rhs_24]
%29 = icmp ne i1 1, 0
br i1 %29, label %or_true_31, label %or_rhs_30
or_true_31:
br label %or_end_32
or_rhs_30:
%33 = or i1 1, %28
br label %or_end_32
or_end_32:
%34 = phi i1 [1, %or_true_31], [%33, %or_rhs_30]
store i1 %34, i1* @alternatywa
%35 = xor i1 1, 0
store i1 %35, i1* @negacja
%36 = xor i1 1, 1
store i1 %36, i1* @xor
%37 = load i1, i1* @koniunkcja
%38 = zext i1 %37 to i32
%39 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %38)
%40 = load i1, i1* @alternatywa
%41 = zext i1 %40 to i32
%42 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %41)
%43 = load i1, i1* @negacja
%44 = zext i1 %43 to i32
%45 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %44)
%46 = load i1, i1* @xor
%47 = zext i1 %46 to i32
%48 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %47)
%49 = load i8*, i8** @przerwa
%50 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %49)
%arr = alloca [3 x double], align 16
%51 = bitcast [3 x double]* %arr to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 16 %51, i8* align 16 bitcast ([3 x double]* @arr to i8*), i64 24, i1 false)
%52 = getelementptr inbounds [3 x double], [3 x double]* %arr, i64 0, i64 2
%53 = load double, double* %52
store double %53, double* @elem
%54 = load double, double* @elem
%55 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %54)
%56 = load i8*, i8** @przerwa
%57 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %56)
%58 = add i32 1, 2
%59 = mul i32 8, %58
%60 = sub i32 3, 1
%61 = sdiv i32 %59, %60
store i32 %61, i32* @halo
%62 = load i32, i32* @halo
%63 = call i32 (ptr, ...) @printf(ptr noundef getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %62)
%64 = load i8*, i8** @przerwa
%65 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %64)
%str4 = alloca [15 x i8]
%66 = bitcast [15 x i8]* %str4 to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %66, i8* align 1 getelementptr inbounds ([15 x i8], [15 x i8]* @str4, i32 0, i32 0), i64 15, i1 false)
%ptrstr4 = alloca i8*
%67 = getelementptr inbounds [15 x i8], [15 x i8]* %str4, i64 0, i64 0
store i8* %67, i8** %ptrstr4
store i8* %67, i8** @str
%str5 = alloca [11 x i8]
%68 = bitcast [11 x i8]* %str5 to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %68, i8* align 1 getelementptr inbounds ([11 x i8], [11 x i8]* @str5, i32 0, i32 0), i64 11, i1 false)
%ptrstr5 = alloca i8*
%69 = getelementptr inbounds [11 x i8], [11 x i8]* %str5, i64 0, i64 0
store i8* %69, i8** %ptrstr5
store i8* %69, i8** @strsec
store i32 0, i32* @i
%70 = alloca i32
store i32 0, i32* %70
br label %cond1
cond1:
%71 = load i32, i32* %70
%72 = add i32 %71, 1
store i32 %72, i32* %70
%73 = icmp slt i32 %71, 10
br i1 %73, label %true1, label %false1
true1:
%74 = load i32, i32* @i
%75 = icmp eq i32 %74, 5
br i1 %75, label %true2, label %false2
true2:
%76 = load i8*, i8** @str
%77 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %76)
br label %false2
false2:
%78 = load i32, i32* @i
%79 = call i32 (ptr, ...) @printf(ptr noundef getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %78)
%80 = load i32, i32* @i
%81 = add i32 1, %80
store i32 %81, i32* @i
br label %cond1
false1:
%82 = load i8*, i8** @przerwa
%83 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %82)
%84 = load i8*, i8** @strsec
%85 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %84)
store i32 0, i32* @i
%86 = alloca i32
store i32 0, i32* %86
br label %cond3
cond3:
%87 = load i32, i32* %86
%88 = add i32 %87, 1
store i32 %88, i32* %86
%89 = icmp slt i32 %87, 5
br i1 %89, label %true3, label %false3
true3:
%90 = load i32, i32* @i
%91 = call i32 @multiply(i32 %90, i32 2)
store i32 %91, i32* @multi
%92 = load i32, i32* @multi
%93 = call i32 (ptr, ...) @printf(ptr noundef getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %92)
%94 = load i32, i32* @i
%95 = add i32 1, %94
store i32 %95, i32* @i
%str6 = alloca [4 x i8]
%96 = bitcast [4 x i8]* %str6 to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %96, i8* align 1 getelementptr inbounds ([4 x i8], [4 x i8]* @str6, i32 0, i32 0), i64 4, i1 false)
%ptrstr6 = alloca i8*
%97 = getelementptr inbounds [4 x i8], [4 x i8]* %str6, i64 0, i64 0
store i8* %97, i8** %ptrstr6
store i8* %97, i8** @multi
%98 = load i8*, i8** @multi
%99 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %98)
br label %cond3
false3:
%str7 = alloca [18 x i8]
%100 = bitcast [18 x i8]* %str7 to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %100, i8* align 1 getelementptr inbounds ([18 x i8], [18 x i8]* @str7, i32 0, i32 0), i64 18, i1 false)
%ptrstr7 = alloca i8*
%101 = getelementptr inbounds [18 x i8], [18 x i8]* %str7, i64 0, i64 0
store i8* %101, i8** %ptrstr7
store i8* %101, i8** @i
%102 = load i8*, i8** @i
%103 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %102)
%104 = load i8*, i8** @przerwa
%105 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %104)
%106 = load i32, i32* @halo
%107 = icmp eq i32 %106, 12
br i1 %107, label %true4, label %false4
true4:
%108 = load i8*, i8** @z
%109 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %108)
br label %false4
false4:
%110 = load i8*, i8** @przerwa
%111 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %110)
ret i32 0 }
