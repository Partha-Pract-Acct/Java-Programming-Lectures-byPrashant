/*
Create a program that computes the sum of the digits of an integer
 */

import java.util.Scanner;

public class SumOfDigits_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = input.nextInt();

        System.out.println("The sum of digits is: " + sumOfDigit(num));
    }

    public static int sumOfDigit(int a) {
        int sum = 0;
        while (a > 0) {
            sum += (a % 10);
//            a = a / 10;
            a /= 10;
        }
        return sum;
    }
}
