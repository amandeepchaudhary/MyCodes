package com.CodeWithAman;
abstract class Parent{
    public Parent(){
        System.out.println("main Parent class ka constructor hu");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child extends Parent{
    public void greet(){
        System.out.println("Namaste");
    }
    public void greet2(){
        System.out.println("Moshi Moshi");
    }
}
abstract class Child2 extends Parent{
    public void noabstract(){
        System.out.println("no abstract");
    }
}
public class Abstract_ClassAndMethods_53 {
    public static void main(String[] args) {
//        Parent p = new Parent();---Gives error
        Child c =new Child();
//        Child2 c2 = new Child2();====Gives error




    }
}
