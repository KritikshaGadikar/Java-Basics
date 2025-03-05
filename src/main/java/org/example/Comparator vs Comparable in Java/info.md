### Key Differences Between Comparable and Comparator

| **Aspect**      | **Comparable**                                   | **Comparator**                                   |
|------------------|-------------------------------------------------|-------------------------------------------------|
| **Interface**   | `java.lang.Comparable`                          | `java.util.Comparator`                          |
| **Method**      | `compareTo(Object o)`                           | `compare(Object o1, Object o2)`                |
| **Implementation** | Inside the class of the object being compared. | In a separate class or using a lambda.         |
| **Sort Order**  | Defines a single natural order.                 | Allows multiple custom orders.                 |
| **Example**     | Sorting by a natural field like ID.             | Sorting by custom fields like name or date.    |