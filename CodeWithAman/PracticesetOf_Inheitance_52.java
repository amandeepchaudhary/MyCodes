package com.CodeWithAman;
//Problem 1
/*
class Circle{
    Circle(){
        System.out.println("I am not a parameterized constructor");
    }
    public int radius;
    Circle(int r){
        System.out.println("I am Circle's Parameterized Constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI * (this.radius*this.radius);
    }
}
class Cylinder1 extends Circle {
    public int height;

    Cylinder1(int r, int h){
//        super(r);
        System.out.println("I am Cylinder1 parameterized constructor");
        this.height = h;
    }
    @Override
    public double area(){
        return Math.PI*(this.radius*this.radius)*this.height;
    }
}
*/

//Problem 2

class Rectangle1{
    int l;
    int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

//    Rectangle1(int l, int b){
//        this.l=l;
//        this.b=b;
//    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public double area(){
        return l*b;
    }
}
class Cuboid1 extends Rectangle1{
    int h;

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

//    Cuboid1(int l, int b, int h){
//        super(l,b);
//        this.h=h;
//    }
    public double area(){
        return 2*((l*b)+(b*h)+(l*h));
    }
    public double volume(){
        return l*b*h;
    }
}
public class PracticesetOf_Inheitance_52 {
    public static void main(String[] args) {
        //Problem 1
//        Circle objC = new Circle(12);
//        Cylinder1 obj= new Cylinder1(23,46);
        Cuboid1 obj = new Cuboid1();
        obj.setL(2);
        obj.setB(4);
        obj.setH(3);
        System.out.println(obj.area());






    }
}
