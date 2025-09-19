/*
Create a program to sum all odd numbers from 1 to a specified number N
 */

import java.util.Scanner;

public class _27_OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Odd sum till "+ num + " is: " + oddSum(num));
    }

    public static int oddSum(int a) {
        int i = 1;
        int sum = 0;

        while (i <= a) {
            sum += i;
            i += 2;

        }
        return sum;
    }
}
