package com.company;

public class mainfonction {
    static int min (int a , int b ) {
        int c = a ;
        if (b < a) {
            c = b ;
        }
        return c ;
    }

    static int abs (int d) {
        if (d < 0) {
            d = d * - 1 ;
        }
    return d ;
    }

    static boolean isCorrect(int jour, int mois, int annee) {
        boolean isValid = true ;
        if (jour < 1 || jour > 31 || mois < 1 || mois > 12) {
            isValid = false;
        }
        if (jour == 31 && (mois == 4 || mois == 6 || mois == 9 || mois == 11)) {
            isValid = false;
        } else if (mois == 2) {
            if (jour > 29) {
                isValid = false;
            } else if (jour == 29 && !isLeapYear(annee)) {
                isValid = false;
            }
        }
        return isValid ;
    }

    static boolean isLeapYear(int annee) {
        return (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) ;
    }

    static int sum(int N) {
        int I = 1 ;
        int x = 0 ;
        for (I = 0 ; I <= N ; I = I + 1) {
            x = x + I ;
        }
        return x ;
    }

    static int power (int a , int b) {
        int I ;
        int E = a ;
        for (I = 1 ; I < b ; I = I + 1) {
            E = E * a ;
        }
        return E ;
    }

    static int displayMultTable (int a , int b) {
        int I ;
        int H = a ;
        System.out.println("la table de multiplication de " + a );
        for (I = 1 ; I <= b ; I = I + 1) {
            H = a * I ;
            System.out.println(H);
        }
        return H ;
    }

    static int integerMirror (int a) {
        int reste = 1 ;
        int resultat = 0 ;
        while (a > 0) {
            reste = a % 10 ;
            System.out.println(reste);
            a = a / 10 ;
            System.out.println(a);
            resultat = resultat * 10 + reste ;
            System.out.println(resultat);
        }
        return resultat ;
    }



    public static void main(String[] args) {

        int res = min(53, 63) ;
        System.out.println("le plus petit est :" + res) ;

        int res1 = abs(-1) ;
        System.out.println("la valeur absolue est " + res1) ;

        boolean res2 = isCorrect(29, 2, 2081) ;
        System.out.println("date valide : " + res2);

        boolean res3 = isLeapYear(400) ;
        System.out.println("année bissextile : " + res3);

        int res4 = sum(20);
        System.out.println("le totale est égale a = " + res4);

        int res5 = power(3 , 6) ;
        System.out.println("le calcul est égal à : " + res5);

        int res6 = displayMultTable(8 , 10) ;

        int res7 = integerMirror(1234) ;
        System.out.println("le miroir de votre nombre est : " + res7);
    }
}
