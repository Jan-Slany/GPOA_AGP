public class Product {
    private String Name;
    private double Price;
    private int PiecesInStock;

    public Product(String name, double price, int inStock){
        this.Name = name;
        this.Price = price;
        this.PiecesInStock = inStock;
    }

    // setting values
    public void setName(String name) {
        Name = name;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setPiecesInStock(int piecesInStock) {
        PiecesInStock = piecesInStock;
    }

    // getting values
    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }

    public int getPiecesInStock() {
        return PiecesInStock;
    }

    // functions
    public static double StocksInWarehouse(double price, int inStock) {
        return price * inStock;
    }
}
