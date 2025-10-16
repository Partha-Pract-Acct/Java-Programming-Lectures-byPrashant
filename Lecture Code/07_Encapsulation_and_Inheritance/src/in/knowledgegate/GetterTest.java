package in.knowledgegate;

import in.Gettersetter.Car;

public class GetterTest {
    public static void main(String[] args) {
        Car car = new Car("Red", "Maurti", 3, 8000);
        car.setColor("Pink");
        System.out.printf("%s %s", car.getColor(), car.getModel());
    }
}
