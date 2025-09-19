/* Create a program that determines if a number is positive, negative or zero */

import java.util.Scanner;

public class _12_PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
//        int num = input.nextInt();
        double num = input.nextDouble();

        if (num == 0) {
            System.out.println("Your is zero");
        } else if (num > 0) {
            System.out.println("Your is a positive number");
        } else {
            System.out.println("Your is a negative number");
        }
    }
}