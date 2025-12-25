package in.varargs;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(4,5));
//        System.out.println(sum(new int[] {4, 6, 9}));
        System.out.println(sum(4,5,6));
        System.out.println(sum2(10,20,30,40));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

//    public static int sum(int[] a) {
//        int sum = 0;
//        for (int i : a) {
//            sum += i;
//        }
//        return sum;
//    }

    public static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static int sum2(int first, int second, int... a) {
        int sum2 = first + second;
        for (int i : a) {
            sum2 += i;
        }
        return sum2;
    }
}
