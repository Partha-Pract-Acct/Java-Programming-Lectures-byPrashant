/*
Concatenate and Convert: Take two strings, concatenate them, and convert the result to uppercase
 */

public class _68_StringManipulation {
    public static void main(String[] args) {
        String firstName = "Partha";
        String lastName = "Mazumder";
        String fullName = firstName + " " + lastName;
        String fullNameSt = firstName.concat(" ").concat(lastName);

        System.out.println(fullName.toUpperCase());
        System.out.println(fullNameSt.toUpperCase());
    }
}
