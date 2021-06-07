
public class Hovercraft extends Vehicle implements LandVehicle,SeaVessel {

    public int displacement, numWheels;

    public Hovercraft(int displacement, int numWheels, String name, int maxPassengers, int maxSpeed)
    {
        this.displacement = displacement;
        this.numWheels = numWheels;
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void launch() {
        System.out.println("Launch");
    }

    @Override
    public void drive() {
        System.out.println("Drive");
    }

    public void enterLand() {
        System.out.println("Enter Land");
    }
    public void enterSea() {
        System.out.println("Enter Sea");
    }

}

