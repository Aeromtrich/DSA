package com.data.oop;

public class A {

    private static String name;
    static {
        System.out.println("A");
        name = "Tom";
    }

    public static void main(String[] args) {
        System.out.println("hello");
        A a1 = new A();
        A a2 = new A();

        System.out.println(a1.name);
        System.out.println(a2.name);
    }
}

