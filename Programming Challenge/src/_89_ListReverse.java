/*
Create a program that reverses the elements of a List and prints the reversed list
 */

import java.util.Arrays;
import java.util.List;

public class _89_ListReverse {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }

    public static void reverse(List<Integer> list) {
//        Collections.reverse(list);
        for (int i = 0; i < list.size() / 2; i++) {
            _88_ListSwapping.swap(list, i, list.size() -i - 1);
        }
    }
}
