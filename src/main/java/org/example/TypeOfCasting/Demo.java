package org.example.TypeOfCasting;


//Upcasting: Converting a child class reference to a parent class reference (implicit).
//Downcasting: Converting a parent class reference back to a child class reference (explicit).


class A {
    public void show() {
        System.out.println("Hello");
    }
}

class B extends A {
    public void info() {
        System.out.println("Namaste");
    }
}

public class Demo {
    public static void main(String args[]) {

        A a1 = (A) new B();                        //upcasting , sending child one but casting with parent class       here (A) is not necessary to write it is happening implicit behind the seen
        a1.show();

        B a2= (B) a1;                               //downcasting
        a2.info();
    }
}
