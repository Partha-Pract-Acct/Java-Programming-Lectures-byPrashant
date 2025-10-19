package in.kgcoading.inheritance;

public class Vehicle {
    protected int numberOfTires;

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public void Commute() {
        System.out.printf("I am going from place A to place B using %d tires\n", numberOfTires);
    }
}
