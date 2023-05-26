public class MusicalInstrument {
    private String type;
    private String brand;
    private double price;

    public MusicalInstrument(String type, String brand, double price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    // setting values
    public void setType(String type) {
        type = type;
    }

    public void setBrand(String brand) {
        brand = brand;
    }

    public void setPrice(double price) {
        price = price;
    }

    // getting values
    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    // functions
    public static double AverageNumberOfNotesPerMinute(int notesPlayed, int timePlayed) {
        return notesPlayed / timePlayed;
    }
}
