package it.unikey;

import java.util.Objects;

public class Painting extends ArtPiece {

    String technique;

    public Painting(String title, String author, String technique) {
        this.title = title;
        this.author = author;
        this.technique = technique;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Painting painting = (Painting) o;
        return title.equals(painting.title) && author.equals(painting.author) && technique.equals(painting.technique);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, technique);
    }

}
