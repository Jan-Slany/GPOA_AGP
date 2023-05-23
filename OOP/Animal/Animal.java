public class Animal {
    private String Type;
    private String Name;
    private double Weight;

    public Animal(String type, String name, double weight) {
        this.Type = type;
        this.Name = name;
        this.Weight = weight;
    }

    // setting values
    public void setType(String type) {
        Type = type;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    // getting values
    public String getType() {
        return Type;
    }

    public String getName() {
        return Name;
    }

    public double getWeight() {
        return Weight;
    }

    // functions
    public double FeedRations(double weight) {
        return (weight / 100) * 2;
    }
}
