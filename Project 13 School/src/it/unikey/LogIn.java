package it.unikey;

import javax.swing.*;
import java.util.Scanner;

public class LogIn {
    Scanner scanner = new Scanner(System.in);
    static int tryAllowed = 4;
    final static int password = 1212;
    static int counter = 0;

    public LogIn() {
    }

    public boolean logIn(){
        System.out.println("Benvenuto, inserisci il pin di 4 cifre: ");
        while (counter < 4){
            int input = scanner.nextInt();
            if (input == password){
                System.out.println("Password Corretta");
                return true;
            } else {
                counter++;
                System.out.println("Password Errata");
                System.out.println("Tentativi rimasti: " + (4-counter));
            }
        }
        System.out.println("Sessione terminata");
        return false;
    }
}
