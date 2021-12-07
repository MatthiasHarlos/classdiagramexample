package com.newenergytrading.classdiagramexample;

import java.util.List;

public class Adresse {

    private String address;
    private List<Geschaeftskunde> geschaeftskunden;
    private List<PrivatKunde> privatkunden;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
