# What is an Array?
An **array** in Java is a data structure that allows you to store multiple values of the same type in a single variable.
It is a fixed-size, indexed collection where elements are stored in contiguous memory locations.

---

## How to Declare and Initialize an Array

### Declaration
**Syntax:**

```java
dataType[] arrayName; // Preferred
int[] num;

dataType arrayName[]; // Also valid but less common
int num[];
```

### Initialization

#### Using the `new` keyword:
```java
int num[] = new int[5]; // Creates an array with 5 elements, all initialized to 0
```

#### Directly assigning values:
```java
int num[] = {10, 20, 30, 40, 50}; // Array with predefined values
```
