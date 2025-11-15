/*
Arithmetic Exception Handling Write a program that asks the user to enter two integers and then divides the first
by the second. The program should handle any arithmetic exceptions that may occur (like division by zero) and display
an appropriate message.
		Key Points:
		- Use Scanner to read user input.
		- Implement a try-catch block to handle ArithmeticException.
		- Display a user-friendly message if division by zero occurs
 */

package in.coding.challenge83;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();

        try {
            int result = first / second;
            System.out.printf("Result is %d", result);
        } catch (ArithmeticException exception) {
            if (exception.getMessage().equals("/ by zero")) {
                System.out.println("Divided by zero occurred.");
            } else {
                throw exception;
            }
        }
    }
}
