package com.CodeWithAman;

class Employee1{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My Name is "+ name);
        System.out.println("and my id is "+ id);
//        System.out.println("and my salary is "+ salary);
    }
    public int getSalary(){
        return salary;
    }
    public void getDetails(){
        System.out.println("name = "+name);
        System.out.println("id = "+id);
        System.out.println("Salary = "+salary);
    }

}
public class oops {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 aman= new Employee1(); //Instantiating a new Employee Object
        Employee1 john= new Employee1(); //Instantiating a new Employee Object

        //Setting Attributes for Aman
        aman.id=1;
        aman.name="Aman";
        aman.salary= 40000;

        //Setting Attributes for John
        john.id=18;
        john.name= "John deval";
        john.salary=30000;
        //Printing the Attributes
        aman.getDetails();
        john.getDetails();
        john.getSalary();
        int salary= john.getSalary();
        System.out.println(salary);



    }
}
