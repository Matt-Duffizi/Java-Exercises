package it.unikey;

public class Sculpture extends ArtPiece{

    double length;
    double depth;
    double hight;

    public Sculpture(String author, String title, double length,double depth, double hight) {
        super(author, title);
        this.length =length;
        this.depth = depth;
        this.hight = hight;
    }

    @Override
    public double printsize() {
        return length*depth*hight;
    }

    @Override
    public String toString() {
        return "Sculpture{" +
                "author=" + getAuthor() +
                ", title=" + getTitle() +
                ", length=" + length +
                ", depth=" + depth +
                ", hight=" + hight +
                "}\n";
    }
}
