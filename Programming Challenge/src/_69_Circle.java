/*
Calculate the area and circumference of a circle for a given radius using Math.PI
 */

import java.util.Scanner;

public class _69_Circle {

    double radiusInMm;

    _69_Circle(double radiusInMm) {
        this.radiusInMm = radiusInMm;
    }

    double getCircumference() {
        return 2 * radiusInMm * Math.PI;
    }

    double getArea() {
        return Math.PI * Math.pow(radiusInMm, 2);
    }

    @Override
    public String toString() {
        return "circle props:, Radius in mm:" + radiusInMm
                + ", Circumference in mm:" + getCircumference()
                + ", Area in mm2:" + getArea();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your radius: ");
        double radius = input.nextDouble();

        _69_Circle circle = new _69_Circle(radius);
        System.out.println(circle);
    }
}
