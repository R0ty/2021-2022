package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();
        int[][] albero = new int[2][5];


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
        cPeso(albero);
        pNumeri(albero);
        pNodi(albero);
        aggiungiNumero(albero);


    }
    private static void cPeso(int [][] albero) {
        int k = 1;
        for (int i = 0; i < albero[0].length - 1; i++) {
            int ntrovare = albero[1][i];
            while (sIP(k, albero) != -1) {
                int j = sIP(k, albero);
                if (ntrovare <= albero[1][j]) {
                    k = k * 2;
                } else {
                    k = (k * 2) + 1;
                }
            }
            albero[0][i + 1] = k;
            k = 1;
        }
        for(int i = 0; i < albero.length; i++) {
            for (int j = 0; j < albero[0].length; j++) {
                System.out.print(albero[i][j] + "\t");

            }
            System.out.println();
        }
    }
    private static void pNumeri(int [][] albero) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dammi un numero da cercare");
        int num = sc.nextInt();
        for (int i = 0; i <= albero[0].length - 1; i++) {
            if (num == albero[1][i]) {
                System.out.println("Il numero trovato ha come valore del nodo " + albero[0][i] + " ed è alla posizione " + i);
            }

        }
    }

    private static void pNodi(int [][] albero) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dammi un nodo da cercare");
        int num = sc.nextInt();
        for (int i = 0; i <= albero[0].length - 1; i++) {
            if (num == albero[0][i]) {
                System.out.println("Il numero trovato ha come valore del nodo " + albero[0][i] + " ed è alla posizione " + i);
            }

        }
    }

    private static int sIP(int k, int[][] albero){
        for (int i = 0; i < albero[0].length; i++) {  // ritorna l'indice di quella posizione nell'array delle posizioni
            if(albero[0][i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void aggiungiNumero( int[][] albero){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero ");
        int numero = sc.nextInt();
        int[][] MVecchio = albero;
        albero = new int[2][MVecchio[0].length+1];
        for (int i = 0; i < MVecchio.length; i++) {
            for (int j = 0; j < MVecchio[0].length; j++) {
                albero[i][j] = MVecchio[i][j];
            }
        }
        albero[1][albero[0].length-1] = numero;
        int k = 1;
        int ntrovare = numero;
        while (sIP(k, albero) != -1) {
            int j = sIP(k, albero);
            if (ntrovare <= albero[1][j]) {
                k = k * 2;
            } else {
                k = (k * 2) + 1;
            }
        }
        albero[0][albero[0].length-1] = k;

        for(int i = 0; i < albero.length; i++) {
            for (int j = 0; j < albero[0].length; j++) {
                System.out.print(albero[i][j] + "\t");

            }
            System.out.println();
        }
    }


}
