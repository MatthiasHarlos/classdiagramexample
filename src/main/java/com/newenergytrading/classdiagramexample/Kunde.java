package com.newenergytrading.classdiagramexample;

import java.util.List;

public class Kunde {

    private List<Konto> konten;
    private List<Adresse> addresses;

    public Kunde(List<Konto> konten, List<Adresse> addresses) {
        this.konten = konten;
        this.addresses = addresses;
    }

    public List<Konto> getKonten() {
        return konten;
    }

    public void setKonten(List<Konto> konten) {
        this.konten = konten;
    }

    public List<Adresse> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Adresse> addresses) {
        this.addresses = addresses;
    }
}
