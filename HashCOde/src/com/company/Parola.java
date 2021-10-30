package com.company;

public class Parola {

    private String paorla;
    private int frequenza;

    public Parola(String parola){
        this.paorla = parola;
        this.frequenza= frequenza;
        frequenza++;
    }

    public String getPaorla() {
        return paorla;
    }
    public void setFrequenza() {
        this.frequenza = frequenza;
    }

    @Override
    public String toString(){
        return paorla;
    }
}
