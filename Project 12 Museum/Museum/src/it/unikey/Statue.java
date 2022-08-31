package it.unikey;

import java.util.Objects;

public class Statue extends ArtPiece {
    String material;
    double height;

    public Statue(String title, String author, String material, double height) {
        this.title = title;
        this.author = author;
        this.material = material;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Statue statue = (Statue) o;
        return Double.compare(statue.height, height) == 0 && title.equals(statue.title)
                    && author.equals(statue.author) && material.equals(statue.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, material, height);
    }
}
