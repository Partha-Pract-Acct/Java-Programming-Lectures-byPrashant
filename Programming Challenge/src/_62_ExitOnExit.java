/*
Create a program using break to read inputs from the user in a loop and break the loop
if a specific keyword (like "exit") is entered
 */

import java.util.Scanner;

public class _62_ExitOnExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your command: ");
            String command = input.next();
            if (command.equals("exit")) {
                break;
            }
        }
        System.out.println("You have successfully exited");
    }
}
