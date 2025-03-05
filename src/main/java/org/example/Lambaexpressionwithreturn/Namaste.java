package org.example.Lambaexpressionwithreturn;

//A lambda expression in Java is a concise way to write anonymous functions

@FunctionalInterface
interface Hello {

    int add(int i, int j);
}

public class Namaste {
    public static void main(String args[]) {

        Hello h1 = (i,j) -> i+j;                   //no need to write written

         int result = h1.add(2,5);
         System.out.println(result);
    }
}
