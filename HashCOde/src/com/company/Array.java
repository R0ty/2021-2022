package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Array {
    ArrayList<Parola> [] parole;
    int[] frequenza;
    int posizione;
    String percorso;

    public Array(String percorso){
        parole = new ArrayList[15000];
        frequenza = new int[15000];
        posizione = 0;
        costruzione();
    }

    public void costruzione(){
        File giara = new File(percorso);
        try (Scanner sc = new Scanner(giara)) {
            while (sc.hasNextLine()) {
                String[] dati = sc.nextLine().replace(",", " ").replace("-", " ").split(" ");
                for (int i = 0; i < dati.length; i++) {
                        posizione = Math.abs(dati[i].hashCode() % 15000);
                        if(parole[posizione] == null){
                            parole[posizione] = new ArrayList<>();
                            parole[posizione].add(new Parola(dati[i]));
                        }else{
                            for (int j = 0; j < parole[posizione].size(); j++){
                                if(parole[posizione].get(j).getPaorla().equals(dati[i]));
                                parole[posizione].get(j).setFrequenza();
                            }
                        }
                }
            }
        }
        catch (FileNotFoundException fnfe){
            System.out.println(" Il file LaGiara non esiste");

            // write your code here
        }
        for (int i = 0; i < parole.length; i++) {
            System.out.println(parole[i]);

        }
    }

}
