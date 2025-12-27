/*
Write a method concatenate Strings that takes variable arguments of String type and concatenates them
into a single string
 */

public class _85_VarArgs {
    public static void main(String[] args) {
        System.out.println(concatenate("Partha"));
        System.out.println(concatenate("Mazumder"));
        System.out.println(concatenate("Hello", "beautiful", "people"));
    }

    public static String concatenate(String... strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
