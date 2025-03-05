package org.example.Enum;

enum status1{
    running, completed, success;
}
public class Demo1 {
    public static void main(String args[]) {
        status1 s1 = status1.success;

            switch(s1) {                                      //advance switch case
                case running -> System.out.println("it is going on");
                case completed -> System.out.println("ist is done");
                case success ->  System.out.println("finally");
            }
        }
    }