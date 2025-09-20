/*
Create a program to find the sum and average of all elements in an array
 */

public class _38_ArraySumAverage {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();  // ArrayUtility
        long sum = sum(numArray);
        double avg =  average(numArray);
        System.out.println("Sum of the number is: " + sum);
        System.out.println("Average of the number is: " + avg);
    }

    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] numArray) {
        double sum = sum(numArray);
        return (sum / numArray.length);
    }
}
