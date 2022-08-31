package it.unikey;

public class Main {
    public static void main(String[] args) {
        Sculpture mose = new Sculpture("Michelangelo","Mose",120,90,150);
        Portrait monnalisa = new Portrait("Leonardo","Monnalisa",45,75);

        ArtPiece[] lista = {mose,monnalisa};

        Collection collection = new Collection("Palazzo Fiorentini",lista);

        collection.printCollection();

        System.out.println("\nLa dimensioni in cm cubi del Mosé:\n" + collection.dimension("Mose"));

    }
}
