package com.marianasena.entities;

import java.util.Scanner;
public class JogoAdivinhacao {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int randomNum = (int) (Math.random() * 100) + 1; // Random number between 1 and 100
            int attempts = 0;
            int guess;

            System.out.println("Welcome to guessing game! Try to guess a number between 1 and 100.");

            // Main game loop
            while (true) {
                System.out.print("Type your guess: ");
                guess = scanner.nextInt();
                attempts++;

                // Check if the player's guess is equal to the random number
                if (checkGuess(guess, randomNum, attempts)) {
                    break; // ends the loop if the player gets it right
                } else if (guess < randomNum) {
                    System.out.println("The number is higher. Try again.");
                } else {
                    System.out.println("The number is lower. Try again.");
                }
            }

            scanner.close();
        }

    public static boolean checkGuess(int guess,int random, int attempts) {
        if (guess == random) {
            writeMessage(attempts);
            return true;
        }else{
            return false;
        }
    }

    public static void writeMessage(int attempts){
        System.out.println("Congrats! You got the number right in " + attempts + " attempts. Well done!");
    }
}

