package org.example.MethodOverriding;


class A {
    public void show() {
        System.out.println("Hello");
    }
}

class B extends A {                                 // this is called overriding okay, as we have parent class and same method but for child we want same method but with different result so ....
    public void show() {
        System.out.println("namaste");
    }
}

public class Demo {
    public static void main(String args[]) {
        A b1 = new B();
        b1.show();
    }
}
