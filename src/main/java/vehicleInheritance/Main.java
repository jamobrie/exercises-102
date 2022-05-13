package vehicleInheritance;

public class Main {


    public static void main(String[] args) {
        Car myToyotaYaris = new Car("Red", 4, 4, 2, "May", 6, "petrol");
        myToyotaYaris.handleSteering(45);
        myToyotaYaris.changeGears(4);
        myToyotaYaris.currentSpeed();
        myToyotaYaris.currentSpeed();
    }

}
