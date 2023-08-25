import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int maxAttempts = 5;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You've to guess the right number between 1 and 100. You have " + maxAttempts + " attempts.");

        while (!hasGuessedCorrectly && numberOfTries < maxAttempts) {
            int remainingAttempts = maxAttempts - numberOfTries;
            System.out.println("Enter your guess (Remaining attempts: " + remainingAttempts + "): ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < numberToGuess) {
                System.out.println("Your guess is too low. Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + numberOfTries + " tries.");
            }
        }

        if (!hasGuessedCorrectly) {
            System.out.println("Sorry, you've used all your attempts. The number was " + numberToGuess + ".");
        }

        scanner.close();
    }
}
