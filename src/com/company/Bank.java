package com.company;

import java.util.ArrayList;

import java.util.List;

public class Bank {
    private List<Customer> Customers;

    public Bank() {
        Customers = new ArrayList<>();
    }

    // lägger till customer metod
    public void AddCustomer(Customer customer) {
        Customers.add(customer);
    }

    // Skapar account till customer
    public long AddAccount(long personummer) {
        for (var customer : Customers) {
            if (personummer == customer.getPersonummer()) {
                customer.addAccount();
                return customer.gettaccnumber();
                // retunera accnummer ?

            }
        }return -1;
    }

    // Får information om en specefik custommer
    public List<String> getCustommer(Long personummer) {
        List<String> cust = new ArrayList<>();
        for (var customer : Customers) {
            if (personummer == customer.getPersonummer()) {

                cust.add(customer.getFname() + " " + customer.getPersonummer());
                cust.add(String.valueOf(customer.getaccs()));
            }

        }
        return cust;


    }

    // får information om alla customers
    public List<String> getCustommersInfo() {
        List<String> info = new ArrayList<>();
        for (var customer : Customers) {
            String customerInfo = "Customer Name: " + customer.getFname() + "\n" +
                    "Customer personummer: " + customer.getPersonummer() + "\n";
            info.add(customerInfo);

        }
        return info;
    }


    /*    public String getAccount(long personummer){
        for (var custommer : Customers){
            if (personummer == custommer.getPersonummer()){
                String info = "Balance ";
                 return info;
            }
        }return null;
    }*/


    /// Får information om accounts specefikt för en customer
    public List<String> getAccsInfo(long pnr) {
        List<String> info = new ArrayList<>();
        for (var cust : Customers) {
            if (cust.getPersonummer() == pnr) {
                info.add(cust.getFname());
                info.add("  ");

                info.addAll(cust.getaccs());
            }
        }
        return info;
    }

    // Sätter in penger
    public boolean deposit(long persnummer, long accountnummer, int balance) {
        for (var customer : Customers) {
            if (persnummer == customer.getPersonummer()) {
                customer.depositsetsaldo(accountnummer, balance);
                return true;
            }
        }
        return false;
    }

    // Tar ut pengar
    public boolean withdraw(long persnummer, long accountnummer, int balance) {
        for (var customer : Customers) {
            if (persnummer == customer.getPersonummer()) {
                customer.withdrawsetsaldo(accountnummer, balance);
                return true;
            }
        }
        return false;
    }


    // ändrar namn på en customer
    public boolean ChangeCustommerName(String nyaname, Long personummer) {
        // Kollar igenom listan stämmer personummret gör if
        for (var customer : Customers) {
            if (personummer == customer.getPersonummer()) {
                customer.setFname(nyaname);
                return true;
            }

        }
        return false;
    }

    //Remove custommer
    public List<String> RemoveCustomer(long persnum) {
        List<String> info = new ArrayList<>();
        // Kollar igenom listan stämmer personummret gör if
        // lägger till information i listan info
        // Tar bort kunden sen stoppar Break;
        for (var customer : Customers) {
            if (persnum == customer.getPersonummer()) {
                info.add("Customer:  "+customer.getFname() + "  " + customer.getPersonummer() +
                        " Konton na som är bortaggna:");
                info.add(customer.removeAccounts());
                Customers.remove(customer);
                break;

            }
        }
        return info;

    }

    // remove account
    public String CloseAccount(long persnum, int accountnumber) {


        for (var customer : Customers) {
            if (persnum == customer.getPersonummer()) {
                //String borta = customer.removeAccounts() + "De kontot som är kvar är" ;



                customer.Removeaccount(accountnumber);
                //String borta = customer.getaccs() + "De kontot som är kvar är" ;
                String borta = customer.removeAccounts() + "De kontot som är kvar är" ;
                return borta;

            }
        }
        return null;

    }

}
