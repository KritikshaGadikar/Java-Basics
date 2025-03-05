package org.example.LogicalOperator;

public class Demo {

    public static void main(String args[]) {

        int a = 5;
        int b = 8;
        int p = 9;
        int q = 6;

        boolean result = a > b && p < q ;           // and
        boolean result1 = a > b || p > q ;          //  or

        System.out.println(result);
        System.out.println(result1);


        boolean result3 = a > b;

        System.out.println(!result3);                 //not
    }
}
