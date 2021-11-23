package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String Fname;

    private long personummer;
    private List<Account> Accounts;
    // lista med kundens alla Account
    //test


    public Customer(String fname, Long personummer) {
        this.personummer = personummer;
        this.Fname = fname;
        Accounts = new ArrayList<>();
    }

    public String getFname() {
        return Fname;
    }





    public long getPersonummer() {
        return personummer;
    }


}
