package com.company;

import java.util.List;

public class Account {
    private int Balance;

    // Om det är kontotyp A eller B Får klura på dena kan ändra till int. eller bara debitcard ?
    private String Kontotyp;
    // validation för komma in på rätt  balance fält ? Accountid
    private int Kontonummer;

    private long accountNumber;


    public Account(int balance, String kontotyp, int kontonummer ,long accountNumber) {
        Balance = balance;
        Kontotyp = kontotyp;
        Kontonummer = kontonummer;
        this.accountNumber = accountNumber;

    }

    public Account(int kontonummer) {
        Kontonummer = kontonummer;
    }



    public Account(int balance, String kontotyp) {
        Balance = balance;
        Kontotyp = kontotyp;
    }

    public Account() {

    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public String getKontotyp() {
        return Kontotyp;
    }

    public int getKontonummer() {
        return Kontonummer;
    }


    public long getAccountNr() {
        return accountNumber;
    }

    public void createAccountNr(long accountNumber) {
        this.accountNumber = accountNumber;
    }
}
