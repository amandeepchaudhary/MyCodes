package com.CodeWithAman;
interface Bicycle{

    void applyBrake( int decrement);

    void speedUp(int increment);
}

class AvonCycle implements Bicycle{           //For interfaces we use implements & for inheritance we use extends
    int speed=7;

    public void applyBrake(int decrement){

        speed = speed - decrement;

    }

    public void speedUp(int increment ){

        speed = speed + increment;

    }

}
public class Introduction_to_Interfaces_54 {
    public static void main(String[] args) {

    }
}
