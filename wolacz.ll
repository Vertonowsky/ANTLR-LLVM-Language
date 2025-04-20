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
define i32 @multiply(i32 %a, i32 %b) nounwind {
%1 = mul i32 %b, %a
%result = alloca i32
store i32 %1, i32* %result
%2 = load i32, i32* %result
ret i32 %2
}
@str1 = constant [21 x i8] c"====================\00"
@przerwa = global i8* null
@str2 = constant [1 x i8] c"\00"
@z = global i8* null
@halo = global i32 0
@str4 = constant [15 x i8] c"hello, my turn\00"
@str = global i8* null
@str5 = constant [11 x i8] c"functions:\00"
@strsec = global i8* null
@i = global i32 0
@multi = global i32 0
@str6 = constant [4 x i8] c"lol\00"
@str7 = constant [18 x i8] c"I'm done, thanks!\00"
@koniunkcja = global i1 0
@alternatywa = global i1 0
@negacja = global i1 0
@xor = global i1 0
define i32 @main() nounwind{
%str1 = alloca [21 x i8]
%1 = bitcast [21 x i8]* %str1 to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %1, i8* align 1 getelementptr inbounds ([21 x i8], [21 x i8]* @str1, i32 0, i32 0), i64 21, i1 false)
%ptrstr1 = alloca i8*
%2 = getelementptr inbounds [21 x i8], [21 x i8]* %str1, i64 0, i64 0
store i8* %2, i8** %ptrstr1
store i8* %2, i8** @przerwa
%str2 = alloca [1 x i8]
%3 = bitcast [1 x i8]* %str2 to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %3, i8* align 1 getelementptr inbounds ([1 x i8], [1 x i8]* @str2, i32 0, i32 0), i64 1, i1 false)
%ptrstr2 = alloca i8*
%4 = getelementptr inbounds [1 x i8], [1 x i8]* %str2, i64 0, i64 0
store i8* %4, i8** %ptrstr2
store i8* %4, i8** @z
%str3 = alloca [17 x i8]
%z = alloca i8*
%5 = getelementptr inbounds [17 x i8], [17 x i8]* %str3, i64 0, i64 0
store i8* %5, i8** %z
store i8* %5, i8** @z
%6 = call i32 (ptr, ...) @scanf(ptr noundef getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), ptr noundef %5)
%7 = load i8*, i8** @z
%8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %7)
%9 = add i32 1, 2
%10 = mul i32 8, %9
%11 = sub i32 3, 1
%12 = sdiv i32 %10, %11
store i32 %12, i32* @halo
%13 = load i32, i32* @halo
%14 = call i32 (ptr, ...) @printf(ptr noundef getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %13)
%15 = load i8*, i8** @przerwa
%16 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %15)
%str4 = alloca [15 x i8]
%17 = bitcast [15 x i8]* %str4 to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %17, i8* align 1 getelementptr inbounds ([15 x i8], [15 x i8]* @str4, i32 0, i32 0), i64 15, i1 false)
%ptrstr4 = alloca i8*
%18 = getelementptr inbounds [15 x i8], [15 x i8]* %str4, i64 0, i64 0
store i8* %18, i8** %ptrstr4
store i8* %18, i8** @str
%str5 = alloca [11 x i8]
%19 = bitcast [11 x i8]* %str5 to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %19, i8* align 1 getelementptr inbounds ([11 x i8], [11 x i8]* @str5, i32 0, i32 0), i64 11, i1 false)
%ptrstr5 = alloca i8*
%20 = getelementptr inbounds [11 x i8], [11 x i8]* %str5, i64 0, i64 0
store i8* %20, i8** %ptrstr5
store i8* %20, i8** @strsec
store i32 0, i32* @i
%21 = alloca i32
store i32 0, i32* %21
br label %cond1
cond1:
%22 = load i32, i32* %21
%23 = add i32 %22, 1
store i32 %23, i32* %21
%24 = icmp slt i32 %22, 10
br i1 %24, label %true1, label %false1
true1:
%25 = load i32, i32* @i
%26 = icmp eq i32 %25, 5
br i1 %26, label %true2, label %false2
true2:
%27 = load i8*, i8** @str
%28 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %27)
br label %false2
false2:
%29 = load i32, i32* @i
%30 = call i32 (ptr, ...) @printf(ptr noundef getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %29)
%31 = load i32, i32* @i
%32 = add i32 1, %31
store i32 %32, i32* @i
br label %cond1
false1:
%33 = load i8*, i8** @przerwa
%34 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %33)
%35 = load i8*, i8** @strsec
%36 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %35)
store i32 0, i32* @i
%37 = alloca i32
store i32 0, i32* %37
br label %cond3
cond3:
%38 = load i32, i32* %37
%39 = add i32 %38, 1
store i32 %39, i32* %37
%40 = icmp slt i32 %38, 5
br i1 %40, label %true3, label %false3
true3:
%41 = load i32, i32* @i
%42 = call i32 @multiply(i32 %41, i32 2)
store i32 %42, i32* @multi
%43 = load i32, i32* @multi
%44 = call i32 (ptr, ...) @printf(ptr noundef getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %43)
%45 = load i32, i32* @i
%46 = add i32 1, %45
store i32 %46, i32* @i
%str6 = alloca [4 x i8]
%47 = bitcast [4 x i8]* %str6 to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %47, i8* align 1 getelementptr inbounds ([4 x i8], [4 x i8]* @str6, i32 0, i32 0), i64 4, i1 false)
%ptrstr6 = alloca i8*
%48 = getelementptr inbounds [4 x i8], [4 x i8]* %str6, i64 0, i64 0
store i8* %48, i8** %ptrstr6
store i8* %48, i8** @multi
%49 = load i8*, i8** @multi
%50 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %49)
br label %cond3
false3:
%str7 = alloca [18 x i8]
%51 = bitcast [18 x i8]* %str7 to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %51, i8* align 1 getelementptr inbounds ([18 x i8], [18 x i8]* @str7, i32 0, i32 0), i64 18, i1 false)
%ptrstr7 = alloca i8*
%52 = getelementptr inbounds [18 x i8], [18 x i8]* %str7, i64 0, i64 0
store i8* %52, i8** %ptrstr7
store i8* %52, i8** @i
%53 = load i8*, i8** @i
%54 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %53)
%55 = load i8*, i8** @przerwa
%56 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %55)
%57 = load i32, i32* @halo
%58 = icmp eq i32 %57, 12
br i1 %58, label %true4, label %false4
true4:
%59 = load i8*, i8** @z
%60 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %59)
br label %false4
false4:
%61 = load i8*, i8** @przerwa
%62 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %61)
%63 = icmp eq i1 1, 1
br i1 %63, label %and_rhs_64, label %and_false_65
and_false_65:
br label %and_end_66
and_rhs_64:
%67 = and i1 1, 0
br label %and_end_66
and_end_66:
%68 = phi i1 [0, %and_false_65], [%67, %and_rhs_64]
%69 = icmp ne i1 1, 0
br i1 %69, label %or_true_71, label %or_rhs_70
or_true_71:
br label %or_end_72
or_rhs_70:
%73 = or i1 1, %68
br label %or_end_72
or_end_72:
%74 = phi i1 [1, %or_true_71], [%73, %or_rhs_70]
store i1 %74, i1* @koniunkcja
%75 = icmp ne i1 0, 0
br i1 %75, label %or_true_77, label %or_rhs_76
or_true_77:
br label %or_end_78
or_rhs_76:
%79 = or i1 1, 1
br label %or_end_78
or_end_78:
%80 = phi i1 [1, %or_true_77], [%79, %or_rhs_76]
%81 = icmp ne i1 1, 0
br i1 %81, label %or_true_83, label %or_rhs_82
or_true_83:
br label %or_end_84
or_rhs_82:
%85 = or i1 1, %80
br label %or_end_84
or_end_84:
%86 = phi i1 [1, %or_true_83], [%85, %or_rhs_82]
store i1 %86, i1* @alternatywa
%87 = xor i1 1, 0
store i1 %87, i1* @negacja
%88 = xor i1 1, 1
store i1 %88, i1* @xor
%89 = load i1, i1* @koniunkcja
%90 = zext i1 %89 to i32
%91 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %90)
%92 = load i1, i1* @alternatywa
%93 = zext i1 %92 to i32
%94 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %93)
%95 = load i1, i1* @negacja
%96 = zext i1 %95 to i32
%97 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %96)
%98 = load i1, i1* @xor
%99 = zext i1 %98 to i32
%100 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %99)
ret i32 0 }
