package org.example.ConverstionAndCasting;

// casting is done here , and we do it explicityly

public class casting {

    public static void main(String args[]) {

        int a = 257;
        byte b = (byte) a;              // remove byte from this line automatic error will come so it indicate it cant convert but now it works

        float f = 5.6f;
        int t = (int) f;                // remove int --------------------------------

        System.out.println(t);
//        System.out.println(b);
    }
}
