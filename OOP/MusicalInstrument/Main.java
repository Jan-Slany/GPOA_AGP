public class Main {
    public static void main(String[] args) {
        MusicalInstrument instrument = new MusicalInstrument("wind instrument", "Thomann", 1222.30);

        System.out.println(
                "Type: " + instrument.getType() +
                "\nBrand: " + instrument.getBrand() +
                "\nPrice: " + instrument.getPrice()
        );

        System.out.printf("\nThe average number of notes played per minute is %.2f notes", instrument.AverageNumberOfNotesPerMinute(324, 5));
    }
}
