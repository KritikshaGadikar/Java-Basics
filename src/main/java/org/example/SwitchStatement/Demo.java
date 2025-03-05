package org.example.SwitchStatement;

import java.lang.invoke.SwitchPoint;

public class Demo {
    public static void main(String args[]) {

        int n = 1;
        //old version
//        switch (n) {
//            case 1:
//                System.out.println("Mon");
//                break;
//            case 2:
//                System.out.println("tue");
//                break;
//            case 3:
//                System.out.println("wed");
//                break;
//            default:
//                System.out.println("any");
//        }
//    }
                         // this is new switch introduce in java so it will save the time and even the lines of code is less
     switch(n) {
        case 1 -> System.out.println("Mon");
        case 2 -> System.out.println("tue");
        case 3 -> System.out.println("wed");
        default -> System.out.println("any");
    }
  }
}
