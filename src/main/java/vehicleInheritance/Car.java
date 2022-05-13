package vehicleInheritance;

public class Car extends Vehicle {

    private int gears;

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String getGasType() {
        return gasType;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    private String gasType;

    public Car(String colour, int wheels, int doors, int airBags, String registrationDetails, int gears, String gasType) {
        super(colour, wheels, doors, airBags, registrationDetails);
        this.gasType = gasType;
        this.gears = gears;
    }

}
