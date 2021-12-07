package com.newenergytrading.classdiagramexample;

import java.util.List;

public class PrivatKunde extends Kunde{

    private String firstName;
    private String lastName;

    public PrivatKunde(String firstName, String lastName, List<Konto> konten, List<Adresse> postaddresses) {
        super(konten, postaddresses);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
