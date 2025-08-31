/* Create a program to calculate the Area of a Triangle.
                 Area of triangle = ½*B*H */

import java.util.Scanner;

public class TriangleArea_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = input.nextDouble();

        System.out.print("Enter the height: ");
        double height = input.nextDouble();

        double area = 1.0/2.0 * (base * height);
        System.out.println("The are of triangle is: " + area);
    }
}
