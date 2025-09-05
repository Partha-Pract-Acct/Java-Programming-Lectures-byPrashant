import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        int first = readNumber();
        int second = readNumber();
        int sum = first + second;

        System.out.println("Sum of the number is: " + sum);
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");

//        int number = input.nextInt();
//        return number;

        return input.nextInt();
    }
}