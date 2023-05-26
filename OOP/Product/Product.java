public class Product {
    private String name;
    private double price;
    private int PpiecesInStock;

    public Product(String name, double price, int inStock){
        this.name = name;
        this.price = price;
        this.piecesInStock = inStock;
    }

    // setting values
    public void setName(String name) {
        name = name;
    }

    public void setPrice(double price) {
        price = price;
    }

    public void setPiecesInStock(int piecesInStock) {
        piecesInStock = piecesInStock;
    }

    // getting values
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getPiecesInStock() {
        return piecesInStock;
    }

    // functions
    public static double StocksInWarehouse(double price, int inStock) {
        return price * inStock;
    }
}
