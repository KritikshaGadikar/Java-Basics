package org.example.ArrayObject;

class Student {
    String name;
    String marks;
}


public class Demo {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "kittu";
        s1.marks = "1";

        Student s2 = new Student();
        s2.name = "krisha";
        s2.marks = "2";

        Student s3 = new Student();
        s3.name = "harshu";
        s3.marks = "3";

        //here we will create array of object

        Student Students[] = new Student[3];
        Students[0] = s1;
        Students[1] = s2;
        Students[2] = s3;

        for (int i = 0; i < Students.length; i++) {

            System.out.println(Students[i].name + " : " + Students[i].marks);



            // Here in the array we can also use the enhance for loop

//        for (Student stud : Students) {
//            System.out.println(stud.name + " : " + stud.marks);
//        }
        }
    }
}
