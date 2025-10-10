import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        long fact = factorialIterative(num);
        System.out.println("Factorial of your number is: " + fact);

        long factRec = factorial(num);
        System.out.println("Factorial of your number is(Recursion): " + factRec);
    }

    public static long factorialIterative(int num) {
        long result = 1;
        for (int i = 1; i<= num; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
