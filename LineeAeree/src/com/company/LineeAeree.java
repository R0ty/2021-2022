package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LineeAeree {

    private Volo testa;
    private Volo coda;
    private Volo app;
    public String file;


    public LineeAeree(String file) {
        this.file = file;
        list();

    }

    public Volo list() {
        Volo app = null;
        try {
            File file = new File("dati.txt");
            Scanner sc = new Scanner(file);
            if (sc.hasNextLine()) {
                String[] dati = sc.nextLine().split(" ");
                app = new Volo(dati[0], dati[1], dati[2], dati[3], dati[4], dati[5]);
                if (testa == null) {
                    testa = app;
                } else {
                    coda.successivo = app;
                }
                coda = app;
            }

            while (sc.hasNextLine()) {
                String[] dati = sc.nextLine().split(" ");
                app = new Volo(dati[0], dati[1], dati[2], dati[3], dati[4], dati[5]);
                coda.successivo = app;
                coda = app;

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        return testa;

    }


    public String voliPartenza(String localitaP) {
        String informazioniVoli = "";
        int cont = 0;
        app = testa;


        while (app != null) {
            if (app.getLocalitàP().equals(localitaP)) {
                informazioniVoli += app.toString();
                cont++;

            }
            app = app.successivo;
        }

        System.out.println();
        if (cont > 0) return informazioniVoli;
        else return "Non ci sono voli che partono " + localitaP;
    }


    public String voliPartenzaArrivo(String localitaP, String localitaA) {

        String informazioniVoli = "";
        int cont = 0;
        app = testa;

        while (app != null) {
            if (app.getLocalitàP().equals(localitaP) && app.getLocalitàA().equals(localitaA)) {
                informazioniVoli += app.toString();
                cont++;

            }

            app = app.successivo;

        }


        System.out.println();

        if (cont > 0) return informazioniVoli;

        else return "Non ci sono voli che partono da " + localitaP + " a " + localitaA;

    }

    public String voliArrivo(String localitaA) {

        String informazioniVoli = "";
        int cont = 0;
        app = testa;
        while (app != null) {
            if (app.getLocalitàA().equals(localitaA)) {
                informazioniVoli += app.toString();
                cont++;

            }

            app = app.successivo;
            System.out.println();

        }

        if (cont > 0) return informazioniVoli;
        else return "Non ci sono voli in arrivo da " + localitaA;

    }


    public void scelta() {
        Scanner tastiera = new Scanner(System.in);


        boolean stato = true;
        while (stato) {

            System.out.println("Informazioni Voli");
            System.out.println("Digita un numero: ");
            System.out.println("- 1 : visualizzare tutti i voli in partenza da Parigi;");
            System.out.println("- 2 : visualizzare tutti i voli in partenza da Venezia con arrivo a Roma;");
            System.out.println("- 3: visualizzare tutti i voli in arrivo a NewYork; ");
            System.out.println("- 4: uscire dal programma");
            System.out.print("Hai digitato il numero: ");
            int scelta = tastiera.nextInt();

            switch (scelta) {
                case 1:

                    System.out.println(voliPartenza("Parigi"));

                    break;

                case 2:

                    System.out.println(voliPartenzaArrivo("Venezia", "Roma"));

                    break;

                case 3:

                    System.out.println(voliArrivo("NewYork"));

                    break;
            }
        }
    }
}
