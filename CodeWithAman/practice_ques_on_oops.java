package com.CodeWithAman;
class Employee {
    int salary;

    public int getSalary() {
        return salary;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
class CellPhone{
    public void ring() {
            System.out.println("Ringing....");
    }
    public void vibrate(){
            System.out.println("Vibrating....");
    }
    public void callFriend(){
            System.out.println("Calling Hitesh....");
    }
}
//class Sqaure{
//    int l;
//    public void side(){
//        System.out.println("The Side of the square is  "+l);
////        System.out.printf("The Side of the square is %d\n",l);
//    }
//    public int area(){
//         int area = l*l;
//        System.out.print("The area of Square is ");
//         return area;
//    }
//    public int parameter(){
//        int parameter = 4*l;
//        System.out.print("The parameter of Square is ");
//        return parameter;
//    }
//}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int peri(){
        return 4*side;
    }
}
class Rectangle{
    int l;
    int b;
    public  void sides(){
        System.out.println("Length of Rectangle is "+ l );
        System.out.println("Breadth of Rectangle is "+ b );
    }
    public int areaR(){
        System.out.print("Area is ");
        return l*b;
    }
    public int periR(){
        System.out.print("Perimeter is ");
        return 2*(l+b);
    }
}
class RockstarG{
    public void Hit(){
        System.out.println("Hitting...");
    }
    public void Run(){
        System.out.println("Running...");
    }
    public void Fire(){
        System.out.println("Firing...");
    }
}
public class practice_ques_on_oops {
    public static void main(String[] args) {
        //Problem 1
/*        Employee aman = new Employee();
        Employee ishu =  new Employee();
        aman.setName("Aman");
        System.out.println(aman.getName());;
        aman.salary= 23000;
        System.out.println(aman .getSalary());


        //Problem 2
        CellPhone realMeX7Max = new CellPhone();
        realMeX7Max.ring();
        realMeX7Max.callFriend();
        realMeX7Max.vibrate();
*/
        //Problem 3
//        Sqaure sq = new Sqaure();
//        sq.l= 6;
//        sq.side();
//        System.out.println(sq.area());
//        System.out.println(sq.parameter());


     /*   Square square = new Square();
        square.side= 6;
        System.out.println(square.area());
        System.out.println(square.peri());
      */

        //Problem 4
       /* Rectangle rec=new Rectangle();
        rec.l=12;
        rec.b= 2;
        rec.sides();
        System.out.println(rec.areaR());
        System.out.println(rec.periR());
        */

        //Problem 5
        RockstarG TommyV= new RockstarG();
        TommyV.Run();
        TommyV.Fire();
        TommyV.Hit();










    }
}
