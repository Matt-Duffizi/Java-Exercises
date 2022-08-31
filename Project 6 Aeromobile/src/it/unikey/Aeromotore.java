package it.unikey;

import java.util.Objects;

public class Aeromotore extends Aeromobile implements CMP{
    double power;

    public Aeromotore(String model, double power) {
        this.model = model;
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Aeromotore{" +
                "power=" + power +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aeromotore that = (Aeromotore) o;
        return Double.compare(that.power, power) == 0 && model.equals(that.model);
    }

    public boolean performance(Object o) {
        if (this == o) return false;
        if (o == null || getClass() != o.getClass()) return false;
        Aeromotore that = (Aeromotore) o;
        if (that.power >= power) return false;
        else return true;

    }
}
