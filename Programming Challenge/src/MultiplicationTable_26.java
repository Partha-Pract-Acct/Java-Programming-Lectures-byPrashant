/*
Develop a program that prints the multiplication table for a given number
 */

import java.util.Scanner;

public class MultiplicationTable_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = input.nextInt();
        table(num);

    }

    public static void table(int a) {
        int i = 1;
        while (i <= 10) {
            System.out.println(a + " x " + i + " = " + (a * i));
            i++;
        }
    }
}
