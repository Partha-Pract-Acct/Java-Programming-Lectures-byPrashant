public class Car {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

//    @Override
//    public String toString() {
//        return "My car name is: " + name;
//    }


    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Car{");
//        sb.append("noOfWheels=").append(noOfWheels);
//        sb.append(", noOfDoors=").append(noOfDoors);
//        sb.append(", maxSpeed=").append(maxSpeed);
//        sb.append(", name='").append(name).append('\'');
//        sb.append(", modelNumber='").append(modelNumber).append('\'');
//        sb.append(", company='").append(company).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }

    public static void main(String[] args) {
        Car swift = new Car(4, 4, 120,
                "Swift", "SW76", "Maruti");
        System.out.println(swift.toString());  //same
        System.out.println(swift);  //same
    }
}
