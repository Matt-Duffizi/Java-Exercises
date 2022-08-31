package it.unikey;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        ArrayList<Passenger> passeggeri = new ArrayList<>();
        passeggeri.add(new Passenger(28, "Francesco", "Di Rosa", "FVKEKE"));
        passeggeri.add(new Passenger(25, "Sara", "Gaudiosi", "89KEFE"));
        passeggeri.add(new Passenger(23, "Camillo", "Positano", "5FKEKE"));
        passeggeri.add(new Passenger(26, "Matteo", "Rossi", "CDK452"));
        passeggeri.add(new Passenger(28, "Matteo", "Bianchi", "ERC55C"));
        passeggeri.add(new Passenger(38, "Simone", "Di Stasio", "CDKEKE"));
        for (Passenger p: passeggeri
             ) {
            System.out.println(p);
        }

        char c = 'c';
        ArrayList<Passenger> new_list = new ArrayList<>();
        LambdaStartCode startCode = (lista,new_l,ch) -> {
            for (Passenger pas: lista) {
                if ((Passenger) pas.code.toLowerCase()[0] == ch) new_l.add(pas);
            }
            return new_l;
        };

        startCode.startCode(passeggeri,new_list,c);

        System.out.println("\n\n");
        for (Passenger p: new_list
        ) {
            System.out.println(p);
        }


    }

}
