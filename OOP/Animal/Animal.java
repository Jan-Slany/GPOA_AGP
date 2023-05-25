public class Animal {
    private String type;
    private String name;
    private double weight;

    public Animal(String type, String name, double weight) {
        this.type = type;
        this.name = name;
        this.weight = weight;
    }

    // setting values
    public void setType(String type) {
        type = type;
    }

    public void setName(String name) {
        name = name;
    }

    public void setWeight(double weight) {
        weight = weight;
    }

    // getting values
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    // functions
    public double FeedRations(double weight) {
        return (weight / 100) * 2;
    }
}
