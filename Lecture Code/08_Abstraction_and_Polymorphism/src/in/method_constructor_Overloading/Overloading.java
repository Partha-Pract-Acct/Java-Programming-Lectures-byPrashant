package in.method_constructor_Overloading;

public class Overloading {
    Overloading() {
        System.out.println("Default constructor called.");
    }

    Overloading(String pop) {
        System.out.println(pop);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        System.out.println(overloading.add(5, 4));
        System.out.println(overloading.add("4", "5"));
        System.out.println(overloading.add(1, 2, 3, 4));
    }
}
