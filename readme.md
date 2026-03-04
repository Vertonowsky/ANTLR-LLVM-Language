# 📖 About the Project

**ANTLR‑LLVM‑Language** is a custom programming language compiler built from the ground up. It leverages **ANTLR4** for high-level syntax analysis and **LLVM** to bridge the gap between abstract logic and low-level processor-native code.

Unlike interpreted languages, this compiler translates source code directly into optimized machine instructions, allowing for high-performance execution directly on the hardware.

--- 

### 🔹 Language Features

- **Variables** with strong typing: `int`, `float`, `bool`  
- **Arrays**: `int[]` and `float[]` with initialization and indexed access  
- **Assignments**: literals, expressions, array elements, and function results  
- **Arithmetic operators**: `+`, `-`, `*`, `/` with support for nested expressions  
- **Type casting**: `(int)` and `(float)`  
- **Conditional statements**: `if ... endif` with boolean comparisons  
- **Loops**: `repeat ... endrepeat` with fixed or variable counts  
- **Boolean logic**: `&&` (AND), `||` (OR), `^` (XOR), `!` (NOT), supporting nested expressions and short-circuit breaker 
- **Input/Output**: `read()` and `write()`  
- **Functions**: typed parameters, `return` values and callable within expressions  
- **Array element access and modification**: `ID[INDEX]`  
- **Expressions**: combine arithmetic, boolean, function calls, type casts, and array access  
- **Block-based program structure**: operations and functions separated by newlines for modularity and clarity

---

### 🔹 Syntax Analyzer

The syntax analyzer is responsible for parsing source code according to the defined grammar. It performs:

- Tokenization of keywords, identifiers, literals, and operators  
- Structural validation of programs based on the grammar rules  
- Construction of the Abstract Syntax Tree (AST)  
- Detection of syntax errors during parsing  

The parser ensures that only syntactically correct programs proceed to the next compilation stage.

> [!TIP]
> Example valid script demonstrating variables, loops, conditionals, arrays, functions  
> and I/O operations is available here: ➡️ [View example script](./code.wlc)


> [!NOTE]
> Language grammar is available here ➡️ [View grammar definition](./grammar/Wolacz.g4)


# 📦 Deployment
### Run everything in x64 Native Tools Command Prompt

```bash
# Convertion from LLVM into executable file
clang wolacz.ll -o wolacz.exe
clang wolacz.ll -o wolacz.exe -llegacy_stdio_definitions

# Running application
wolacz.exe + ENTER
```
