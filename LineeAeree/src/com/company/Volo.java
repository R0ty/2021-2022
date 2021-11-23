package com.company;

public class Volo {
    private String codice;
    private String localitàP;
    private String localitàA;
    private String orarioP;
    private String orarioA;
    private String costoB;
    Volo successivo;

    public Volo(String codice, String localitàP, String localitàA, String orarioP, String orarioA, String costoB) {
        codice = getCodice();
        localitàP =getLocalitàP();
        localitàA = getLocalitàA();
        orarioP = getOrarioP();
        orarioA = getOrarioA();
        costoB = getCostoB();
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void setCostoB(String costoB) {
        this.costoB = costoB;
    }

    public void setLocalitàA(String localitàA) {
        this.localitàA = localitàA;
    }

    public void setLocalitàP(String localitàP) {
        this.localitàP = localitàP;
    }

    public void setOrarioP(String orarioP) {
        this.orarioP = orarioP;
    }

    public void setOrarioA(String orarioA) {
        this.orarioA = orarioA;
    }

    public String getCodice() {
        return codice;
    }

    public String getCostoB() {
        return costoB;
    }

    public String getLocalitàA() {
        return localitàA;
    }

    public String getLocalitàP() {
        return localitàP;
    }

    public String getOrarioA() {
        return orarioA;
    }

    public String getOrarioP() {
        return orarioP;
    }

    @Override
    public String toString() {
        return "il codice del volo è" + getCodice() + ", il volo parte da " + getLocalitàP() + ", il volo attera a " + getLocalitàA() + ", l'orario di partenza è alle ore " + getOrarioP() + ", l'orario di arrivo è alle ore" + getOrarioA() + " infine il costo del biglietto è " + getCostoB();
    }
}
