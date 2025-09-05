/*
Create a program to find the Least Common Multiple (LCM) of two numbers
 */

import java.util.Scanner;

public class LCM_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();

        System.out.println("LCM of the two number is: " + lmc(num1, num2));
    }

    public static int lmc(int a, int b) {
        int i = 1;
        while (true) {  // while (i <= b)
            int factor = a * i;
            if (factor % b == 0) {
                return factor;
            }
            i++;
        }
//        return 0;  unreachable

    }
}
