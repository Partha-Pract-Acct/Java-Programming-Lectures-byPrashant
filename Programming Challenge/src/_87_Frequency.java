/*
Use the Collections class to count the frequency of a particular element in an ArrayList
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _87_Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 8, 4, 5, 5, 7, 8, 9);
        System.out.println(Collections.frequency(list, 5));
        System.out.println(Collections.frequency(list, 4));
        System.out.println(Collections.frequency(list, 8));
        System.out.println(Collections.frequency(list, 15));
    }
}
