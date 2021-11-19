package com.company;

public class Customer {
    private String Fname;
    private String Lname;
    private long personummer;
    // lista med kundens alla konton
    //test


    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public long getPersonummer() {
        return personummer;
    }


}
