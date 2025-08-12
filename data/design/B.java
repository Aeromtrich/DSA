package com.data.design;

public class B {

    private static B instance ;

    private B() {

    }

    public static B getInstance() {
        if (instance == null) {
            instance = new B();
        }
        return instance;

    }
}
