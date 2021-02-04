package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 13 ;
        int b = 46 ;
        if (a > b) {
            System.out.println(a) ;
        }
        else {
            System.out.println(b) ;
        }

        int c = 15 ;
        int d = 4 ;
        if (c * d > 0) {
            System.out.println("positif") ;
        }
        else {
            System.out.println("negatif") ;
        }

        int e = 37 ;
        if (e < 18){
            System.out.println("mineure") ;
        }
        else {
            System.out.println("majeure") ;
        }

        int f = 14 ;
        if (f < 10){
            System.out.println("rattrapage") ;
        }
        else if (f < 12) {
            System.out.println("aucune mention") ;
        }
        else if (f < 14) {
            System.out.println("assez bien ") ;
        }
        else if (f < 16) {
            System.out.println("bien") ;
        }
        else if (f < 18) {
            System.out.println("très bien") ;
        }
        else if (f < 20) {
            System.out.println("excellent") ;
        }
        else {
            System.out.println("TRICHEUR") ;
        }

        int g = 71 ;
        if (g % 2 == 0) {
            System.out.println("paire") ;
        }
        else {
            System.out.println("impaire") ;
        }


        int jour = 29;
        int mois = 2 ;
        int annee = 2020 ;

        //test année bissextile
        if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
            System.out.println("année bissextile") ;
        }
        else {
            System.out.println("année normale") ;
        }

        //la date est correcte
        if (mois < 0 || mois > 12 && jour < 0 || jour > 31) {
            System.out.println("la date entrée est incorrecte ") ;
            return ;
        }
        else if (mois == 2) {
            if (jour > 29) {
                System.out.println("la date est incorrecte");
            }
            else if (jour == 29 && !(annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0)) {
                System.out.println("la date est incorrecte");
            }
            else {
                System.out.println("la date : " + jour + " / " + mois + " / " + annee + " est correcte ") ;
            }
        }
        else if ((mois == 4 || mois == 6 || mois == 9 || mois == 11) && jour > 30) {
            System.out.println("la date entrée est incorrecte") ;
        }
        else {
            System.out.println("la date : " + jour + " / "  + mois + " / " + annee + " est correcte ") ;
        }













    }
}
