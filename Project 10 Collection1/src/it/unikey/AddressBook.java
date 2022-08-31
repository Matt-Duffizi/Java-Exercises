package it.unikey;

import java.util.ArrayList;

public class AddressBook {
    ArrayList<Contact> contactList = new ArrayList<>();

    public void addContact(String name, String surname, String phone){
        Contact contact = new Contact(name, surname, phone);
        contactList.add(contact);
    }

    public void deleteContact(String name, String surname){
        contactList.removeIf(c -> c.name.equals(name) && c.surname.equals(surname));
    }

    public String search(String name, String surname){
        for(Contact c: contactList){
            if (c.name.equals(name) && c.surname.equals(surname)) return c.phone;
        }
        return null;
    }

    @Override
    public String toString() {
        if (contactList == null) return null;
        else {
            String result = "";
            for(Contact c: contactList){
                result = result + String.valueOf(contactList.indexOf(c) +1) + " "
                        + c.name + " " + c.surname + " " + c.phone + "\n";
            }
            return result;
        }
    }
}

