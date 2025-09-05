/*
Create a program to reverse the digits of a number
 */

import java.util.Scanner;

public class ReverseTheDigits_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num = input.nextInt();

        System.out.println("Reverse of your number is: " + reverse(num));
    }

    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = (newNum * 10) + digit;
            num /= 10;
        }
        return newNum;
    }
}
