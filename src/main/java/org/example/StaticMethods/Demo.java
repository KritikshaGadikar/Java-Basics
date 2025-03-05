package org.example.StaticMethods;


class Mobile {
    String brand;
    int price;
    static String name;                                         //static variable

//    public void show() {
//        System.out.println(brand + " " + price + " " +name);
//    }

    public static void show1(Mobile m1) {                                //static method
        System.out.println(m1.brand + " " + m1.price + " " +name);     // here if we take the static variable  we will not get error so here we have to declared obj
    }
}
public class Demo {
    public static void main(String args[]) {
        Mobile m1 = new Mobile();
        m1.brand = "mi";
        m1.price = 15000;
        m1.name = "smart";


        Mobile.show1(m1);                  //here we can call static method directly with the class name , as we have 2 mobile so we have declared it
    }
}
