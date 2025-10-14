public class StringFormate {
    public static void main(String[] args) {
        String name = "Sandeep";
        int marks = 45;
        int num = 45256;

        System.out.println("Hello " + name + " your marks are: " + marks);

        System.out.printf("Hello %s, your marks are %d \n", name, marks);
        System.out.printf("Hello %10s, your marks are %d \n", name, marks);
        System.out.printf("Hello %-10S, your marks are %d \n", name, marks);

        System.out.printf("Hello %s, your marks are %5d \n", name, marks);
        System.out.printf("Hello %s, your marks are %05d \n", name, marks);
        System.out.printf("Hello %s, your marks are %0,5d \n", name, num);
    }
}
