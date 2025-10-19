package in.kgcoading.inheritance;

import in.kgcoading.TwoWheeler;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.Commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());

        TwoWheeler two = new TwoWheeler();
        two.Commute();
        two.balance();

        MotorCycle motor = new MotorCycle();
        motor.Commute();
        motor.balance();
        motor.start();
    }
}
