public class Main {
    public static void main(String[] args) {
        Product item = new Product("GitHub sticker", 24.13, 36);

        System.out.println(
                "Product name: " + item.getName() +
                "\nItem price: " + item.getPrice() +
                "\nItems in warehouse: " + item.getPiecesInStock()
        );

        System.out.println("\nTotal price of all stocks in the warehouse: " + item.StocksInWarehouse(item.getPrice(), item.getPiecesInStock()));
    }
}
