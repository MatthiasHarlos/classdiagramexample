package com.newenergytrading.classdiagramexample;


import java.util.List;

public class Geschaeftskunde extends Kunde{

    private String firmenName;
    private Adresse domizilAdresse;

    public Geschaeftskunde(String firmenName, List<Konto> konten, List<Adresse> domizilAddresses) {
        super(konten, domizilAddresses);
        this.firmenName = firmenName;
    }

    public String getFirmenName() {
        return firmenName;
    }

    public void setFirmenName(String firmenName) {
        this.firmenName = firmenName;
    }

    public Adresse getDomizilAdresse() {
        return domizilAdresse;
    }

    public void setDomizilAdresse(Adresse domizilAdresse) {
        this.domizilAdresse = domizilAdresse;
    }
}
