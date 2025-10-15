/*
Create a number guessing game where the program selects a random number, and the user has to guess it
 */

import java.util.Scanner;

public class _71_GuessingGame {

    int random;

    _71_GuessingGame() {
        random = (int) Math.ceil(Math.random() * 100);
    }

    /**
     * @param guessNumber the number that player guessed
     * @return
     * - Negative if the guessed number is smaller.
     * - 0 if the guessed number is correct.
     * - Positive is the guessed number is higher.
     */
    int guess(int guessNumber) {
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        _71_GuessingGame game = new _71_GuessingGame();
        System.out.println("Welcome to the guessing game. Guess the number between 1 and 100");
        int guess;
        int result;
        do {
            System.out.print("Guess the number: ");
            guess = input.nextInt();
            result = game.guess(guess);
            if (result == 0) {
                System.out.println("Congrats, your guess is correct");
            } else if (result < 0) {
                System.out.println("Please Guess Higher");
            } else {
                System.out.println("Please Guess Lower");
            }
        } while (result != 0);
    }
}
