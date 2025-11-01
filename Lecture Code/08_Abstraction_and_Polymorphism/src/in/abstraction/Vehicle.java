package in.abstraction;

public abstract class Vehicle implements Transport {  // (abstract) class
    private int noOfTires;

    public abstract void makeStartSound();  // (abstract) method

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute() {
        System.out.println("Going..");
    }
}
