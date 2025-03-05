package org.example.Enum;
// here we have learned what is enum
//An enum (enumeration) is a special data type that defines a set of named constant values.

enum status{
    running, completed, success;
}

public class Demo {
    public static void main(String args[]) {
        status[] s1 = status.values();                                         // when we want all values
         for (status s : s1) {                                          //used ehance for loop here
             System.out.println(s + " : " + s.ordinal());               //ordinal means in order
         }
    }
}
