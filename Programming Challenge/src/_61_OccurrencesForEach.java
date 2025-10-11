/*
Create a program using for-each to the occurrences of a specific element in an array
 */

import java.util.Scanner;

public class _61_OccurrencesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = ArrayUtility.inputArray();
        System.out.println("Now, enter the number you want to search: ");
        int element = input.nextInt();

        int occ = countOccurrences(nums, element);
        System.out.println("Your element was found: " + occ + " times");
    }

    public static int countOccurrences(int[] nums, int element) {
        int occ = 0;
        for (int num : nums) {
            if (num == element) {
                occ++;
            }
        }
        return occ;
    }
}
