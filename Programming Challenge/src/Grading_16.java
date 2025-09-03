/* Create a program that calculates grades based on marks
A -> above 90%                        B -> above 75%
C -> above 60%                        D -> above 30%
F -> below 30% */

import java.util.Scanner;

public class Grading_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your percentage: ");
        double per = input.nextDouble();

        if (per >= 90) {
            System.out.println("Great, You have got A");
        } else if (per >= 75) {
            System.out.println("Good, You have got B");
        } else if (per >= 60) {
            System.out.println("You have got C, Work harder next time");
        } else if (per >= 30) {
            System.out.println("You have got D, You seriously need to work harder");
        } else {
            System.out.println("Sorry, You have failed the test and got a F");
        }
    }
}
