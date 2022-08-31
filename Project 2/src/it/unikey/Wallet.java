package it.unikey;

import java.sql.SQLOutput;

public class Wallet {

    public double balance;

    public Wallet(){
        this.balance = 0;
    }

    public Wallet(double balance){
        this.balance = balance;
    }

    public double withdraw(double amount){
        return this.balance = this.balance - amount;

    }

    public double deposit(double amount){
        return this.balance = this.balance + amount;

    }

    public void show(){
        System.out.println("Il tuo saldo è di: " + this.balance + "€");


    }

}
