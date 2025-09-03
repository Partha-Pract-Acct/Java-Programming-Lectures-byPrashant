/* Create a program that shows bitwise OR of two numbers */

import java.util.Scanner;

public class BitwiseOr_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int first = input.nextInt();
        System.out.print("Now, enter the other number: ");
        int second = input.nextInt();

        int result = first | second;
        System.out.println("Result is: " + result);
    }
}
