package com.CodeWithAman;

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
//        for (int i=1; i<=10; i++){
//            System.out.println(i);
//        }
//        System.out.println("Out of for loop");
//        for (int o=1;o<100;o+=2){
//            System.out.println(o);
//        }
        System.out.println("Enter the number for odd number");
        int i = 5;
        for (int n=0;n<i;n++){
            System.out.println((2*n)+1);
        }
        for (int d=5;d!=0;d--){
            System.out.println(d);
        }
        for (int nn= 100000;nn!=0;nn-=10000){
            System.out.println(nn);
        }
    }
}
