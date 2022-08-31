package it.unikey;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Wallet wallet1;
        System.out.println("Benvenuto nel tuo portafoglio");
        System.out.println("Sei già nostro cliente? Si/No");
        String newclient = scanner.next();

        // controllo imput
        while (!(newclient.equals("Si") || newclient.equals("No"))){
            System.out.println("Input non riconosciuto");
            System.out.println("Sei già nostro cliente? Si/No");
            newclient = scanner.next();
        }

        // Tipo di cliente
        if (newclient.equals("No")) {
            wallet1 = new Wallet();
            System.out.println("Benvenuto nel tuo portafoglio");
            System.out.println("Il tuo saldo iniziale è: " + wallet1.balance + " €");
            System.out.println("Aggiungi il tuo primo deposito");
            double amount = scanner.nextInt();

            // controllo valore
            while (amount <= 0){
                System.out.println("Non puoi utilizzare un numero negativo o pari a 0");
                System.out.println("Immetti di nuovo il valore che vuoi depositare");
                amount = scanner.nextInt();
                scanner.nextLine();
            }

            wallet1.deposit(amount);
            scanner.nextLine();
        } else {

            System.out.println("Benvenuto nel tuo portafoglio");
            System.out.println("Immetti il valore del tuo saldo: ");
            double amountNew = scanner.nextInt();

            // controllo valore
            while (amountNew <= 0){
                System.out.println("Non puoi utilizzare un numero negativo o pari a 0");
                System.out.println("Immetti di nuovo il valore del tuo saldo");
                amountNew = scanner.nextInt();
                scanner.nextLine();
            }

            wallet1 = new Wallet(amountNew);
            scanner.nextLine();
        }


        /// Menu Cliente

        System.out.println("Benvenuto nel tuo portafoglio");
        System.out.println("Il tuo saldo è: " + wallet1.balance + " €");
        System.out.println("Le azioni disponibili sono:\n\nRitira\nDeposita\nVisualizza saldo\nEsci");
        System.out.println("Cosa desideri fare?");

        String input = scanner.nextLine();

        while (!(input.equals("Esci"))) {

            switch (input) {
                case "Ritira":
                    System.out.println("Quanto vuoi ritrare?");
                    double withdraw = scanner.nextDouble();
                    scanner.nextLine();

                    while (withdraw <= 0 || withdraw >= wallet1.balance){
                        System.out.println("Non puoi utilizzare un numero negativo, pari a 0, o maggiore del tuo saldo");
                        System.out.println("Saldo " + wallet1.balance + " €");
                        System.out.println("Immetti di nuovo il valore");
                        withdraw = scanner.nextInt();
                        scanner.nextLine();
                    }

                    wallet1.withdraw(withdraw);
                    System.out.println("Hai ritirato " + withdraw+ " €");
                    System.out.println("Saldo Aggiornato " + wallet1.balance + " €");
                    System.out.println("Attesa Nuovo comando\nLista comandi:\n\nRitira\nDeposita\nVisualizza saldo\nEsci");
                    input = scanner.nextLine();
                    break;

                case "Deposita":
                    System.out.println("Quanto vuoi depositare?");
                    double deposit = scanner.nextDouble();
                    scanner.nextLine();

                    while (deposit <= 0){
                        System.out.println("Non puoi utilizzare un numero negativo o pari a 0" );
                        System.out.println("Immetti di nuovo il valore?");
                        deposit = scanner.nextInt();
                        scanner.nextLine();
                    }

                    wallet1.deposit(deposit);
                    System.out.println("Hai depositato " + deposit+ " €");
                    System.out.println("Saldo Aggiornato " + wallet1.balance + " €");
                    System.out.println("Attesa Nuovo comando\nLista comandi:\n\nRitira\nDeposita\nVisualizza saldo\nEsci");
                    input = scanner.nextLine();
                    break;

                case "Visualizza saldo":
                    wallet1.show();
                    System.out.println("Attesa Nuovo comando\nLista comandi:\n\nRitira\nDeposita\nVisualizza saldo\nEsci");
                    input = scanner.nextLine();
                    break;

                default:
                    System.out.println("Comando non riconosciuto, riavviare");
                    System.out.println("Attesa Nuovo comando\nLista comandi:\n\nRitira\nDeposita\nVisualizza saldo\nEsci");
                    input = scanner.nextLine();
                    break;
            }

        }

        // Sessione terminata
        System.out.println("Sessione terminata");
    }

}
