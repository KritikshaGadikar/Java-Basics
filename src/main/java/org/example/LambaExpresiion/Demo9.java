package org.example.LambaExpresiion;

// lambda expression only work with functional interface

@FunctionalInterface
interface A {
    void show(int i);
}

public class Demo9 {
    public static void main(String args[]) {

        A obj = i -> System.out.println("in show " + i);        //lambda expression

        obj.show(5);
    }
}
