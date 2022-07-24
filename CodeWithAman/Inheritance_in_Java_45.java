package com.CodeWithAman;
class Animal{
    int x;
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
}
class Dog extends Animal{
    int y;
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return y;
    }
    public void Bark(){
        System.out.println("Dog is Barking now...!");
    }
}
public class Inheritance_in_Java_45 {
    public static void main(String[] args) {
        //Creating the Derived class and getting the variable from Base class
        Dog a = new Dog();
        a.setX(12);
        System.out.println(a.getX());
        a.Bark();

        //Creating the variable from Derived class to Base class
        Animal b = new Animal();
        //b.Bark();-->//doesn't work
        /*

        b.setY(23);-->//It Gives an error as the variable from derived class cannot be used in base class
        System.out.println(b.getY(23));-->//It Gives an error as the variable from derived class cannot be used in base class

         */

    }
}
