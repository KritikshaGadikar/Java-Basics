package org.example.Threads;
//thread class
class A extends Thread {                                                 // here we extend threads then only it is declared as a thread okay
    public void run() {                                                  // and in method we will need only run method
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello");
        }
    }
}
public class Sum {
    public static void main(String args[]) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();                  // here we need the start not the show okay, in thread
        obj2.start();
    }
}


// here we are getting the hi hi hello ...but not in parallel like hi hello hi hello so here we will use sleep okay, so this i will differnt class
