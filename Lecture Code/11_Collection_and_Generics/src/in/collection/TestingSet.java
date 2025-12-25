package in.collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        System.out.println(names.add("Partha"));
        System.out.println(names.add("Mazumder"));
        System.out.println(names.add("PM"));
        Utility.print(names);

        System.out.println(names.add("Partha"));
        System.out.println(names.size());

        System.out.println(names.contains("Partha"));
        System.out.println(names.remove("Partha"));
        Utility.print(names);
        System.out.println(names.remove("Partha"));
    }
}
