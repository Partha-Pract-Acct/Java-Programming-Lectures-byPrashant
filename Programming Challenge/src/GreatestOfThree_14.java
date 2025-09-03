/* Create a program that determines the greatest of three number */

import java.util.Scanner;

public class GreatestOfThree_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();
        System.out.print("Enter third number: ");
        int thirdNum = input.nextInt();

        if (firstNum >= secondNum) {
            System.out.println(firstNum + " is the greatest number");
        } else if (secondNum >= thirdNum) {
            System.out.println(secondNum + " is the greatest number");
        } else {
            System.out.println(thirdNum + " is the greatest number");
        }
    }
}
