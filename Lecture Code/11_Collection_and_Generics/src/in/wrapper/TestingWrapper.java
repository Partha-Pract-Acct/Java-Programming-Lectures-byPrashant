package in.wrapper;

public class TestingWrapper {
    public static void main(String[] args) {
//        Integer first = Integer.valueOf(55);
        Integer first = 55;  //Autoboxing
        System.out.println(first);
        int second = first;  //Unboxing
    }
}
