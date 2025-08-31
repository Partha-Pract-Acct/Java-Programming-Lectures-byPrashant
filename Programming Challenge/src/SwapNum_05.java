/* Create a program to swap two numbers */

import java.util.Scanner;

public class SwapNum_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of A: ");
        int a = input.nextInt();

        System.out.print("Enter value of B: ");
        int b = input.nextInt();

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("Swaping...");
        System.out.println("The value of A is: " + a);
        System.out.println("The value of B is: " + b);
    }
}