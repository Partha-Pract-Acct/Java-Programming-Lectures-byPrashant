/*
Define a Student class with fields like name and age, and use toString to print student details
 */

public class _67_StudentToString {
    String name;
    int age;
    String rollNumber;

    public _67_StudentToString(String name, int age, String rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
//        return "Student details:{name:"++", age:"++", roll number:"++",}";
        return "Student details:{name:" + name
                + ", age:" + age
                + ", roll number:" + rollNumber + "}";
    }

    public static void main(String[] args) {
        _67_StudentToString stu = new _67_StudentToString("Partha", 21, "09");
        System.out.println(stu);
    }
}
