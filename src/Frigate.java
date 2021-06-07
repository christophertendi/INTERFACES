public class Frigate extends Vehicle implements SeaVessel{

    public int displacement;

    public Frigate(int displacement, String name, int maxSpeed, int maxPassengers) {
        this.displacement = displacement;
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.maxPassengers = maxPassengers;

    }
    @Override
    public void launch() {
        System.out.println("Launch");
    }

    public void fireGun(){
        System.out.println("PewPew");
    }
}