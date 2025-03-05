package org.example.Threads;
//Implementing the `Runnable` interface


class Aaa implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Bbb implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Hello {
    public static void main(String args[]) {
        Runnable obj1 = new Aaa();             //use runnable here
        Runnable obj2 = new Bbb();

        Thread t1 = new Thread(obj1);        // create thread here
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}