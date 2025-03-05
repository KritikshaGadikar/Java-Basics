package org.example.Exception;

//try-catch

public class Demo {
    public static void main (String args[]) {
        int i = 0;                  //normal statement
        int j = 0;

         try {
             j = 18/i;                //critical statement
         } catch (Exception e) {
             System.out.println("wrong");
         }
    }
}
