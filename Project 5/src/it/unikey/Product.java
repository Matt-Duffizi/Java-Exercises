package it.unikey;

public abstract class  Product {
    /// ATTRIBUTES--------------------------------------------------------
    private String name;
    private double price = 10;

    /// CONSTRUCTORS--------------------------------------------------------
    public Product() {
    }

    public Product(double price) {
        this.price = price;
    }

    /// GETTERS--------------------------------------------------------
    public double getPrice() {
        return price;
    }

    /// SETTERS--------------------------------------------------------
    public double setPrice(double price) {
        this.price = price;
        return price;
    }
}
