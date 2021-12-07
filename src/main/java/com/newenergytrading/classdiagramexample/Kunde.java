package com.newenergytrading.classdiagramexample;

import java.util.List;

public class Kunde {

    private List<Konto> konten;

    public Kunde(List<Konto> konten, List<Adresse> addresses) {
        this.konten = konten;
    }

    public List<Konto> getKonten() {
        return konten;
    }

    public void setKonten(List<Konto> konten) {
        this.konten = konten;
    }

}
