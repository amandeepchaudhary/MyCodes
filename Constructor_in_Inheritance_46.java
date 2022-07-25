package com.CodeWithAman;

class Base{
    Base(){
        System.out.println("Main ek Constructor hu/ I am a Constructor");
    }
    Base(int x){
        System.out.println( "i am a overloaded Constructor with value of x as: "+x);
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends Base{
    Derived(){

        System.out.println("I am a Derived class constructor");
    }
    Derived(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived class with the value" +
                " of y as follows: "+ y);
    }
    public int y;

    public  int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}
class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("I am a child of Derived class");
    }
    ChildOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am the child of derived class having the value of z as follows: "+z);

    }
}
public class Constructor_in_Inheritance_46 {
    public static void main(String[] args) {
//        Base b= new Base(2);
//        Derived d = new Derived(89,33);
        ChildOfDerived cd = new ChildOfDerived(9,3,4);


    }
}
