/* Create a program to calculate product of two floating points numbers */

import java.util.Scanner;

public class FloatMultiplication_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first decimal number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second decimal number: ");
        double num2 = input.nextDouble();

        double mul = num1 * num2;
        System.out.println("Result is: " + mul);
    }
}
