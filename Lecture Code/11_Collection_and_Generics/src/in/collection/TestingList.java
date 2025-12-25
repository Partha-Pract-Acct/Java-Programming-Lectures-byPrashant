package in.collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();

        strList.add("Partha");
        strList.add("Mazumder");
        strList.add(1,"PM");
        strList.remove(0);

        if (strList.contains("Mazumder")) {
            System.out.println("Mazumder exists");
            System.out.println(strList.indexOf("Mazumder"));
        }

//        System.out.println(strList.get(0));

        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i));
        }

//        for (String str : strList) {
//            System.out.print(str);
//        }
    }
}
