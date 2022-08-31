package it.unikey;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Museum {
    ArtPiece[] sala;
    HashSet<ArtPiece> deposito = new HashSet<>();

    public Museum(int spazi) {
        this.sala = new ArtPiece[spazi];
    }

    public void addArt(ArtPiece a){
        if (this.sala[sala.length-1] == null){
            for(int i = 0; i < sala.length; i++)
                if(sala[i] == null ) {
                    sala[i] = a;
                    break;
                }
        } else {
            deposito.add(a);
        }

    }

    public void move(ArtPiece a){
        int null_counter = 0;
        for(int i = 0; i < sala.length; i++){
            if (sala[i] == null) null_counter++;
        }

        ArrayList<ArtPiece> salaArr = new ArrayList<>();
        salaArr.addAll(Arrays.asList(sala));

        if (!(deposito.contains(a) || salaArr.contains(a))){
            System.out.println("L'opera " + a.title + " non è nel museo, non può essere spostata");
        }


        if (deposito.contains(a) && null_counter == 0){
            System.out.println("Sala piena sposta prima un'opera in deposito");
        } else if (deposito.contains(a) && null_counter != 0){
            for(int i = 0; i < sala.length; i++)
                if(sala[i] == null ) {
                    sala[i] = a;
                    deposito.remove(a);
                    System.out.println("hai spostato dal deposito alla sala:" + a.title);
                    break;}
        }  else {
            for(int i = 0; i < sala.length; i++){
                    if (sala[i].hashCode() == a.hashCode()){
                        deposito.add(a);
                        sala[i] = null;
                        System.out.println("hai spostato dalla sala al depostio:" + a.title);
                        break;
                    }

                }
        }

    }

    public void search(ArtPiece a){
        for(ArtPiece art : sala){
            if (art.hashCode() == a.hashCode()) System.out.println("L'opera " + a.title + " si trova nella Sala d'Esposizione");
        }
        if (deposito.contains(a)){
            System.out.println("L'opera " + a.title + " è in Deposito");
        } else {
            System.out.println("L'opera " + a.title + " non è nel museo");
        }
    }

    public String printSala(){
        String result = "Print sala \n";
        for(ArtPiece a: sala) {
            result = result + " " + a.title + " " + a.author + "\n";
        }
        return result;
    }

    public String printDeposito(){
        String result = "Print Deposito \n";
        for(ArtPiece a: deposito) {
            result = result + " " + a.title + " " + a.author + "\n";
        }
        return result;
    }
}
