package com.CodeWithAman;

class Phone{
    public void time(){
        System.out.println("The time is 8am");
    }
    public void on(){
        System.out.println("Turning on Phone....");
    }
}

class SmartPhone extends  Phone{

    public void music(){
        System.out.println("Playing music...");
    }
    @Override
    public void on(){
        System.out.println("Turning on SmartPhone....");

    }
}
public class DynamicMethodDispatch_49 {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        obj.on();
//        obj.time();


        //Super class ka reference(Nokia and Iphone) can be a subclass.
        //But the Sub class ka reference cannot be a Super Class

        Phone Nokia = new SmartPhone();//Yes it is Allowed //A phone can be a smartphone but a
      //SmartPhone Iphone = new Phone();  //Not Allowed //smartphone can never be a
         Nokia.time();                                //phone(i.e, Nokia)
         Nokia.on();//Abb humne phone manga ki bhai phone dena pr usne mujhe mera
                    //smartphone diya joki iphone tha toh on hoga toh smartphone likha aayega
                    //toh reference ka run nhi hoga on() blki smartphone run hoga joki object hai
       //Nokia.music();//Nokia.on m smartphone aaya kyuki object smartphone ka h toh jo bhi chez dono m
         //Not Allowed // Overridden hogi voh hi show hogi sub class ki and super class ka sab show hoga
                      //sivay overridden wala.
        Nokia.time();




    }
}
