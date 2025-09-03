/* Create a program that shows use of left shift operator */

import java.util.Scanner;

public class LeftShift_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your number ");
        int num = input.nextInt();

        int result = num << 4;
        System.out.println("Your result is: " + result);
    }
}
