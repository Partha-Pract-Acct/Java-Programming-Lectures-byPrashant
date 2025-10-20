/*
Create a class ArrayOperations with a static nested class Statistics.
Statistics could have methods like mean(), median(), which operate on an array
 */

package in.coding.challenge78;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1,3,5,9});
        ArrayOperations.Statistics statistics = opr.new Statistics();
        System.out.println(statistics.mean());
    }
}
