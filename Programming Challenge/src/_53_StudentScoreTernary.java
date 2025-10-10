/*
 Create a program to Based on a student's score, categorize as "High", "Moderate", or "Low" using the ternary operator
  (e.g., High for scores > 80, Moderate for 50-80, Low for < 50)
 */

import java.util.Scanner;

public class _53_StudentScoreTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        String category = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
        System.out.println("Your category is: " + category);
    }
}
