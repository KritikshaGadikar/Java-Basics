package org.example.sealedClass;

sealed class A permits B,C {                                     // here we can also use final but if we use final we can not exend anything but here using sealed we can permit what we want

}

non-sealed class B extends A {                              // if here we're extending the A sealed class so here we need to give final, sealed, or non-sealed then only it will work, but now we change to non sealed because it is extended by D

}

final class C extends A {                            // if......

}

class D extends B {

}



sealed interface X permits Y {

}

non-sealed interface Y extends X {                       //but here we only two option as sealed and non-sealed as interface does not have final

}

public class demo {
    public static void main(String args[]) {

    }
}
