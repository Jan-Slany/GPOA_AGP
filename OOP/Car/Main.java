public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan", "Terrano II", 1993, 124132);

        System.out.println(
                "Car brand: " + car.getBrand() +
                "\nCar model: " + car.getModel() +
                "\nYear of manufacture: " + car.getManufactureYear() +
                "\nKilometres driven: " + car.getKilometresDriven()
        );

        System.out.printf("\nAverage consumption per 100 km: %.2f l", car.AverageFuelConsumption(100, car.getKilometresDriven()));
    }
}
