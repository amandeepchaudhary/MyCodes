package com.CodeWithAman;
class Cylinder{
    private double radius;
    public double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public void setHeight(double h){
        height = h;
    }
    public double getHeight(){
        return height;
    }
    public double area(){
        return  2*Math.PI*radius*height + 2*Math.PI*(radius*radius);
    }

    public double volume(){
      return Math.PI*(radius*radius)*height;
    }

}
class Rect{
    private int length;
    private int breadth;

    public Rect() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rect(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
class Sphere{
    int r;
    public Sphere(int R){
        this.r= R;
    }
    public void setR(int R){
        r=R;
    }
    public int getR(){
        return r;
    }
    public double S_area(){
        return 4* Math.PI*(r*r);
    }
    public double S_volume(){
        return 4/3 * Math.PI*(r*r*r);
    }
}
public class Practice_AccessM_Constructors {
    public static void main(String[] args) {
        //Problem 1
        Cylinder myCylinder = new Cylinder(9,12);
//        myCylinder.setHeight(12);
//        myCylinder.setRadius(13);
        myCylinder.area();
        double hi=myCylinder.getHeight();
        System.out.println(hi);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());

        //Problem 2
        System.out.println(myCylinder.area());
        System.out.println(myCylinder.volume());

        //Problem 3-- constructor in myCylinder

        //Problem 4
        Rect myRect = new Rect(12,56);
        System.out.println(myRect.getLength());
        System.out.println(myRect.getBreadth());

        //Problem 5
        Sphere sph = new Sphere(12);
        sph.setR(12);
        System.out.println(sph.getR());
        System.out.println(sph.S_area());
        System.out.println(sph.S_volume());




    }
}
