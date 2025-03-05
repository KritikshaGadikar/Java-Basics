# Multidimensional Arrays in Java

## **What is a Multidimensional Array?**
A **multidimensional array** in Java is an array of arrays. It allows you to store data in a tabular or matrix format, where each element of the array is itself an array. The most common type of multidimensional array is a **2D array**, but Java supports arrays with more than two dimensions as well.

---

## **Declaration and Initialization**

### **Declaration**
Syntax:
```java
dataType[][] arrayName;
```
For more than two dimensions:
```java
dataType[][][] arrayName; // 3D array
```

### **Initialization**
1. **Using the `new` keyword:**
   ```java
   int matrix[][] = new int[3][4]; // A 2D array with 3 rows and 4 columns
   ```
   All elements are initialized to default values (`0` for `int`).

2. **Using direct assignment:**
   ```java
   int matrix[][] = {
       {1, 2, 3, 4},
       {5, 6, 7, 8},
       {9, 10, 11, 12}
   };
   ```

---

## **Accessing Elements**
You can access elements of a multidimensional array using row and column indices.

Example:
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

System.out.println(matrix[1][2]); // Output: 6
```

---

## **Jagged Arrays**
Java allows creating arrays with variable column sizes (jagged arrays).

Example:
```java
int jaggedArray[][] = new int[3][];
jaggedArray[0] = new int[2]; // First row has 2 columns
jaggedArray[1] = new int[4]; // Second row has 4 columns
jaggedArray[2] = new int[3]; // Third row has 3 columns
```


### **Example:**
```java
int[][] jaggedArray = new int[3][];
jaggedArray[0] = new int[2]; // First row has 2 columns
jaggedArray[1] = new int[4]; // Second row has 4 columns
jaggedArray[2] = new int[3]; // Third row has 3 columns

// Assigning values
jaggedArray[0][0] = 1;
jaggedArray[0][1] = 2;
jaggedArray[1][0] = 3;
jaggedArray[1][1] = 4;
jaggedArray[1][2] = 5;
jaggedArray[1][3] = 6;
jaggedArray[2][0] = 7;
jaggedArray[2][1] = 8;
jaggedArray[2][2] = 9;

// Printing the jagged array
for (int i = 0; i < jaggedArray.length; i++) {
    for (int j = 0; j < jaggedArray[i].length; j++) {
        System.out.print(jaggedArray[i][j] + " ");
    }
    System.out.println();
}
```
Output:
```
1 2 
3 4 5 6 
7 8 9 
```

## **Three-Dimensional Arrays**
A **3D array** adds another dimension to the array, effectively creating a "cube" of data.

### **Declaration and Initialization**
```java
int threeDArray[][][] = new int[2][3][4]; // 2 blocks, each with 3 rows and 4 columns
```