package com.company;

public class Volo {
    private String codice;
    private String localitàP;
    private String localitàA;
    private String orarioP;
    private String orarioA;
    private String costoB;
    public Volo successivo;

    public Volo(String codice, String localitàP, String localitàA, String orarioP, String orarioA, String costoB) {
        this.codice = codice;
        this.localitàP = localitàP;
        this.localitàA = localitàA;
        this.orarioP = orarioP;
        this.orarioA = orarioA;
        this.costoB = costoB;
        this.successivo = null;
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
        return "Il codice del volo è" + getCodice() + "\n" + "Il volo parte da " + getLocalitàP() + "\n" + "Il volo attera a " + getLocalitàA() + "\n" + "L'orario di partenza è alle ore " + getOrarioP() + "\n" + "L'orario di arrivo è alle ore " + getOrarioA() + "\n" + "Il costo del biglietto è " + getCostoB();
    }
}
