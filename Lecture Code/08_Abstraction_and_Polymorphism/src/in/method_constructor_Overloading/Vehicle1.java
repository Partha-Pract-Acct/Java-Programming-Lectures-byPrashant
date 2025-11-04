package in.method_constructor_Overloading;

public abstract class Vehicle1 {
    private int noOfTires;

    Vehicle1() {
        this.noOfTires = 0;
    }

    Vehicle1(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return this.noOfTires;
    }

    public abstract void start();
}
