package com.CodeWithAman;

public class practiceset3 {
    public static void main(String[] args) {

        System.out.println("Q1");
        String name= "Ishu";
        name = name.toLowerCase();
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println("\n");

        System.out.println("Q2");
        String space= "ishu is a good girl";
        space = space.replace(" ","-");
        System.out.println(space.replace('-','_'));
        System.out.println(space);
        System.out.println("\n");

        System.out.println("Q3");
        String letter ="Dear <|name|>, thanks a lot";
        letter = letter.replace("<|name|>","aman");
        System.out.println(letter);
        System.out.println("\n");

        System.out.println("Q4");
        String dSpace= "This string contains   double and       triple spaces";
        System.out.println(dSpace.indexOf("  "));
        System.out.println(dSpace.indexOf("    "));
        System.out.println("\n");

        System.out.println("Q5");
        if (dSpace.contains("  ")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        System.out.println("\n");

        System.out.println("Q6");
        String myLetter= "Dear Aman, \n\tThis course is Fabulous.\n\tThanks!";
        System.out.println(myLetter);



    }
}
