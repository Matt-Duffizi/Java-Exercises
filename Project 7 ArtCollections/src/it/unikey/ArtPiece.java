package it.unikey;

import java.util.Objects;

public abstract class ArtPiece {
    private String author;
    private String title;

    public ArtPiece(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract double printsize();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArtPiece artPiece = (ArtPiece) o;
        return author.equals(artPiece.author) && title.equals(artPiece.title);
    }

    @Override
    public String toString() {
        return "ArtPiece{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
