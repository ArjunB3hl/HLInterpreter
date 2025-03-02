# HL Language Interpreter

## Overview
This project implements an interpreter for the HL language. It is built in Java using JavaCC and JJTree to generate and evaluate an Abstract Syntax Tree (AST) with the Visitor pattern.

## Project Structure
- **HL.jjt**  
  *Grammar Definition*: Defines the HL language grammar using JJTree.
- **HLEval.java**  
  *Interpreter Logic*: Contains the visitor methods to evaluate the AST.
- **Makefile**  
  Automates the compilation and build process.
- **runtests**  
  A script for running test cases located in the `tests/` directory.
- **tests/**  
  Directory for HL test files.

## Prerequisites
- Java (JDK 11 or newer)
- JavaCC (v7.0.9 or compatible)

## Build and Run Instructions

### Using Makefile
1. **Build the Interpreter**
   ```shell
   make
   ```
2. **Run Tests**
   ```shell
   ./runtests
   ```

### Direct Compilation
If you prefer compiling manually:
```shell
javacc HL.jjt
javac *.java AST/*.java
java HL < your_input_file.hl
```
Replace `your_input_file.hl` with the actual HL source file.

## Implementation Details

### Abstract Syntax Tree (AST)
- Generated from `HL.jjt`.
- Key nodes include:
  - `ASTvar_decl`: Variable declarations
  - `ASTfn_decl`: Function definitions
  - `ASTfn_call`: Function calls
  - `ASTAssign`: Variable assignments
  - `ASTPrint` / `ASTPrintln`: Print operations
  - `ASTIf`, `ASTFor`, `ASTWhile`: Control structures
  - `ASTsum`, `ASTmul`, `ASTdiv`, `ASTmod`: Arithmetic operations
  - `ASTcomparison`: Comparisons and boolean operators
  - `ASTset`, `ASTinterval`: Set operations

### Visitor Pattern in HLEval.java
- Each AST node has a corresponding visit method.
- Activation records (`HLActivationRecord`) manage variable scopes.
- Symbol tables (`HLSymbTab`) track variables and their values.

## Usage Example
To run an HL program (e.g., `example.hl`):
```shell
java HL < example.hl
```
Ensure your test files are placed in the `tests/` directory.

## Debugging and Extensions
- Add debug print statements in `HLEval.java` for tracing.
- Modify `HL.jjt` to change the grammar, and update associated AST nodes accordingly.

---
Enjoy exploring and extending the HL interpreter!