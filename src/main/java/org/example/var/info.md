# Understanding `var` in Java

In Java, **`var`** is a feature introduced in **Java 10** that allows for **local variable type inference**. It lets the compiler infer the type of the variable from the value assigned to it, making code more concise and readable.

## Key Points about `var`

### Type Inference
The compiler determines the variable's type based on the value assigned.

```java
var message = "Hello, Java!";  // The type is inferred as String
var number = 42;              // The type is inferred as int
var list = new ArrayList<String>(); // The type is inferred as ArrayList<String>
```

### Usage Scope
- **`var` can only be used for local variables:**
    - Inside methods
    - In loops
    - In local blocks

- **`var` cannot be used for:**
    - Class fields
    - Method parameters
    - Return types
