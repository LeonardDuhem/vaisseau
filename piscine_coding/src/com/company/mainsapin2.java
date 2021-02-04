package com.company;

import java.util.SortedMap;

public class mainsapin2 {
    public static void main(String[] args) {
        int base = 300 ;
        int nbEspace_impair = (base / 2) - 1 ;
        int nbEspace_pair = ((base - 1) / 2 ) - 1 ;
        int nbEspace1 = (base - 1) / 2 ;
        int etoile = 1 ;

        for (int b = 0 ; b != (base + 1) / 2 ; b++) {


            for (int i = 0 ; i < nbEspace1 ; i++) //espace
                System.out.print(" ") ;


            for (int a = 0; a != etoile ; a++) {        //etoile
                System.out.print("*") ;
            }
            System.out.println("") ;


            etoile = etoile + 2 ;
            nbEspace1 = nbEspace1 - 1 ;
        }
        if (base % 2 != 0){
            for(int y=0 ; y<nbEspace_impair ; y++) {
                System.out.print(" ");
            }
        }
        else{
            for(int y=0 ; y<nbEspace_pair ; y++) {
                System.out.print(" ");
            }
        }
        System.out.print("|_|") ;
    }
}
