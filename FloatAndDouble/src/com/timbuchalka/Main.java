package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue = 5/2;
        float myFloatValue = 5F /3F;
        double myDoubleValue = 5D /3D;

        System.out.println("myIntValue    =" + myIntValue);
        System.out.println("myFloatValue  =" + myFloatValue);
        System.out.println("myDoubleValue =" + myDoubleValue);

        // pounds to kgrs.
        double pounds = 200D;
        double kg_pound = 0.45359237f;
        double kg = pounds * kg_pound;
        System.out.println("pounds:" + pounds + " kg:" + kg);

    }
}
