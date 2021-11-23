package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank {



     private List<Customer> Customers;

    public Bank() {
        Customers = new ArrayList<>();
    }

    public void AddCustomer(Customer customer){
        Customers.add(customer);
    }

    public List<String> getCustommersInfo(){
        List<String> info = new ArrayList<>();
        for(var customer : Customers)
        {


            String customerInfo = "Customer Name: " + customer.getFname() + "\n" +
                    "Customer personummer: " + customer.getPersonummer() + "\n";
            info.add(customerInfo);

        }
        return info;
    }
    public List<String> getCustommer(Long personummer){
        List<String> cust = new ArrayList<>();
        for (var customer : Customers){
            if (personummer == customer.getPersonummer()){
                cust.add(customer.getFname());
            }else {

            }

        }
        return cust;





    }
}
