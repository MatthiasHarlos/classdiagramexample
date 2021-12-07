package com.newenergytrading.classdiagramexample;

import java.util.List;

public class Konto {

    private String bezeichnung;
    private List<Kunde> kunden;

    public int saldo() {
        // TODO: Implement this.
        return 0;
    }

    public int einzahlen(int geldBetrag) {
        int betrag = 0;
        betrag = betrag + saldo();
        return betrag;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public List<Kunde> getKunden() {
        return kunden;
    }

    public void setKunden(List<Kunde> kunden) {
        this.kunden = kunden;
    }
}
