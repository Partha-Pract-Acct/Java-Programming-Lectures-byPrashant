package in.kgcoading;

public class AccessTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Red";
        car.model = "Swift";
        car.costOfPurchase = 35000;
        System.out.println(car);

        Car newCar = new Car("Black", "BMW", 1, 500000);
        System.out.println(newCar);

        Default def = new Default();
    }
}
