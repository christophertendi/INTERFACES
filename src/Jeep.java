public class Jeep extends Vehicle implements LandVehicle {

    public int numWheels;

    Jeep(String name, int numWheels, int maxPassengers, int maxSpeed) {
        this.name = name;
        this.numWheels = numWheels;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;

    }

    @Override
    public void drive() {
        System.out.println("Drive");
    }

    public void soundHorn() {
        System.out.println("Klakson");
    }
}