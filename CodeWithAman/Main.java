package com.CodeWithAman;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    static int sum(int q, int w){
        return q+w;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        /* Variables
         Just like:
            -Water - Bucket
            -Masala - Box
            -Lunch - LunchBox
         In java:
            -Variables are containers which stores data values
            -string=Text, int=numbers, float=point numbers, char=one character in single quote, boolean= t/f
            -How to Declare variables:
            -Syntax - <dataType> <variableName> = <value>;
       */
    String name = "Aman";
    System.out.println(name);

    int a = 45, x=655, y=6777;
    float b = 45.22f;
    boolean isAdult = false;
        System.out.println(y);
        System.out.println(b);
        System.out.println(isAdult);
    /*
    Rules for constructing names for variables in java
        1.Can contain digits, underscores, dollar_signs, letters
        2.Should begin with a letter,$ or _
        3.Java is case-sensitive language which means that
            harry and Harry are two different variables altogether
        4.should not contain whitespaces
        5. you cannot use reserved keywords from Java
     */

        /*
        Two types of Java data types:
            1.Primitive - Specified Size = Integer (byte(1 byte= 1 character ke space ko 1 Byte = 8 Bit) can store
                                           from -128 to 127, short(2 bytes), int(4 bytes), long(8 bytes)),
                                           Point (float(4 byte), double(8 bytes)),T/F (boolean(1 Bit)), char(2 bytes),
            2.Non-Primitive or Reference data Type(Objects) - Size same which is equal to object size - Hume banana hai
         */
    byte u = 51;
    double d = 64.87239874878937489d;
    System.out.println(u);
    System.out.println(d);
    char Grade = 'A';
        System.out.println(Grade);

    /* Operators in java

        Operand, Operator, Operand = Result
        4           +           7  = 11

        Types of Operators in Java:
        1.Arithmetic Operators= +, -, *, /, %
        2.Assignment Operators =values assign =
        3.Logical Operators
        4.Comparison Operator

     */
    int num1 = 43, num2 =88;
    num1 +=34;
    num1 -=23;
    num2 -=8;
    // Explore thes operators - *=, /=, %=
        System.out.print("The value of num1 + num2 is ");
        System.out.println(num1 + num2);

        System.out.print("The value of num2 - num1 is ");
        System.out.println(num2 - num1);

        System.out.print("The value of num2 * num1 is ");
        System.out.println(num2 * num1);

        System.out.print("The value of num2 / num1 is ");
        System.out.println(num2 / num1);

        System.out.print("The value of num1 % num2 is ");
        System.out.println(num1 % num2);
        System.out.println(num2++);
        System.out.println(num2-=11);
        System.out.println(++num2);
        System.out.println(++num1);
        System.out.println(num1--);
        System.out.println(--num1);

    /*
    Comparison Operator
    1. == - checks for equality of two values
    2. != - checks if two values are not equal
    3. <
    4. >
    5. <=
    6. >=
     */

    /*
    * Logical Operators:
    * 1. && - Logical and Operator - returns true only if both conditions are true
    * 2. || - Logical or operator - returns true if any one of the condition is true
    * 3. ! - Logical not - Reverse the result from true to false and vice versa
    * */

    // Taking user input in Java
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Company's age:");
        int age = scan.nextInt();
        System.out.println(age +=15 );
        System.out.println(age);

        // String:
        String NAME = "Aaman";
        String Laptop = "amans_Lenovo";
        System.out.println(NAME.length());
        System.out.println(NAME.toUpperCase());
        System.out.println(NAME.toLowerCase());

        // Escape sequence character in String:
        System.out.println(NAME + " is using " + Laptop);
        System.out.println(NAME + " is using\" " + Laptop);
        System.out.println(NAME + " is using\\ " + Laptop);
        System.out.println(NAME + " is using\t " + Laptop);
        System.out.println(NAME + " is using\n " + Laptop);
        System.out.println(NAME + " is using\r " + Laptop);

        System.out.println(NAME.contains("Ama"));
        System.out.println(NAME.charAt(3));
        System.out.println(NAME.endsWith("an"));
        System.out.println(NAME.indexOf("man"));

        int numb1 = 12, numb2 = 24;
        System.out.println(Math.max(numb1, numb2));
        System.out.println(Math.min(numb1, numb2));
        System.out.println(Math.sqrt(36)); // square root
        System.out.println(Math.abs(-36)); //gives positive
        System.out.println(Math.random()); // gives a random no. btw 0 and 1
        System.out.println(4+(8-4)*Math.random());
        System.out.println(4+(8-4)*Math.random());
        System.out.println(4+(8-4)*Math.random());
        System.out.println(4+(8-4)*Math.random());

    // If-Else conditionals
        if (age>18){
            System.out.println("You are an adult");
        }
            else if (age>=16){
            System.out.println("you are not an kid");
        }
            else{
            System.out.println("you are a kid");
        }

            if (true){
            System.out.println("You are an adult");
        }
            if (age>=16){
                System.out.println("You are moving towards adulthod");
            }

    // Switch statement in Java
        switch (age){
            case 12:
                System.out.println("you are 12 years old");
                break;
            case 56:
                System.out.println("you are 56 years old");
                break;
            case 16:
                System.out.println("you are 16 years old");
                break;
            default:
                System.out.println("you did not match any of the cases");
        }
    // Quick Quiz: print sun to sat based on numbers 1 to 7 typed by the user by switch case
        Scanner week = new Scanner(System.in);
        System.out.println("Enter the day number from 1 to 7:");
        int daynumb = week.nextInt();

        switch (daynumb){
            case 1:
                System.out.println("Today is Sunday");
                System.out.println("Have a nice day");
                break;
            case 2:
                System.out.println("Today is Monday");
                System.out.println("Have a nice day");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                System.out.println("Have a nice day");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                System.out.println("Have a nice day");
                break;
            case 5:
                System.out.println("Today is Thursday");
                System.out.println("Have a nice day");
                break;
            case 6:
                System.out.println("Today is Friday");
                System.out.println("Have a nice day");
                break;
            case 7:
                System.out.println("Today is Saturday");
                System.out.println("Have a nice day");
                break;
            default:
                System.out.println("You have entered the Wrong Day number.");

        }

    //Loops
        /*
        while loop
        while(condition){
                // This code will keep executing until condition is true
            }
         */
        int i=0;
        while (i<100){
            System.out.println(i);
            i += 1;
        }

        /* Do while loop
        do{
            // This code will keep executing until condition is true
        }while(condition)
         */
        int j=0;
        do {
            System.out.println(j);
            j += 1;
        }while (j>100);


        /* For loop
        For(st1;st2;st3){
            //code to be executed
        }
         */

        for (int k=0;k<10;k++) {
            if (k == 2) {
                continue;
            }
//            else {
//
//            System.out.println(k);
//        }
            System.out.println(k);

        }


        // Java arrays - collection of values
            int[] nomb= new int[1000];
//            do {
//                System.out.println(l);
//             nomb[l]=l++;
//
//            }while(l<100);
            for (int l=0;l< nomb.length;l++){
                nomb[l]= l+1;
                System.out.println(nomb[l]);
            }
            //example 2
            int[] marks= {1,2,3,4,5,66,92847,5,4,4};
            marks[6] = 99;//this will update marks[6]
            System.out.println(marks[6]);

            // Classical way to iterate an array
            for (int f=0;f<marks.length;f++){
                System.out.println(marks[f]);
            }
        System.out.println("This is For each loop");

            //For each loop
        for (int value:marks){
            System.out.println(value);
        }

        //Two Dimensional Array
        int [][] matrix = {{1,2,3},{6,5,1}};
        System.out.println(matrix[0][1]);

        String[] cars={"honda aman","maruti","suzuki","innova","tata","ford"};
        for (String value:cars){
            System.out.println(value);
        }

        //Try - Catch = Used to Jump from the lines which has Error
        // To make program run Eve though it has Error/ to skip Errors and run the program
        // program will not halt
        String[] Cars={"honda aman","maruti","suzuki","innova","tata","ford"};
        try {
            System.out.println(Cars[3]);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Masoom");
        System.out.println(sum(5,6));

        float number_1, number_2;
        System.out.println("Enter First Number:");
       // Scanner scan = new Scanner(System.in);
        number_1 = scan.nextFloat();


        System.out.println("Enter Second Number:");
       // Scanner cal2 = new Scanner(System.in);
        number_2 = scan.nextFloat();
        System.out.print("You have Entered ");
        System.out.print(number_1);
        System.out.print(" and ");
        System.out.println(number_2);
        String prompt= "Enter 0 for addition, 1 for subtraction, " +
                        "2 for multiplication and 3 for division";
        System.out.println(prompt);
        int inputformUser = scan.nextInt();
        switch (inputformUser){
            case 0:
                System.out.println("Adding these Numbers");
                System.out.print("The Result is: ");
                System.out.println(number_1 + number_2);
                break;
            case 1:
                System.out.println("Subtracting these Numbers");
                System.out.print("The Result is: ");
                System.out.println(number_1 - number_2);
                break;
            case 2:
                System.out.println("Multiplying these Numbers");
                System.out.print("The Result is: ");
                System.out.println(number_1 * number_2);
                break;
            case 3:
                System.out.println("Dividing these Numbers");
                System.out.print("The Result is: ");
                System.out.println(number_1 / number_2);
                break;
            default:
                System.out.println("Invalid input");

        }



        }







    }








