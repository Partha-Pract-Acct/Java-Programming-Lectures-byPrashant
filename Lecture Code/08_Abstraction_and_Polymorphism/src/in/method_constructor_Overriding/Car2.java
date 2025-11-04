package in.method_constructor_Overriding;

class Car2 extends Vehicle2 {
    Car2() {
        super();
    }

    Car2(int noOfTires) {
        super(noOfTires);
    }

    public int noOfDoors() {
        return 5;
    }

    @Override
    public void start() {
        System.out.println(super.getNoOfTires());
        System.out.println("Car is starting");
    }
}
