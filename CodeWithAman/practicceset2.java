package com.CodeWithAman;

import java.net.FileNameMap;
import java.util.Scanner;



public class practicceset2 {
    public static void main(String[] args) {
        System.out.println("Q1");
        float   a= 7/4.0f*9/2.0f;
        System.out.println(a);
        System.out.println("\n\n\n");

//        System.out.println("Q2");
//        System.out.println("Original no ");
           Scanner ori = new Scanner(System.in);
//        int Orinum = ori.nextInt();
//        System.out.println("Encrypted Grade");
//        System.out.println(Orinum+8);

        System.out.println("Q2-B");
        char grade='B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        //Decrypting te grade
        grade = (char)(grade - 8);
        System.out.println(grade);
        System.out.println("\n\n\n");

        System.out.println("Q3");
//        int GN= 44;
//        System.out.println("Enter number for comparing with the given number:");
        int en=ori.nextInt();
//        if (GN<=en){
//            System.out.println(false + " The given number is smaller");
//        }
//        else {
//            System.out.println(true + " The given number is greater");
//        }
        System.out.println(en<44);
        System.out.println("\n\n");

        System.out.println("Q4");
        float v=2;
        float u=4;
        float s=2;
        float d= 7;
        double num = ((v*v-u*u)/(2*d*s));
        System.out.println(num);
        System.out.println("\n\n");

        System.out.println("Q5");
        int X=7;
        int A=X*(X*X)/X+(5*X)/X;
        System.out.println(A);




    }
}
