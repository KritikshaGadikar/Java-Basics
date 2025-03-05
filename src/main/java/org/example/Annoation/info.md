# **Annotations in Java**

## **What is an Annotation?**
An **annotation** in Java is a special kind of metadata that provides additional information about the code but does not change its behavior. It is commonly used for configuration, documentation, and code analysis.

---

## **Example of an Annotation**
```java
@Override
public void toString() {
    System.out.println("This method overrides a superclass method.");
}
```

## Common Built-in Java Annotations
- @Override → Ensures a method overrides a superclass method.
- @Deprecated → Marks a method/class as outdated.
- @SuppressWarnings → Suppresses compiler warnings.