package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer {

     // State
    // lagrar värden
    private String Fname;

    private long personummer;
    // lista med kundens alla Account
    private List<Account> Accounts;
    //**************************



    public Customer(String fname, Long personummer) {
        this.personummer = personummer;
        this.Fname = fname;
        Accounts = new ArrayList<>();
    }

    public Customer(long personummer) {
        this.personummer = personummer;
        Accounts = new ArrayList<>();
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getFname() {
        return Fname;
    }



    public long getPersonummer() {
        return personummer;
    }
    public long depositsetsaldo(long accountnumber, int saldo ){
        for (var acc : Accounts){
             if (accountnumber == acc.getAccountNr()){
                  int b = acc.getBalance();
                  int s = b + saldo;
                  acc.setBalance(s);
                 return s;

             }
        }return accountnumber;


    }

    public long withdrawsetsaldo(long accountnumber, int saldo ){
        for (var acc : Accounts){
            if (accountnumber == acc.getAccountNr() && saldo <= acc.getBalance()){
                int b = acc.getBalance();
                int s = b - saldo;
                acc.setBalance(s);
                return s;

            }
        }return accountnumber;


    }



    public List<String> getaccs(){
        List<String> info = new ArrayList<>();
        for(var acc : Accounts)
        {
            String customerInfo = "Account type: " + acc.getKontotyp() + "\n" +
                    "Account number: " + acc.getAccountNr() + "\n" +
                    "Saldo " + acc.getBalance() + "\n";
            info.add(customerInfo);

        }
        return info;
    }
    
    public long gettaccnumber(){
        long num = 0;
        for (var acc: Accounts){
            num = acc.getAccountNr();
            
             
        }return num; 
    }


    public long addAccount() {
        Account account = new Account(0 ,"debit");

        long nextAccountNr = 1000;
        for (Account value : Accounts) {

            if (nextAccountNr < value.getAccountNr()) {
                nextAccountNr = value.getAccountNr();
            }
        }
        nextAccountNr += 1;
        account.createAccountNr(nextAccountNr);



        Accounts.add(account);

        return nextAccountNr;
    }

    public int Removeaccount(int accountnum){
        Accounts.removeIf(account -> accountnum == account.getAccountNr());
        return accountnum;
    }

    public String removeAccounts(){

        StringBuilder builder = new StringBuilder();
        for (var acc : Accounts){
            builder.append(" Account number:  ").append(String.valueOf(acc.getAccountNr()))

                    .append(" Balance:  ").append(String.valueOf(acc.getBalance()))
                    .append(" Kontotyp: ").append(acc.getKontotyp()).append("\n");

        }
        Accounts.removeAll(Accounts);
        String line = builder.toString();
        return line;
    }

}