package in.method_constructor_Overriding;

public class TestTransportation2 {
    public static void main(String[] args) {
        Car2 c = new Car2(); // input 4 the result will be (noOfTires: 4)
        Plane2 p = new Plane2();
//        Vehicle v = new Vehicle();

//        c.start();
//        p.start();

        castTest(c);
        castTest(p);
//        castTest(v);

//        Vehicle2 vCar = new Car2();
//        Car2 cVehicle = (Car2) new Vehicle2();
    }

    private static void castTest(Vehicle2 veh) {
        // veh.start();
//        Car2 cVehicle = (Car2) veh;
//        ((Car2) veh).noOfDoors();
        veh.start();
//        cVehicle.noOfDoors();

        if (veh instanceof Car2) {

        }
    }
}
