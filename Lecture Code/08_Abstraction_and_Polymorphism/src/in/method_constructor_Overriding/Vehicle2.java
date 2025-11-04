package in.method_constructor_Overriding;

public abstract class Vehicle2 {
    private int noOfTires;

    Vehicle2() {
        this.noOfTires = 0;
    }

    Vehicle2(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return this.noOfTires;
    }

    public void start() {
        System.out.println("Vehicle is starting..");
    }
}
