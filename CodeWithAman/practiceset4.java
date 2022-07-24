package com.CodeWithAman;

import java.util.Scanner;

public class practiceset4 {


    public static void main(String[] args) {
        System.out.println("Q1");
        int a = 10;
        if (a == 11) {
            System.out.println("I am 11");
        } else {
            System.out.println("I am not 11");
        }
        System.out.println("\n");


        System.out.println("Q2");
        System.out.println("Finding whether the student pass or fail.");
        float b = 0f;
        Scanner enterNum = new Scanner(System.in);
//        System.out.println("Enter Maximum marks that can be obtained by a subject");
//        int mM = enterNum.nextInt();
//        System.out.println("Enter number of subjects");
//        int nS = enterNum.nextInt();
//
//        System.out.print("Enter marks of 1st subject: ");
//        float marks1 = enterNum.nextInt();
//        float mPer1 = (marks1 / mM) * 100;
//        System.out.println("Percentage of Subject1 is: " + mPer1);
//        if (mPer1 < 33) {
//            System.out.println("failed in this subject");
//        } else {
//            System.out.println("proceed for second subject's marks");
//        }
//        b = (b + marks1);
//
//        System.out.print("Enter marks of 2nd subject: ");
//        float marks2 = enterNum.nextInt();
//        float mPer2 = (marks2 / mM) * 100;
//        System.out.println("Percentage of Subject2 is: " + mPer2);
//        if (mPer2 < 33) {
//            System.out.println("failed in this subject");
//        } else {
//            System.out.println("proceed for third subject's marks");
//        }
//        b = b + marks2;
//
//        System.out.print("Enter marks of 3rd subject: ");
//        float marks3 = enterNum.nextInt();
//        float mPer3 = (marks3 / mM) * 100;
//        System.out.println("Percentage of Subject3 is: " + mPer3);
//        if (mPer3 < 33) {
//
//        System.out.println("failed in this subject");
//        }else {
//            System.out.println("proceed on getting the results");
//        }
//        b= b+marks3;
//
//        System.out.println("Marks obtained: ");
//        System.out.println(b);
//        double per= (b/(mM*nS))*100;
//        System.out.println("Overall percentage is "+ per);
//
////        if(per>=40){
////            if(mPer1>33){
////                 if(mPer2>33){
////                    if (mPer3>33){
////                        System.out.println("Student got Passed");
////                    }
////                }
////            }
////        }else{
////            System.out.println("Student failed!");
////        }
//        if (per>=40 && mPer1>33 && mPer2>33 && mPer3>33){
//            System.out.println("Student is passed!");
//        }else {
//            System.out.println("Student got failed!");
//        }
//
//        System.out.println("\n");
//
//        System.out.println("Q3");
//        System.out.println("Income slab-     \t Tax\nBelow 2.5 lakh   \t No tax\n2.5 lakh - 5 lakh\t " +
//                "5%\n5 lakh - 10 lakh\t 20%\nAbove 10 lakh    \t 30%   \n");
//
//        System.out.print("Enter your annual Income-- ");
//        double inc= enterNum.nextDouble();
//
//        if(inc>1000000) {
//            System.out.println("Sorry! You have to pay 30% Tax.");
//        }
//        else if (inc>=500000){
//            System.out.println("20% tax for you");
//        }
//         else if (inc>=250000){
//            System.out.println("5% tax for you");
//        }
//         else {
//             System.out.println("There is no tax for you. Enjoy!");
//         }
//
//        System.out.println("\n");
//
//        System.out.println("Q4");
//        System.out.println("Enter the number from 1 to 7 to Find the day of the week- ");
//        byte wD= enterNum.nextByte();
//        System.out.println("It's ");
//        switch (wD){
//            case 0:
//                System.out.println("Type a number greater than 0 and less than 7");
//                break;
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Type a number less than 7 and greater than 0.");
//        }
//        System.out.println("\n");

        System.out.println("Q5");
        System.out.print("Enter a year to find weather it is a leap year or not- ");
        int year= enterNum.nextInt();
        double lY= year%4;
        System.out.println(lY);
        double eY= year%100;
        System.out.println(eY);
        double ans=year/100;
        System.out.println(ans);
        double ans1=ans%4;
        System.out.println(ans1);
        double eYC= eY%4;
        System.out.println(eYC);
        if(lY==0 && eY!=0 && eYC==0){
            System.out.println("this is a leap year");
        }else if (lY==0 && eY==0 && ans1==0){
            System.out.println("this is a leap year");
        }else {
            System.out.println("this is not a leap year");
        }
        System.out.println("\n");

        System.out.println("Q6");
        System.out.print("Enter a URL: ");
        String Url = enterNum.next();

        if ( Url.endsWith(".com")){
            System.out.println("this is a commercial site");
        }
        else if (Url.endsWith(".org")){
            System.out.println("This is a organizational site");
        }
        else if (Url.endsWith(".in")){
            System.out.println("This is a indian site");
        }else{
            System.out.println("not a site");
        }















    }
}
