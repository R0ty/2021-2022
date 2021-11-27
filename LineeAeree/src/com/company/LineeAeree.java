package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LineeAeree {

    private Volo testa;
    private Volo coda;
    private Volo app;

    public void list() {

        try {
            File file = new File("dati.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String[] dati = sc.nextLine().split(" ");
                Volo app = new Volo(dati[0], dati[1], dati[2], dati[3], dati[4], dati[5]);
                if (testa == null) {
                    testa = app;
                } else {
                    coda.successivo = app;
                }
                coda = app;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

    }


    public  void voliPartenza() {
        Volo volo = testa;
        System.out.println(testa);
        while (volo != null) {
            if (volo.getLocalitàP().equals("Parigi")) {
                System.out.println(volo.toString());
                System.out.println();
            }
            volo = volo.successivo;
        }
    }


    public  void voliPartenzaArrivo() {
        Volo volo = testa;
        while (volo != null) {
            if (volo.getLocalitàP().equals("Venezia") && volo.getLocalitàA().equals("Roma")) {
                System.out.println(volo.toString());
                System.out.println();
            }
            volo = volo.successivo;
        }
    }

    public  void voliArrivo() {
        Volo volo = testa;
        while (volo != null) {
            if (volo.getLocalitàA().equals("NewYork")) {
                System.out.println(volo.toString());
                System.out.println();
            }
            volo = volo.successivo;
        }
    }


    public void scelta() {
        Scanner tastiera = new Scanner(System.in);

        Volo volo = testa;


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
            System.out.println();

            switch (scelta) {
                case 1:
                    voliPartenza();
                    break;
                case 2:
                    voliPartenzaArrivo();
                    break;
                case 3:
                    voliArrivo();
                    break;
            }
        }
    }
}
