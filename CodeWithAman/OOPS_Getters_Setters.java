package com.CodeWithAman;

import java.util.Scanner;

class MyCircle{
    private double radius;
    private double area;
    private double perimeter;

    public void setRadius(double r){
        radius= r;
    }
    public double getRadius(){
        return radius;
    }
    public double area(){
        return 3.14*(radius*radius);
    }
    public void setArea(double a){
        area= a;
    }
    public double getArea(){
        return area;
    }
    public double perimeter(){
        return (2*3.14)*radius;
    }
    public void setPerimeter(double p){
        perimeter = p;
    }
    public double getPerimeter(){
        return perimeter;
    }

}
public class OOPS_Getters_Setters {
    public static void main(String[] args) {
        MyCircle cir = new MyCircle();
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the Radius :");
        double radius = scr.nextDouble();

//        cir.setRadius(3);
//        System.out.println(cir.getRadius());
        System.out.println(cir.perimeter());
        System.out.println(cir.area());
        cir.setArea(12);







    }
}
