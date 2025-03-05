package org.example.Threads;
//thread class
//here we will use sleep to get the output in parallel

class Aa extends Thread {
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

class Bb extends Thread {
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
public class Sums {
    public static void main(String args[]) {
        Aa obj1 = new Aa();
        Bb obj2 = new Bb();

        obj1.start();
        obj2.start();
    }
}


//now we get in parallel