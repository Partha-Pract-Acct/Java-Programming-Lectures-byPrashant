/* Create a program to convert Fahrenheit to Celsius
                   °C = (°F - 32) × 5/9 */

import java.util.Scanner;

public class FahrenheitToCelsius_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your temperature in F: ");
        double fer = input.nextDouble();

        double cel = (5.0/9.0) * (fer - 32.0);
        System.out.println("Your temperature is "+ cel +" C");
    }
}
