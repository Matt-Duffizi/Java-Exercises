package it.unikey;

public class Main {
    public static void main(String[] args) {
        Aeromotore aero1 = new Aeromotore("aero1", 78);
        Aeromotore aero2 = new Aeromotore("aero2", 34);
        Aeromotore aero3 = new Aeromotore("aero3", 109);
        Aeromotore aero4 = new Aeromotore("aero1", 78);

        System.out.println(aero1.getPower());
        System.out.println(aero1.toString());

        System.out.println(aero1.performance(aero2));
        System.out.println(aero1.performance(aero3));

        System.out.println(aero1.equals(aero2));
        System.out.println(aero1.equals(aero4));
    }
}
