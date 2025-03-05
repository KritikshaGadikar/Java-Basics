package org.example.AnonymousInnerClass;

class A {
    public void show() {
        System.out.println("Hello");
    }
}

//class B {                                                       here we are doing overriding , but with the new topic we have directly decreed new thing in main class only called as antonymous inner class
//    public void show() {
//        System.out.println("hi");
//    }
//}
public class Demo {
    public static void main(String args[]) {
        A a1 = new A(){
            public void show() {
                System.out.println("Hi");
            }
        };
        a1.show();
    }
}
