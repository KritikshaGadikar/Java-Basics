package org.example.Methods;

class student {
    String name;

    public void getInfo() {           //here we void and in oops also we have use void, but we can also use string , and we are using below see it
        System.out.println("hello");
    }

    public String getMeARoll(int roll) {
        return "roll";                           //here we are using string
    }
}

    public class Demo {
        public static void main(String args[]) {
            student s1 = new student();
            s1.getInfo();
            String str = s1.getMeARoll(44);
            System.out.println(str);
        }
    }
