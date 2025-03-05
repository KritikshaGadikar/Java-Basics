### Differences Between Collection, Collections, and Collection API

| **Term**           **| **Description**                                |
|--------------------|------------------------------------------------|
| **Collections**    | It is a class and have mutiple methods to work |
| **Collection**     | taking about interfaces                        |
| **Collection API** | Refers to the entire concept**                   |




### Types of Collections

Here are the primary types of collections based on their characteristics:

#### **List** (Ordered, Allows Duplicates):
- **Implementations**: `ArrayList`, `LinkedList`, `Vector`, `Stack`.
- **Example**: `[A, B, C, A]`

#### **Set** (Unique Elements, Unordered):
- **Implementations**: `HashSet`, `LinkedHashSet`, `TreeSet`.
- **Example**: `{A, B, C}`

#### **Queue** (FIFO Order):
- **Implementations**: `PriorityQueue`, `LinkedList` (as a Queue), `Deque` (Double-ended Queue).
- **Example**: `A -> B -> C`

#### **Map** (Key-Value Pairs, Unique Keys):
- **Implementations**: `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable`.
- **Example**: `{key1: value1, key2: value2}`




#### **List** (Ordered, Allows Duplicates):
- **Implementations**: `ArrayList`, `LinkedList`, `Vector`, `Stack`.
- **Example**:
  ```java
  List<String> list = new ArrayList<>();
  list.add("A");
  list.add("B");
  list.add("C");
  list.add("A");
  System.out.println(list); // Output: [A, B, C, A]
  ```

#### **Set** (Unique Elements, Unordered):
- **Implementations**: `HashSet`, `LinkedHashSet`, `TreeSet`.
- **Example**:
  ```java
  Set<String> set = new HashSet<>();
  set.add("A");
  set.add("B");
  set.add("C");
  set.add("A");
  System.out.println(set); // Output: [A, B, C] (order may vary)
  ```

#### **Queue** (FIFO Order):
- **Implementations**: `PriorityQueue`, `LinkedList` (as a Queue), `Deque` (Double-ended Queue).
- **Example**:
  ```java
  Queue<String> queue = new LinkedList<>();
  queue.add("A");
  queue.add("B");
  queue.add("C");
  System.out.println(queue); // Output: [A, B, C]
  System.out.println(queue.poll()); // Output: A (removes the head of the queue)
  ```

#### **Map** (Key-Value Pairs, Unique Keys):
- **Implementations**: `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable`.
- **Example**:
  ```java
  Map<String, String> map = new HashMap<>();                  // in place of second map (pink) we cn put anything like student so in next line it will ne student.put.....
  map.put("key1", "value1");
  map.put("key2", "value2");
  map.put("key1", "value3");
  System.out.println(map); // Output: {key1=value3, key2=value2}
  ```
