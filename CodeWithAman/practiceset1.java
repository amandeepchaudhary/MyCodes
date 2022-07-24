package com.CodeWithAman;

import javax.sound.midi.Soundbank;
import java.nio.channels.FileLock;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class practiceset1 {

    public static void main(String[] args) {
        System.out.println("Q1");
        Scanner add = new Scanner(System.in);
        System.out.println("Adding three nos. taken from user:");
        System.out.println("Enter the first number:");
        float num1=add.nextFloat();
        System.out.println("Enter the second number:");
        float num2=add.nextFloat();
        System.out.println("Enter the third number:");
        float num3=add.nextFloat();
        System.out.print("So,The Addition is:" );
        System.out.println (num1 + num2 + num3);

        System.out.println("\n\n\n");

        System.out.println("Q2");
        System.out.println("Enter marks of three subjects: ");

        System.out.print("English:");
        float E=add.nextFloat();
        if (E<=100){
            System.out.println("Enter Second subject's marks");
        }
         else{
                System.out.println("Wrong marks");
                System.exit(1);
            }


        System.out.print("Hindi:");
        float H=add.nextFloat();
        if (H<=100){
            System.out.println("Enter Third subject's marks");
        }
        else {
            System.out.println("Wrong marks");
            System.exit(1);
        }

        System.out.print("Maths:");
        float M=add.nextFloat();
        if (M<=100){
                System.out.print("Giving CGPA of three subject's marks:");
            }
            else {
            System.out.println("Wrong marks");
            System.exit(1);
        }
            double cgpa= ((((E+H+M)/300)*100)/9.5);
            System.out.println(cgpa);
            System.out.println("\n\n\n");



        System.out.println("Q3");
        System.out.println("Enter Your Name");
        Scanner name = new Scanner(System.in);
        String Name = name.nextLine();
        System.out.print("Hello"+ Name + " Have a good day ");
        System.out.println("\n\n\n\n\n");

        System.out.println("Q4");
        System.out.println("Enter KM's");
        double km = name.nextDouble();
        System.out.print("KM to mile is: ");
        System.out.println(km*0.621);
        System.out.println("\n\n\n");


        System.out.println("Q5");
        System.out.println("Detecting whether a number is int or not: ");
        boolean b1= name.hasNextInt();
        System.out.println(b1);
        


    }
}
