 package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();
        int[][] albero = new int[2][5];
        int k = 1;

        for (int i = 0; i < albero.length; i++) {
            for (int j = 0; j < albero[0].length ; j++) {
                    albero[0][j] = 1;
                    albero[1][j] = rnd.nextInt(30);
                for (int l = 0; l < albero[0].length; l++) {
                    if (albero[1][l] == albero[1][j]){
                        albero[1][j] = rnd.nextInt(30);
                    }

                }
            }
        }

        //assegnazione
        for (int i = 0; i < albero[0].length -1; i++) {
            int posizioneOra;
            int posizione1 = albero[1][i];
            int posizione2 = albero[1][i + 1];
            for (int j = 0; j < albero[0].length -1; j++) {
                if(k == albero[0][j]){
                    posizioneOra = albero[0][j];
                    if ( posizione1 >= posizione2){
                        k = posizioneOra * 2;
                    }
                    else{
                        k = (posizioneOra *2) + 1;
                    }
                    j = 0;
                }

            }
            posizioneOra = k;
            k = 1 ;
            albero[0][i +1] = posizioneOra;
        }

        //stampa
        for(int i = 0; i < albero.length; i++) {
            for (int j = 0; j < albero[0].length; j++) {
                System.out.print(albero[i][j] + "\t");

            }
            System.out.println();
        }

        //ricerca
        Scanner sc = new Scanner(System.in);
        System.out.println("Dammi un numero da cercare");
        int num = sc.nextInt();
        for (int i = 0; i <= albero[0].length -1; i++) {
            if(num == albero[1][i]){
                System.out.println("Il numero trovato ha come valore del nodo " + albero[0][i] + " ed è alla posizione " + i);
            }
            
        }

    }
}
