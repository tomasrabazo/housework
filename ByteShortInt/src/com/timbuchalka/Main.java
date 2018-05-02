package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	    // byte: 8 bits
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue:" + myNewByteValue);

        // short: 16 bits
        short myShortValue = 32767;
        short myNewShortValue = (short)(myShortValue/2);
        System.out.println("myNewShortValue:" + myNewShortValue);

        // int: 32 bits
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal:" + myNewShortValue);

        // long: 64 bits
        long myLongValue = 9_223_372_036_854_775_807L;

        //float: 32 bits.
        float myfloatValue = 3.23123F;

        //double: 64 bits.
        double mydoubleValue = 3.23123;

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * ((long) byteValue + (long)shortValue + (long)intValue);
        short shortTotal = (short)(1000 + 10L * ((long) byteValue + (long)shortValue + (long)intValue));
        System.out.println("longTotal:" + longTotal);
        System.out.println("shortTotal:" + shortTotal);
    }
}
