# Exception in Java

An **exception** in Java is an event that occurs during program execution and disrupts its normal flow. 
It usually happens when something unexpected or incorrect occurs, like dividing by zero or trying to access a file that doesn't exist.




# Errors in Programming

### 1. Compile-Time Error
A compile-time error occurs during the compilation process, before the program runs.

**Example**: Syntax errors or undeclared variables.

```java
int x = 10
System.out.println(x);
```
**Error**: Missing semicolon at the end of the first line (compile-time error).

---

### 2. Runtime Error   (are called as exception and we need to handle it )
A runtime error occurs when the program is running, after the compilation.

**Example**: Division by zero, accessing an array out of bounds.

```java
int x = 10;
int y = 0;
System.out.println(x / y);
```
**Error**: Division by zero (runtime error).

---

### 3. Logical Error
A logical error occurs when the program runs without crashing but produces incorrect output due to incorrect logic.

**Example**: Incorrect calculation or wrong condition in an algorithm.

```java
int x = 5;
int y = 3;
int sum = x * y; // Incorrect logic
System.out.println(sum); // Expected 8, but prints 15
```
**Error**: The logic for summing `x` and `y` is incorrect (logical error).
