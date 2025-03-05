package org.example.Array;

public class Demo1 {
    public static void main(String args[]) {

        int num[] = new int [4];    //Using the `new` keyword      // indexing start with 0......
        num[0] = 3;
        num[1] = 4;
        num[2] = 6;
        num[3] = 8;

//        System.out.println(num[0]);     //instead of this writing multiple times we can use for loop see down
//        System.out.println(num[1]);
//        System.out.println(num[2]);
//        System.out.println(num[3]);

        for(int i=0;i<4;i++){             //for loop
           System.out.println(num[i]);
        }
    }
}
