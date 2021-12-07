package com.newenergytrading.classdiagramexample;

import java.util.List;

public class Konto {

    private String bezeichnung;
    private List<Kunde> zeichnungsberechtigte;

    public GeldBetrag saldo() {
        // TODO: Implement this.
        return null;
    }

    public void einzahlen(GeldBetrag geldBetrag) {
       //TODO: Implement this.
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public List<Kunde> getZeichnungsberechtigte() {
        return zeichnungsberechtigte;
    }

    public void setZeichnungsberechtigte(List<Kunde> zeichnungsberechtigte) {
        this.zeichnungsberechtigte = zeichnungsberechtigte;
    }
}
