/* Create a program that shows bitwise compliment of a number */

import java.util.Scanner;

public class _21_BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your number");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Your result is: " + result);
    }
}
