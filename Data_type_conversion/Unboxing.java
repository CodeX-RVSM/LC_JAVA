package com.linkcode.DataTypeConversion;

public class Unboxing {

    public static void main(String[] args) {

        // unboxing - it is process of converting non primitive datatype to primitive datatype
        // 1. xxxValue() methods
        // 2. automatically - autounboxing

        // byte
        Byte b1 = 1;
        byte b2 = b1.byteValue();   // value method
        byte b3 = b1;               // directly

        // short
        Short s1 = 2;
        short s2 = s1.shortValue();
        short s3 = s1;

        // int
        Integer i1 = 10;
        int i2 = i1.intValue();
        int i3 = i1;

        System.out.println(i2 + 10);
        System.out.println(i3 + 10);

        // long
        Long l1 = 100L;
        long l2 = l1.longValue();
        long l3 = l1;

        // float
        Float f1 = 3.14f;
        float f2 = f1.floatValue();
        float f3 = f1;

        // double
        Double d1 = 5.67;
        double d2 = d1.doubleValue();
        double d3 = d1;

        System.out.println(d2 + 10);
        System.out.println(d3 + 10);

        // char
        Character c1 = 'A';
        char c2 = c1.charValue();
        char c3 = c1;

        System.out.println(c2 + " BC");

        // boolean
        Boolean bl1 = true;
        boolean bl2 = bl1.booleanValue();
        boolean bl3 = bl1;

        System.out.println(bl2 + " value");
    }
}
