public class Parameter {
    public static void main(String[] args) {
        System.out.println(sumTwoNumbers(4,5));
        System.out.println(sumTwoNumbers(6,8));
    }

    public static int sumTwoNumbers(int first, int second) {
        System.out.println("The first number is: " + first);
        System.out.println("The second number is: " + second);
     return first + second;
    }
}
