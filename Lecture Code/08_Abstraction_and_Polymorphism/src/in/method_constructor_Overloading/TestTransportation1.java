package in.method_constructor_Overloading;

public class TestTransportation1 {
    public static void main(String[] args) {
        Car1 c = new Car1(); // input 4 the result will be (noOfTires: 4)
        Plane1 p = new Plane1();
//        Vehicle v = new Vehicle();

        castTest(c);
        castTest(p);
//        castTest(v);

//        Vehicle1 vCar = new Car1();
//        Car1 cVehicle = (Car1) new Vehicle1();
    }

    private static void castTest(Vehicle1 veh) {
        // veh.start();
//        Car1 cVehicle = (Car1) veh;
//        ((Car1) veh).noOfDoors();
        veh.start();
//        cVehicle.noOfDoors();

        if (veh instanceof Car1) {

        }
    }
}
