package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random= new Random();
        Scanner input = new Scanner(System.in);
        int chances = 10;
        int guess;
        int randomNum= random.nextInt(101);
        System.out.println("Try to guess my number, it's between 0 and 100, you have 10 chances");
        guess = input.nextInt();
        while (chances!=0 && guess != randomNum){
            if(randomNum-guess<=20 && randomNum-guess>=-20){
                System.out.println("Not quite, but you're close! Try again:");
            }
            else if(randomNum-guess<=35 && randomNum-guess>=-35){
                System.out.println("Warm! Try again:");

            }
            else{
                System.out.println("Cold! Try again:");
            }
            guess = input.nextInt();
            chances=chances-1;
        }
        if(guess==randomNum){
            System.out.println("You won! you still had ");
            System.out.print(chances);
            System.out.print(" chances.");
        }
        else{
            System.out.println("You ran out of tries.");
        }
    }
}