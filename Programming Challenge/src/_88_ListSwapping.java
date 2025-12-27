/*
Write a method that swaps two elements in an ArrayList, given their indices
 */

import java.util.Arrays;
import java.util.List;

public class _88_ListSwapping {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list);
        swap(list, 2, 7);
        System.out.println(list);
    }

    public static void swap(List<Integer> list, int a, int b) {
        int swap = list.get(a);
        list.set(a, list.get(b));
        list.set(b, swap);
    }
}
