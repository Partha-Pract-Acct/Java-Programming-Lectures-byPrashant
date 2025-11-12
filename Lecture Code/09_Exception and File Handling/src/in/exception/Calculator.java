package in.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Division Calculator \n");
        System.out.println("Enter your two numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();

        try {
            int result = first / second;
            System.out.printf("Result is %d", result);
        } catch (ArithmeticException exception) {
//            System.out.println("Divide by zero, enter valid values");
            System.out.printf("%s, enter valid values", exception.getMessage());
        } catch (Throwable th) {
            System.out.println("General exception");
        }
    }
}
