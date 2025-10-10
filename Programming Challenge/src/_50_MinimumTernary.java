/*
Create a program to find the minimum of two numbers
 */

import java.util.Scanner;

public class _50_MinimumTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        _50_MinimumTernary ternary = new _50_MinimumTernary();
        int min = ternary.min(num1, num2);
        System.out.println("Minimum number is " + min);
    }

    public int min(int num1, int num2) {
        return num1 < num2 ? num1 : num2;
    }
}
