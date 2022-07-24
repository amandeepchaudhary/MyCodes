package com.CodeWithAman;

import java.util.Locale;

public class stringMethods {
    public static void main(String[] args) {
//        String name= new String("Aman");
        String name= "Aman";
        System.out.println(name);
//        int a= 67;
//        float b=893.3839f;
//        System.out.printf("This is the int %d and this is the float %f \n",a,b);
//        System.out.format("This is the int %d and this is the float %f ",a,b);
//        String lString= name.toLowerCase();
//        System.out.println(lString);
////
////        String uString= name.toUpperCase();
//        System.out.println(name.toUpperCase());
//
//        String nonTrimmedString ="         Aman         ";
//        System.out.println(nonTrimmedString);
//
//        String trimmedString= nonTrimmedString.trim();
//        System.out.println(trimmedString);
        String capital= name.substring(1);
        System.out.println(capital.toUpperCase());

        String small = name.substring(0,4);
        System.out.println(small.toUpperCase());

        System.out.println(name.replace("Aman", "kun"));
        System.out.println(name);
        System.out.println(name.startsWith("Am"));
        System.out.println(name.endsWith("dd"));

        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("A"));
        String modifiedName= "Amanan";
        System.out.println(modifiedName.indexOf("an",4));
        System.out.println(modifiedName.lastIndexOf("an",3));




    }
}
