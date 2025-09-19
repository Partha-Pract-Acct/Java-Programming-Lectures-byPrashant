/*
Create a program to find the Greatest Common Divisor (GCD) of two integers
 */

import java.util.Scanner;

public class _31_GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int first = input.nextInt();

        System.out.print("Enter your second number: ");
        int second =input.nextInt();

        System.out.println("GCD of two number is: " + gcd(first, second));
    }

    public static int gcd(int a, int b) {
        int gcd = 1;
        int i = 2;
        int least = least(a, b);
        while (i <= least) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        }else {
            return num2;
        }
    }
}
