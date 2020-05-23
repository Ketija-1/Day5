package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int x = 10;
        int y = 11;
        int z = 12;
        int w = 13;
        int a = 14;
        int b = 15;

        System.out.println("x y"+(x > y));
        System.out.println("z w"+(z > w));
        System.out.println("a b"+(a > b));

        System.out.println("--------------------------------");
        System.out.println("Check || operator OR");
        System.out.println(x < y || z > w);
        System.out.println("--------------------------------");
        System.out.println("Check && operator AND");
        System.out.println("--------------------------------");
        System.out.println(x < y && z > w);
        System.out.println("Check ! operator !");


        boolean checkOperator = false;

        System.out.println(!checkOperator);
        System.out.println("--------------------------------");
        System.out.println("Check != operator NOT equal");

        System.out.println(x != y);

        System.out.println("Check != operator NOT equal");
        System.out.println(x == y);

        if (x < y && z < w && a < b){
            System.out.println("Check if Statement");
        }
        System.out.println("--------------------------------");
        // Or and add else block.
        if ((x > y || z < w) && (x > y || a > b)) {
            System.out.println("Check OR Statement");
        }else{
            System.out.println("Or give value of false");
        }


    }
}
