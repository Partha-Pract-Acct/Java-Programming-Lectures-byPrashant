package in.method_constructor_Overriding;

class Plane2 extends Vehicle2 {
    @Override
    public void start() {
//        super.start();
        System.out.println("Plane is taking off");
    }
}
