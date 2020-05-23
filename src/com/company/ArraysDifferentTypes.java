package com.company;

import java.util.Arrays;

public class ArraysDifferentTypes {

    public static void main(String[] args) {

        String[] arrayOfString = new String[2];

        arrayOfString[0] = "Ketija";
        arrayOfString[1] = "Kalnina";


        System.out.println(Arrays.toString(arrayOfString));
        System.out.println(Arrays.toString(arrayOfString));
        System.out.println(Arrays.toString(arrayOfString));
        long[] longArr = new long[2];
        longArr[0] = 900000001;
        System.out.println(Arrays.toString(longArr));
        //double[]
        //char[]
        //boolean[] booleans = {true, false}


    }
}
