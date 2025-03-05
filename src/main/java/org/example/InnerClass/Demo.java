package org.example.InnerClass;

class A {
    int age;

     public void show() {
         System.out.println("hi");
     }

     static class B {                                // inner class (we can make static or not depends on us)  and static is only for inner class not the main class
         public void info() {
             System.out.println("Namste");
         }
     }
}
public class Demo {
    public static void main(String args[]) {
        A obj = new A();
        obj.show();

        A.B obj1 = new A.B();
        obj1.info();
    }
}
