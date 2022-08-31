package it.unikey;

public class Main {
    public static void main(String[] args) {
        Cookies cookies = new Cookies(2);
        System.out.println(cookies.getPrice());
        Vegetables veg = new Vegetables(2, 4);
        System.out.println(veg.getPrice());
    }
}
