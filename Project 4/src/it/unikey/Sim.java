package it.unikey;

import java.util.Arrays;
import java.util.Objects;

public class Sim {
    // ATTRIBUTES -------------------------------------------------------------
    private String number;
    private double credit;
    private String[] call_list = new String[0];
    private double duration_min = 0;


    // CONSTRUCTORS -------------------------------------------------------------
    public Sim() {
        credit = 20.00;
    }

    public Sim(String number) {
        this.number = number;
    }

    public Sim(String number, double credit) {
        this.number = number;
        this.credit = credit;
    }

    // SETTERS ---------------------------------------------------------------------------
    public void setNumber(String number) {
        this.number = number;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void setDuration_min(double duration_min) {
        this.duration_min = duration_min;
    }

    // GETTERS ---------------------------------------------------------------------------
    public String getNumber() {
        return number;
    }

    public double getCredit() {
        return credit;
    }

    public String[] getCall_list() {
        return call_list;
    }

    public double getDuration_min() {
        return duration_min;
    }

    // METHODS ---------------------------------------------------------------------------
        // INFO---------------------
    public void info(){
        System.out.println("Numero: " + getNumber());
        System.out.println("Saldo Rimanente: " + getCredit());
        System.out.println("Lista chiamate: " + Arrays.toString(getCall_list()));

    }
        // TONUMBER---------------------
    public int toNumber(String to_number){
        int num = 0;
        for (int i = 0; i < call_list.length; i++){
            if(Objects.equals(call_list[i], to_number))
                num++;
        }
        return num;
    }


    // REGISTER---------------------
    public void register(String number, double minutes){
        String[] s_copy = call_list.clone();
        call_list = new String[s_copy.length + 1];
        for(int i = 0; i < call_list.length; i++){
            if(i==(call_list.length -1)){
                call_list[i] = number;
            } else {
                call_list[i] = s_copy[i];
            }
        }
        setDuration_min(duration_min+minutes);
    }
}
