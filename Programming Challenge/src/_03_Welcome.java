/* Create a program to input name of the person and respond with ”Welcome NAME to the Java” */

import java.util.Scanner;

public class _03_Welcome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        System.out.println("Welcome " + name + " to the Java!");
    }
}
