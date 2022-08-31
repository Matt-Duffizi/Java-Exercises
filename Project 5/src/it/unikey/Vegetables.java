package it.unikey;

public class Vegetables extends Product{
    /// ATTRIBUTES--------------------------------------------------------
    private int type;

    /// CONSTRUCTORS--------------------------------------------------------
    public Vegetables(int type, float kg) {
        this.type = type;
        super.setPrice(setPrice(super.getPrice()) * kg);
    }

    /// GETTER AND SETTER--------------------------------------------------------
    public double getPrice() {
        return super.getPrice();
    }

    public double setPrice(double price) {
        if (type == 1)
            price = price;
        else if (type == 2)
            price = price * 1.2;
        else if (type == 3)
            price = price * 1.5;
        else if (type == 4)
            price = price * 1.8;
        else if (type == 5)
            price = price * 2.0;
        else
            price = price * 2.5;
        return price;
    }
}


