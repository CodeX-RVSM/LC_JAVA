package com.linkcode.inheritance;

public class B {

    static int b;

    public static void test1() {
        System.out.println("Test method of b");
    }

    static {
        b = 40;
        System.out.println("Static block of B");
        System.out.println(b);
    }
}
