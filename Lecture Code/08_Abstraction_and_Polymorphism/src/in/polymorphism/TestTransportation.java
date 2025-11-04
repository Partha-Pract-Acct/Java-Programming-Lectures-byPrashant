package in.polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
        Plane p = new Plane();
//        Vehicle v = new Vehicle();

        castTest(c);
        castTest(p);
//        castTest(v);

//        Vehicle vCar = new Car();
//        Car cVehicle = (Car) new Vehicle();
    }

    private static void castTest(Vehicle veh) {
        // veh.start();
//        Car cVehicle = (Car) veh;
//        ((Car) veh).noOfDoors();
        veh.start();
//        cVehicle.noOfDoors();

        if (veh instanceof Car) {

        }
    }
}
