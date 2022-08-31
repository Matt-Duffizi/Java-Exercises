package it.unikey;

public class Main {

    public static void main(String[] args) {
        ChristmasTree albero = new BubbleLight(new ChristmasTreeImpl());
        System.out.println(albero.decorate());
    }
}
