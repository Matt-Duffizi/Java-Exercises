package it.unikey;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int pin = 1212;
        System.out.println("Valori PIN: numeri interi da 0 a 9999");

        while (counter<5){

            System.out.println("Inserisci il PIN");

            int inp = scanner.nextInt();

            while ((inp >= Math.pow(10,4) || inp < 0) && counter < 5){
                System.out.println("PIN oltre i limiti");
                System.out.println("Valori PIN: numeri interi da 0 a 9999");
                System.out.println("Tentativi rimasti: " + (4-counter));
                counter++;
                if (counter == 5){
                    System.out.println("Nessun tentativo rimanente");
                    System.out.println("Accesso negato!");
                } else {
                    System.out.println("Inserisci il PIN");
                    inp = scanner.nextInt();
                }
            }

            if(inp == pin){
                System.out.println("PIN Corretto!");
                System.out.println("Accesso consentito!");
                counter = 5;
            } else if (counter != 4){
                System.out.println("PIN Errato!");
                System.out.println("Tentativi rimasti: " + (4-counter));
                counter++;
            } else {
                System.out.println("PIN Errato!");
                System.out.println("Nessun tentativo rimanente");
                System.out.println("Accesso negato!");
                counter = 5;
            }

        }

    }
}