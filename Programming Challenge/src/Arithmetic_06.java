/* Create a program that takes two numbers and shows result of all arithmetic operators (+,-,*,/,%) */

import java.util.Scanner;

public class Arithmetic_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        //B. O. D(/). M(*). A(+). S(-).

        int div = num1/num2;
        int mul = num1*num2;
        int add = num1+num2;
        int sub = num1-num2;

        System.out.println("Division is: " + div);
        System.out.println("Multiplication is: " + mul);
        System.out.println("Addition is: " + add);
        System.out.println("Subtraction is: " + sub);
    }
}
