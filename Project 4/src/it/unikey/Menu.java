package it.unikey;

import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public Menu() {
    }
    public void benvenuto(){
        Sim sim = new Sim();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto sull'interfaccia della tua Sim");
        System.out.println("Cosa desideri fare?");

        String cmd = "menu";
        while (!(cmd.equals("chiudi"))) {

            System.out.println("\nLista Comandi:\nRegistra (registra il tuo numero)\nVisualizza (visualizza saldo)");
            System.out.println("Info (ottieni informazioni generali)\nChiamata (registra una chiamata)\nTempo (tempo complessivo nelle chiamate)");
            System.out.println("Verso (numero di chiamate verso un numero)\nChiudi");
            cmd = scanner.next().toLowerCase(Locale.ROOT);
            switch (cmd){
                case "registra":
                    System.out.println("Digita il tuo numero");
                    String num1 = scanner.next().toLowerCase(Locale.ROOT);
                    System.out.println("hai regristrato " + num1);
                    sim.setNumber(num1);
                    break;
                case "visualizza":
                    System.out.println("Il tuo Credito: " + sim.getCredit());
                    break;
                case "info":
                    sim.info();
                    break;
                case "chiamata":
                    System.out.println("Digita il numero con cui hai parlato");
                    String num2 = scanner.next().toLowerCase(Locale.ROOT);
                    System.out.println("Digita il numero di minuti di chiamata");
                    double min = scanner.nextDouble();
                    sim.register(num2,min);
                    break;
                case "tempo":
                    System.out.println("Tempo di chiamate: \n" +sim.getDuration_min());
                    break;
                case "verso":
                    System.out.println("Digita il numero di chi sei interessato ad ispezionare");
                    String num3 = scanner.next().toLowerCase(Locale.ROOT);
                    System.out.println("Numero chiamate verso:" + num3 + "\n" +sim.toNumber(num3));
                    break;
                default:
                    System.out.println("Comando non valido");
            }
        }

    }
}
