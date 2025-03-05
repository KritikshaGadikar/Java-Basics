package org.example.Loops;

// we are here learning for loop
public class Demo3 {
//    public static void main(String args[]) {
//        for (int i=1;i<5;i++)
//        {
//            System.out.println(i);
//        }
//    }


    // here we are doing nested for loop

    public static void main(String args[]) {
        for (int i=1;i<5;i++)
        {
            System.out.println("Day" +1);

            for (int j=1; j<=9;j++)
            {
                System.out.println(" " + (j+8) + " - " + (j+9));
            }
        }
    }
}
