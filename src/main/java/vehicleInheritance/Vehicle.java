package vehicleInheritance;

public class Vehicle {

    protected int degrees;
    protected int gearPosition;
    protected int speed;

    protected void handleSteering(int degrees) {
        this.degrees = degrees;
        System.out.println("Steering at " + degrees + "degrees");
    }

    protected void changeGears(int gearPositon) {
        this.gearPosition = gearPositon;
        System.out.println("Gear switched to " + gearPositon);
    }

    protected void currentSpeed() {
        this.speed = this.degrees * this.gearPosition;
        System.out.println(this.speed);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getAirBags() {
        return airBags;
    }

    public void setAirBags(int airBags) {
        this.airBags = airBags;
    }

    public String getRegistrationDetails() {
        return registrationDetails;
    }

    public void setRegistrationDetails(String registrationDetails) {
        this.registrationDetails = registrationDetails;
    }

    public Vehicle(String colour, int wheels, int doors, int airBags, String registrationDetails) {
        this.colour = colour;
        this.wheels = wheels;
        this.doors = doors;
        this.airBags = airBags;
        this.registrationDetails = registrationDetails;
    }

    private String colour;
    private int wheels;
    private int doors;
    private int airBags;
    private String registrationDetails;

}
