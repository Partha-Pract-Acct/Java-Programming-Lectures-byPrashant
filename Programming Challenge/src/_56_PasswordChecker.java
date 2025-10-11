/*
 Create a program using do-while to find password checker until a valid password is entered
 */

import java.util.Scanner;

public class _56_PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter your password: ");
            password = input.next();
        } while (!isValidPassword(password));
        System.out.println("Thanks for entering a valid password");
    }

    public static boolean isValidPassword(String password) {
        return password.length() > 6;
    }
}
