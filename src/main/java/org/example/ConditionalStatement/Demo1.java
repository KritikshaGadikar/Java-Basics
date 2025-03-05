package org.example.ConditionalStatement;

//if else-if
public class Demo1 {

    public static void main(String args[]) {
         int a = 3;
         int b = 6;
         int c = 7;

         if(a>b && a>c)    //false
             System.out.println(a);
         else if (b>c)       //false
             System.out.println(b);
         else
             System.out.println(c);
    }
}
