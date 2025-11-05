/*
In a class Calculator, create multiple add() methods that overload each other and can sum two integers,
three integers, or two doubles. Demonstrate how each can be called with different numbers of parameters
 */

package in.coding.challenge81;

public class Calculator {
    public int add(int first, int second) {
        return first + second;
    }

    public int add(int first, int second, int third) {
        return first + second + third;
    }

    public double add(double first, double second) {
        return first + second;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 6));
        System.out.println(calc.add(5, 6, 7));
        System.out.println(calc.add(5.9, 6.2));
        System.out.println(calc.add(5, 6.9));
    }
}
