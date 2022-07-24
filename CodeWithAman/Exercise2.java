package com.CodeWithAman;

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome To Rock Paper Scissors Game!!!!!");
        System.out.println("paper=0\nrock=1\nscissors=2\n");
        System.out.println("Enter no. from 0 t0 2");
        int times=0;
        do {
            int num = sc.nextInt();
            times++;


        if(num>2 || 0>num){
            System.out.println("Enter a correct Hand!!!!");
            System.exit(1);
        }
        Random rm= new Random();
        int min=0;
        int max=2;
        int numC= (int) Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(numC);
        if (num==0 && numC==0){
                System.out.println("draw");
        }
        if(num==0 && numC==1){
                System.out.println("You win");
        }
        if(num==0 && numC==2){
            System.out.println("com wins");
        }
        if(num==1 && numC==0){
            System.out.println("com wins");
        }
        if(num==1 && numC==1){
            System.out.println("draw");
        }
        if(num==1&&numC==2){
            System.out.println("you win");
        }
        if(num==2 && numC==0){
            System.out.println("you win");
        }
        if(num==2 && numC==1){
            System.out.println("com wins");
        }
        if(num==2 && numC==2){
            System.out.println("draw");
        }
        if(numC>2 || numC<0){
            System.out.println("wrong from comp");
        }

//
//
//
//
//
//
//
//
//
//
//        if(num==0 && numC>=0 && numC==2){
//            System.out.println("Computer wins");
//        }else if(num==1 && numC<1 )
//        if(numC > num){
//            System.out.println("You win");
//        }else if(num==numC){
//            System.out.println("Draw");
//        }else if(numC<num){
//            System.out.println("com wins");
//        }
        }while(times<5);

    }
}
