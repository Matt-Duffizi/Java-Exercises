package it.unikey;

public class Collection {
    String name;
    ArtPiece[] list;

    public Collection(String name) {
        this.name = name;
    }

    public Collection(String name, ArtPiece[] list) {
        this.name = name;
        this.list = list;
    }

    public void setList(ArtPiece[] list) {
        this.list = list;
    }

    public void addArt(ArtPiece a){
        ArtPiece[] temp = this.list.clone();
        ArtPiece[] temp_2 = new ArtPiece[list.length + 1];
        for (int i = 0 ; i < list.length;i++){
            if (i == list.length -1) {
                temp_2[i] = a;
            } else {
                temp_2[i] = temp[i];
            }
        }
        this.list = temp_2;
    }

    public void printCollection(){
        System.out.println("La collezione " + name);
        for (ArtPiece art:
             list) {
            System.out.println(art.getTitle());
            System.out.println(art.toString());
        }
    }

    public double dimension(String art_name) {
        double ret = 0;
        for (ArtPiece art : list) {
            if (art.getTitle().equals(art_name)) {
                ret = art.printsize();
            }
        }
        return ret;
    }
}
