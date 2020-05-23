package com.company;

public class ArrayTest {

    public static void main(String[] args) {

        int[] arrayOfInts = new int[6];
        // assign values to array index
        arrayOfInts[0] = 20;
        arrayOfInts[1] = -23;
        arrayOfInts[2] = 9000;

        System.out.println("Index of 0 value is "+arrayOfInts[0]);
        System.out.println("Index of 1 value is "+arrayOfInts[1]);
        System.out.println("Index of 2 value is "+arrayOfInts[2]);

        int[] arrayOfValues = {2, 3, 10, 50, 200};
        // get 3 element value on terminal

        System.out.println(arrayOfValues[2]);

        System.out.println(arrayOfValues[4]+arrayOfValues[9]);

        //System.out.println(arrayOfValues.length[9]);

        //System.out.println("Length of arrayOfValues is: "(arrayOfValues.length[4]));

        // last element print on screen

        System.out.println(arrayOfValues.length-1);

        System.out.println(arrayOfValues[4]);

        int getLengthOfArrayLastIndex = arrayOfValues.length-1;

        System.out.println(arrayOfValues[getLengthOfArrayLastIndex]);
        System.out.println(arrayOfValues[arrayOfValues.length-1]);



    }
}
