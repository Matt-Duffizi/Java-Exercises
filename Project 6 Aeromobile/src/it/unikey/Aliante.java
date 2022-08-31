package it.unikey;

import java.util.Objects;

public class Aliante extends Aeromobile implements CMP{
    int efficiency;

    public Aliante(String model, int efficiency) {
        this.model = model;
        this.efficiency = efficiency;
    }

    public int getEfficiency() {
        return efficiency;
    }

    @Override
    public String toString() {
        return "Aliante{" +
                "efficiency=" + efficiency +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aliante aliante = (Aliante) o;
        return efficiency == aliante.efficiency && this.model.equals(aliante.model);
    }


    public boolean performance(Object o) {
        if (this == o) return false;
        if (o == null || getClass() != o.getClass()) return false;
        Aliante that = (Aliante) o;
        if (that.efficiency >= efficiency) return false;
        else return true;
    }
}
