public class MusicalInstrument {
    private String Type;
    private String Brand;
    private double Price;

    public MusicalInstrument(String type, String brand, double price) {
        this.Type = type;
        this.Brand = brand;
        this.Price = price;
    }

    // setting values
    public void setType(String type) {
        Type = type;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setPrice(double price) {
        Price = price;
    }

    // getting values
    public String getType() {
        return Type;
    }

    public String getBrand() {
        return Brand;
    }

    public double getPrice() {
        return Price;
    }

    // functions
    public static double AverageNumberOfNotesPerMinute(int notesPlayed, int timePlayed) {
        return notesPlayed / timePlayed;
    }
}
