package com.company;

public class ForLoop {

    public static void main(String[] args) {
        int[] arras = {3, 4, 50};
        for(int i = 10; i >= 5; i--){
            System.out.println("Index value is: "+1);
        }

        System.out.println("-----------------------");

        for(int i = 0; i < arras.length; i++){
            System.out.println(arras[i]);
        }
        System.out.print("[");
        for(int i = 0; i < arras.length; i++){
            System.out.print(arras[i]+",");
        }
        System.out.println("]");

    }
}
