package org.example.AbstractAnnoymousClass;

abstract class A {
    public void show() {
        System.out.println("hello");
    }
}

public class Demo {
    public static void main(String args[]) {
        A obj = new A() {
            public void show() {
                System.out.println("hi");
            }
        };
        obj.show();
    }
}
