/* Create a program that shows use of right shift operator */

import java.util.Scanner;

public class _23_RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your number ");
        int num = input.nextInt();

        int result = num >> 1;
        System.out.println("Your result is: " + result);
    }
}
