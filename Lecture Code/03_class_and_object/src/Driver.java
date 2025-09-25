public class Driver {

    static int minAgeForDriving = 18;

    String name;
    int age;
    String dateOfLicense;

    public boolean isAllowedToDrive() {
        return this.age >= minAgeForDriving;
    }

    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.drive1();
//        myCar.drive1();
//        myCar.drive1();
//        myCar.addFuel(10);
//        myCar.drive1();
//        System.out.println(myCar.getCurrentFuelInLiters());

//        Car swift = new Car();  // (..same)
//        swift.addFuel(6);
//        Car startedCar = swift.start();
//        startedCar.drive();
//        System.out.println(swift.getCurrentFuelInLiters());

        Car swift = new Car("Red");// (..same)
        Car thar = new Car();
        swift.addFuel(6);
        swift.start().drive();
        System.out.println(swift.color);
        System.out.println(swift.getCurrentFuelInLiters());

        Driver myDriver = new Driver();
        myDriver.dateOfLicense = "1/Jan/2025";
        System.out.println(minAgeForDriving);
    }
}
