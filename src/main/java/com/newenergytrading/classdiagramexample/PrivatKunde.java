package com.newenergytrading.classdiagramexample;

import java.util.List;

public class PrivatKunde extends Kunde{

    private String vorname;
    private String nachname;
    private Adresse postAdresse;

    public PrivatKunde(String firstName, String lastName, List<Konto> konten, List<Adresse> postaddresses) {
        super(konten, postaddresses);
        this.vorname = firstName;
        this.nachname = lastName;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Adresse getPostAdresse() {
        return postAdresse;
    }

    public void setPostAdresse(Adresse postAdresse) {
        this.postAdresse = postAdresse;
    }
}
