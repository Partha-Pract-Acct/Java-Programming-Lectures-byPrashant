/*
 Create a program using for to display if a number is prime or not
 */

import java.util.Scanner;

public class _59_PrimeFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.println("Your number is " + (isPrime(num) ? "prime" : "Not prime"));
    }

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
