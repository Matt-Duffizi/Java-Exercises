package it.unikey;

public class Portrait extends ArtPiece{
    double length;
    double depth;



    public Portrait(String author, String title, double length,double depth) {
        super(author, title);
        this.length = length;
        this.depth = depth;
    }


    @Override
    public double printsize() {return length*depth;}

    @Override
    public String toString() {
        return "Portrait{" +"author=" + getAuthor() +
                ", title=" + getTitle() +
                ", length=" + length +
                ", depth=" + depth +
                "}\n";
    }
}
