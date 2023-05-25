public class Car {
    private String brand;
    private String model;
    private int manufactureYear;
    private int kilometresDriven;

    public Car(String brand, String model, int manYear, int kmDriven) {
        this.brand = brand;
        this.model = model;
        this. manufactureYear = manYear;
        this.kilometresDriven = kmDriven;
    }

    // setting values
    public void setBrand(String brand) {
        brand = brand;
    }

    public void setModel(String model) {
        model = model;
    }

    public void setManufactureYear(int manufactureYear) {
        manufactureYear = manufactureYear;
    }

    public void setKilometresDriven(int kilometresDriven) {
        kilometresDriven = kilometresDriven;
    }

    // getting values
    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public int getKilometresDriven() {
        return kilometresDriven;
    }

    // functions
    public double AverageFuelConsumption(double fuelUsed, double distanceTravelled) {
        return (fuelUsed / distanceTravelled) * 100;
    }
}
