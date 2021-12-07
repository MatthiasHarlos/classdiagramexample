package com.newenergytrading.classdiagramexample;


import java.util.List;

public class Geschäftskunde extends Kunde{

    private String firmenName;

    public Geschäftskunde(String firmenName, List<Konto> konten, List<Adresse> domizilAddresses) {
        super(konten, domizilAddresses);
        this.firmenName = firmenName;
    }

    public String getFirmenName() {
        return firmenName;
    }

    public void setFirmenName(String firmenName) {
        this.firmenName = firmenName;
    }
}
