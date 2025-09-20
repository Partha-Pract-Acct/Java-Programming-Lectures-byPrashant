/*
Create a program to return a new array deleting a specific element
 */

import java.util.Scanner;

public class _42_DeleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Enter the number you want to delete: ");
        int numToDeleter = input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDeleter);
        System.out.println("Here is your new array: ");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occ = _39_OccurrencesArray.noOfOccurrences(numArr, numToDelete);
        if (occ == 0) {
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j =0;
        while (i < numArr.length) {
            if (numArr[i] != numToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
