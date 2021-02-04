package com.company;

public class MainDate {
    public static void main(String[] args) {

        int jour = 29;
        int mois = 2;
        int annee = 2019;

        boolean isValid = true;

        if (jour < 1 || jour > 31 || mois < 1 || mois > 12) {
            isValid = false;
        }

        if (jour == 31 && (mois == 4 || mois == 6 || mois == 9 || mois == 11)) {
           isValid = false;
        } else if (mois == 2) {
            if (jour > 29) {
                isValid = false;
            } else if (jour == 29 && !(annee % 400 == 0 || (annee % 4 == 0 && annee % 100 != 0))) {
                    isValid = false;
            }
        }

        if (isValid) {
            System.out.println("La date " + jour + "/" + mois + "/" + annee + " est valide");
        } else {
            System.out.println("La date " + jour + "/" + mois + "/" + annee + " est incorrecte");
        }

    }
}
