/*
Create an interface Flyable with an abstract method fly(). Create an abstract class Bird that implements Flyable.
Implement a subclass Eagle that extends Bird. Provide an implementation for the fly() method
 */

package in.coding.challenge80;

public class TestFly {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();
    }
}
