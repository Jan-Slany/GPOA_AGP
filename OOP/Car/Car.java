public class Car {
    private String Brand;
    private String Model;
    private int ManufactureYear;
    private int KilometresDriven;

    public Car(String brand, String model, int manYear, int kmDriven) {
        this.Brand = brand;
        this.Model = model;
        this. ManufactureYear = manYear;
        this.KilometresDriven = kmDriven;
    }

    // setting values
    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setManufactureYear(int manufactureYear) {
        ManufactureYear = manufactureYear;
    }

    public void setKilometresDriven(int kilometresDriven) {
        KilometresDriven = kilometresDriven;
    }

    // getting values
    public String getModel() {
        return Model;
    }

    public String getBrand() {
        return Brand;
    }

    public int getManufactureYear() {
        return ManufactureYear;
    }

    public int getKilometresDriven() {
        return KilometresDriven;
    }

    // functions
    public double AverageFuelConsumption(double FuelUsed, double DistanceTravelled) {
        return (FuelUsed / DistanceTravelled) * 100;
    }
}