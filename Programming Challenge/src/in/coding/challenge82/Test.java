/*
Define a base class Vehicle with a method service() and a subclass Car that overrides service().
In Car's service(), provide a specific implementation that calls super.service() as well, to show how overriding works
 */

package in.coding.challenge82;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle veh = new Vehicle();

        veh.service();
        car.service();
    }
}
