public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("dog", "Sushi", 9.3);

        System.out.println(
                "Animal type: " + animal.getType() +
                "\nAnimal name: " + animal.getName() +
                "\nAnimal weight: " + animal.getWeight()
        );

        System.out.printf("\nFeed ration: %.2f kg", animal.FeedRations(animal.getWeight()));
    }
}
