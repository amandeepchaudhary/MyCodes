package com.CodeWithAman;

import java.util.Scanner;

import static java.lang.System.exit;

public class percentageofstudentEx1 {

    public static void main(String[] args) {

        Scanner marks = new Scanner(System.in);
        System.out.println("Enter the marks obtained by student in all subjects in CBSE board exam- ");

        System.out.print("English: ");
        int e = marks.nextInt();
        if (e <= 100) {
            System.out.println("Proceed to the marks of next subject");
        } else {
            System.out.println("Wrong input of marks");
            System.out.println("Percentage can't be calculated");
            exit(1);
        }


        System.out.print("Maths: ");
        int m = marks.nextInt();
        if (m <= 100) {
            System.out.println("Proceed to the marks of next subject");
        } else {
            System.out.println("Wrong input of marks");
            System.out.println("Percentage can't be calculated");
            exit(1);
        }

        System.out.print("Science: ");
        int s = marks.nextInt();
        if (s <= 100) {
            System.out.println("Proceed to the marks of next subject");
        } else {
            System.out.println("Wrong input of marks");
            System.out.println("Percentage can't be calculated");
            exit(1);
        }

        System.out.print("Social Science: ");
        int ss = marks.nextInt();
        if (ss <= 100) {
            System.out.println("Proceed to the marks of next subject");
        } else {
            System.out.println("Wrong input of marks");
            System.out.println("Percentage can't be calculated");
            exit(1);
        }

        System.out.print("Hindi: ");
        int h = marks.nextInt();
        if (h <= 100) {
            System.out.println();
        } else {
            System.out.println("Wrong input of marks");
            System.out.println("Percentage can't be calculated");
            exit(1);
        }
        float marksobtained = (e + m + s + ss + h);

        System.out.println("Marks obtained by the students: ");
        System.out.println(marksobtained);
        System.out.println("Total maximum Marks:");
        System.out.println("500");
        System.out.print("The Percentage of Student= ");
        float Percentage = ((marksobtained / 500) * 100);
        System.out.print(Percentage);
        System.out.println("%");


    }

}
