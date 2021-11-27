package com.company;

import java.util.List;

public class Account {

    // State blueprint

    private int Balance;
    private String Kontotyp;
    private long accountNumber;
    // **********************

    /// construkter
    public Account(int balance, String kontotyp ,long accountNumber) {
        Balance = balance;
        Kontotyp = kontotyp;

        this.accountNumber = accountNumber;

    }
    // construkter som tar in värderna int och string som andvänds
    public Account(int balance, String kontotyp) {
        Balance = balance;
        Kontotyp = kontotyp;
    }

    /// Getter till balance som tillåter mig att hämta datan/info om saldot på kontot.
    public int getBalance() {
        return Balance;
    }
    // Setter till balance som har funktionen att ändra värdet i balance
    public void setBalance(int balance) {
        Balance = balance;
    }
    /// Getter till kontotyp som tillåter mig att hämta datan/info om kontotypen på kontot.
    // vilket i detta fallet kommer alltid vara debit.
    public String getKontotyp() {
        return Kontotyp;
    }



    // Getter till AccountNr  gör att jag kan hämta accountnumber
    public long getAccountNr() {
        return accountNumber;
    }
  /// Metod som skapar accnummer som kopplad till en annan metod i customer. ( void så tar endast emot)
    public void createAccountNr(long accountNumber) {
        this.accountNumber = accountNumber;
    }
}
