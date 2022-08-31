package it.unikey;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student("marco", "Faraoni", "54544");
//        Student student_2 = new Student("lEILa", "FaRAoni", "56644");
//        Student student_3 = new Student("Leila", "Santini", "53544");
//        Tutor tutor = new Tutor("Sante","Gabrielli", LocalDate.of(1985,10,2));
//        Tutor tutor_2 = new Tutor("Riccardo","Gabrielli", LocalDate.of(1972,9,12));

        LogIn logIn = new LogIn();
        Menu menu = new Menu();

        if (logIn.logIn()){
            menu.menu();
        }

    }
}
