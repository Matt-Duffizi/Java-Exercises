package it.unikey;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {

        // suppongo che il palazzo abbia solo 10 piani
        Scanner scanner = new Scanner(System.in);
        System.out.println("In che piano ti trovi?");
        int start = scanner.nextInt();

        System.out.println("Che piano vuoi raggiungere?");
        int des = scanner.nextInt();

        // nel caso di valori oltre i limiti
        while(start >= 10 || start <= 0 || des >= 10 || des <= 0 || start == des){
            if(start >= 10 || start <= 0) {
                System.out.println("Piano di partenza non esiste");
                System.out.println("Immetti di nuovo in che piano ti trovi?");
                start = scanner.nextInt();
            } else if(des >= 10 || des <= 0){
                System.out.println("Piano di arrivo non esiste");
                System.out.println("Immetti di nuovo che piano vuoi raggiungere?");
                des = scanner.nextInt();
            } else {
                    System.out.println("Sei già su quel piano, genio!");
                    System.out.println("Immetti di nuovo in che piano ti trovi?");
                    start = scanner.nextInt();
                    System.out.println("Immetti di nuovo che piano vuoi raggiungere?");
                    des = scanner.nextInt();
                }
        }

        System.out.println("Piano in cui sei: " + start);
        System.out.println("Piano di destinazione: " + des);
        System.out.println("Viaggio...");

        while(start < des){
            start++;
            System.out.println("Viaggio: " + start);
        }

        while(start > des){
            start--;
            System.out.println("Viaggio: " + start);
        }
        System.out.println("Sei arrivato a destinazione!");


    }
}
