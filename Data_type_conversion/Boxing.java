package com.linkcode.DataTypeConversion;

public class Boxing {

    public static void main(String[] args) {

        // boxing - it is process of converting primitive datatype to non primitive datatype
        // 1. valueOf
        // 2. automatically - autoboxing

        // byte
        byte b = 1;
        Byte b1 = Byte.valueOf(b);
        Byte b2 = b;

        // short
        short s = 2;
        Short s1 = Short.valueOf(s);
        Short s2 = s;

        // int
        int a = 10;
        Integer i1 = Integer.valueOf(a);
        Integer i2 = a;

        System.out.println(a + 10);
        System.out.println(i1.toString() + 10);
        System.out.println(i2.toString() + 10);

        // long
        long l = 100L;
        Long l1 = Long.valueOf(l);
        Long l2 = l;

        // float
        float f = 3.14f;
        Float f1 = Float.valueOf(f);
        Float f2 = f;

        // double
        double d = 5.67;
        Double d1 = Double.valueOf(d);
        Double d2 = d;

        System.out.println(d + 10);
        System.out.println(d1.toString() + 10);

        // char
        char c = 'A';
        Character c1 = Character.valueOf(c);
        Character c2 = c;

        System.out.println(c1.toString() + " BC");

        // boolean
        boolean flag = true;
        Boolean bl1 = Boolean.valueOf(flag);
        Boolean bl2 = flag;

        System.out.println(bl1.toString() + " value");
    }
}
