/*
 Create a program using for-each to find the maximum value in an integer array
 */

public class _60_MaxArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();

        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }
        System.out.println("Maximum number is: " + max);
    }
}
