package it.unikey;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Tutor extends Person implements Comparable<Tutor>{
    private int birth;

    public Tutor(String name, String surname, int date) {
        super(name, surname);
        this.birth = date;
    }

    public int getBirth() {
        return birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tutor tutor = (Tutor) o;
        return Objects.equals(birth, tutor.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getSurname(), birth);
    }

    @Override
    public int compareTo(Tutor o) {
        return Comparator.comparing((Tutor t) -> t.getSurname()).thenComparing(t -> t.getName()).compare(this,o);
    }
}
