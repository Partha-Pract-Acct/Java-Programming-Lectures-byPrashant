/*
Create a program using recursion to check if a string is a palindrome using recursion
 */

import java.util.Scanner;

public class _66_PalindromeRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String to be checked: ");
        String str = input.next();

        System.out.println("Your string is " + ((isPalindrome(str) ? "Palindrome" : "Not palindrome")));
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        int lastpos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastpos)) {
            return false;
        }
        String newStr = str.substring(1, lastpos);
        return isPalindrome(newStr);
    }
}
