package com.CodeWithAman;

public class array {
    public static void main(String[] args) {
//        Three ways to make and array
//     1. Declaration and memory allocation
//        int[] Marks= new int[5];

//     2. Declaration and then memory location
//        int [] Marks;
//        Marks= new int[5];
        //Initialization
//        Marks[0]=82;
//        Marks[1]=13;
//        Marks[2]=94;
//        Marks[3]=96;
//        Marks[4]=79;
//        Marks[5]=49; == Throws an error
//        System.out.println(Marks[4]);
//     3.Declaration, Memory allocation and initialization together
//        float [] Marks= {20.0088978f,100.903f,1000.743f,56.848f,67.84389f};
//        String [] students= {"Amaan","yoyo","gto","oootoo"};
//        System.out.println(students.length);
//        System.out.println(students[2]);

        int [] marks= {20,100,1000,56,67};
        System.out.println(marks.length);
        System.out.println(marks[2]);
        //Displaying all the array using {For Loop}
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }











    }
}
