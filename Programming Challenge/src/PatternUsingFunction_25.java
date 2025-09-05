/*
Pattern using function
 */

public class PatternUsingFunction_25 {
    public static void main(String[] args) {
        pattern();
    }

    public static void pattern() {
        int row = 0;
        while (row < 5) {
            int i = 0;
            while (i <= row) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}