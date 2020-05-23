package com.company;

public class WhileLoop {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
        int number = 1;


        while (number <= n){
            // num = 1, 2, 3,..., n for each iteration
            factorial = factorial * number;
            ++number;
            System.out.println(number);

        }
        System.out.println("-----------------------");
        int i = 0;
        while(i <= 5){
            System.out.println(i);
            ++i;

        }
        System.out.println("--------------");
        int a = 1;
        int b = ++a;
        System.out.println(b);
        int c = a++;
        System.out.println(c);
        System.out.println("-------------");
        int sum = 0;
        int upperBound = 10;
        int num = 1;

        while(num <= upperBound) {
            sum = sum +num;
            ++num;

            System.out.println(num);

        }
        System.out.println("Sum of 1 to 10 range " +sum);
        }




    }

