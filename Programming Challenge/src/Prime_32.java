/*
Create a program to check whether a given number is prime
 */

import java.util.Scanner;

public class Prime_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = input.nextInt();

        if (isPrime(num)) {
            System.out.println("Your number is prime");
        }else {
            System.out.println("Your number is not prime");
        }
    }

    public static boolean isPrime(int n) {
        int i = 2;

        if (n == 0 || n == 1) {
            return false;
        } else {
            while (i < n) {
                if (n % i == 0 && n != 2){
                    return false;
                }
            i++;
            }
        }
        return true;
    }
}
