/* Create a program that categorize a person into different age groups
Child -> below 13                   Teen -> below 20
Adult -> below 60                   Senior-> above 60 */

import java.util.Scanner;

public class _17_AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 65) {
            System.out.println("You are a senior citizen");
        } else if (age >= 20) {
            System.out.println("You are an adult");
        } else if (age >= 13) {
            System.out.println("You are a teen");
        } else {
            System.out.println("You are a child");
        }
    }
}