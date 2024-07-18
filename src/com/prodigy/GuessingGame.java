package com.prodigy;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
      
        Random random = new Random();
        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
     
        Scanner scanner = new Scanner(System.in);
        
        int guess = 0;
        int attempts = 0;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have generated a random number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        
        // Loop until the user guesses the correct number
        while (guess != randomNumber) {
        
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            // Compare the guess to the random number and provide feedback
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }
     
        scanner.close();
    }
}
