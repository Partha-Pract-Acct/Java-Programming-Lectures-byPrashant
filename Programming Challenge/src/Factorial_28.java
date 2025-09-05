/*
Write a function that calculates the factorial of a given number
 */

import java.util.Scanner;

public class Factorial_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("The factorial of " + num + " is: " + factorial(num));
    }

    public static long factorial(int a) {
        if (a < 2) {
            return 1;
        }

        long fact = 1;
        int i = 2;
        while (i <= a) {
            fact *= i;
            i++;
        }
        return fact;
    }
}
