/*
Create an abstract class Shape with an abstract method calculateArea().
Implement two subclasses: Circle and Square. Each subclass should have relevant attributes
(like radius for Circle, side for Square) and their own implementation of the calculateArea() method
 */

package in.coding.challenge79;

public class TestShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(10.3);

        System.out.printf("Area of circle is %f \n", circle.calculateArea());
        System.out.printf("Area of square is %f", square.calculateArea());
    }
}
