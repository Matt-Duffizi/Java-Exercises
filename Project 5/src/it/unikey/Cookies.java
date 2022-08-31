package it.unikey;

public class Cookies extends Product {
    /// ATTRIBUTES--------------------------------------------------------------
    private int conf;

    /// CONSTRUCTORS------------------------------------------------------------
    public Cookies(int conf) {
        this.conf = conf;
        super.setPrice(setPrice(super.getPrice()));
    }

    /// GETTER AND SETTER--------------------------------------------------------
    public double getPrice() {
        return super.getPrice();
    }

    public double setPrice(double price) {
        if (conf == 0)
            price = price;
        else if (conf == 1)
            price = price * 1.5;
        else
            price = price * 2;
        return price;
    }
}
