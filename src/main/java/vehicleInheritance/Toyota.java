package vehicleInheritance;

public class Toyota extends Car {

    private String brand;
    private long avgReview;
    private double price;

    public Toyota(String colour, int wheels, int doors, int airBags, String registrationDetails, int gears, String gasType, String brand, long avgReview, double price) {
        super(colour, wheels, doors, airBags, registrationDetails, gears, gasType);
        this.brand = brand;
        this.avgReview = avgReview;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getAvgReview() {
        return avgReview;
    }

    public void setAvgReview(long avgReview) {
        this.avgReview = avgReview;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
