package org.example.String;
//In Java, a String is an object that represents a sequence of characters

public class Demo1 {
    public static void main(String args[]) {
//        String name = new String("kittu");                   // this is string obj
        String name = "kittu";                                 //This is mostly done we are not refer to do line 5 (behind will also create ]object)
        name = name + " " + "Gadikar";                              // here we're just changing the valve refer for this type.png

        String s1 = "Kriti";
        String s2 = "Kriti";                                    // as we know the 9 and 10 is same right, so not two object is created oly one is create as they have equal string(refer type.png)
        System.out.println(name);
    }
}

// There are two types of String :
//1) Mutable
//2) Immutable

