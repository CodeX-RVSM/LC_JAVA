package com.linkcode.DataTypeConversion;

public class Parsing {

    public static void main(String[] args) {

        // parsing - it is process of converting String datatype to primitive datatype
        // 1. parseXxx() methods

        // byte
        String b = "1";
        byte b1 = Byte.parseByte(b);

        // short
        String s = "2";
        short s1 = Short.parseShort(s);

        // int
        String a = "10";
        int i1 = Integer.parseInt(a);

        System.out.println(i1 + 10);

        // long
        String l = "100";
        long l1 = Long.parseLong(l);

        // float
        String f = "3.14";
        float f1 = Float.parseFloat(f);

        // double
        String d = "5.67";
        double d1 = Double.parseDouble(d);

        System.out.println(d1 + 10);

        // boolean
        String flag = "true";
        boolean bl1 = Boolean.parseBoolean(flag);

        System.out.println(bl1 + " value");

        // char (special case ⚠️)
        String c = "A";
        char c1 = c.charAt(0);

        System.out.println(c1 + " BC");
    }
}
