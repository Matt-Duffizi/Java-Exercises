package it.unikey;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero di cui vuoi il fattoriale");
        System.out.println("Il numero deve essere minore di 15, ma maggiore di 0");
        int inp = scanner.nextInt();
        int fat = 1;
        while(inp >= 15 || inp < 0){
            System.out.println("Il numero deve essere minore di 15, ma maggiore di 0");
            System.out.println("Inserisci di nuovo il numero di cui vuoi il fattoriale");
            inp = scanner.nextInt();
        }

        for(int counter = 1; counter <= inp;counter++){
            fat = counter * fat;
        }

        System.out.println("Il fattoriale:" + fat);





    }
}
