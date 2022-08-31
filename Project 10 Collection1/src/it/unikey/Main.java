package it.unikey;

public class Main {
    public static void main(String[] args) {

        AddressBook contacts = new AddressBook();
        contacts.addContact("Marco", "Fosti", "3443242");

        System.out.println("First Call");
        System.out.println(contacts.toString());

        contacts.addContact("Elio", "Germano", "3398489");
        System.out.println("Second Call");
        System.out.println(contacts.toString());

        contacts.deleteContact("Elio", "Germano");
        System.out.println("Thrid Call");
        System.out.println(contacts.toString());

    }
}
