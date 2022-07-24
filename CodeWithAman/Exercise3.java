package com.CodeWithAman;

import java.util.Random;
import java.util.Scanner;
class Game{
    int noOFGuesses;
    public int Random_no(){
        Random ram= new Random();
        int random_no = ram.nextInt(0, 100);

        return random_no;
    }
    public int takeUserInput(){
        System.out.print("Enter the Guessed no.from 0 to 100:");
        Scanner scr = new Scanner(System.in);
        int guessed_no = scr.nextInt();

        return guessed_no;
    }
    public void setNoOFGuesses(int n){
        noOFGuesses=n;
    }
    public int getNoOFGuesses(){
        return noOFGuesses;
    }
}
public class Exercise3 {
    public static void main(String[] args) {
        /*
        Create a class Game, Which allows a user to play "Guess The Number" game
        once
         */
        Game GTN=new Game();
        int rand = GTN.Random_no();
        System.out.println("Hey Player, The Random Number has been Created for YOU!!!!");
        int noOfGuesses=0;
        int score=100;
        {do {
            int guessed_no= GTN.takeUserInput();
            if (guessed_no != rand) {
                System.out.println("As you have entered the Wrong Guessed number\n" +
                        " Enter guessed number again:");
            }
            if (guessed_no < rand) {
                System.out.println("Random number is Greater than Guessed number!");
            }
            if (guessed_no > rand) {
                System.out.println("Random number is Smaller than Guessed number!");
            } else if (guessed_no == rand) {
                System.out.println("Congratulations, You Entered the Right number!");
                break;
            }

                noOfGuesses++;
                score-=10;
            }while (noOfGuesses<10);
        }
        System.out.println("The Random number was "+ rand);
        System.out.println("Your Score is :"+score);
    }
}
