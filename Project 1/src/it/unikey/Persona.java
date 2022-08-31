package it.unikey;

public class Persona {

    public String nome;
    public String cognome;
    int eta;
    public String sesso;

    public Persona() {
        this.nome = "nome di default";
    }

    public Persona(String nome, String cognome, int eta, String sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.sesso = sesso;
    }

    String stampainfo(String nome,String cognome,int eta){
        return "Nome: " + nome
                + "/nCognome: " + cognome
                + "/nEtà: " + eta;

    }

}
