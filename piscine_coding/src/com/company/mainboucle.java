package com.company;

public class mainboucle {

    public static void main(String[] args) {

        //int A = 0 ;
            //while (A =< 100) {
                //System.out.println(A);
                // A = A + 1 ;
            //}

        //int B = 100 ;
            //while (B >= 0) {
                //System.out.println(B);
                //B = B - 1 ;
            //}
        //int I;
        //for (I = 0 ; I <= 100 ; I = I + 1) {
            //if (I % 3 == 0) {
                //System.out.println(I);
            //}
        //}

        //int C = 3 ;
        //int D = 8 ;
        //int I ;
        //int E = C ;
        //for (I = 1 ; I < D ; I = I + 1) {
            //E = E * C ;
        //}
        //System.out.println(E);

        //int F = 5 ;
        //int G = 10 ;
        //int I ;
        //int H = F ;
        //for (I = 1 ; I <= G ; I = I + 1) {
            //H = F * I ;
            //System.out.println(H);
        //}

        //int N = 20 ;
        //int M = 150 ;
        //int I = 1 ;
        //int x = 1 ;
        //for (I = 1 ; I <= N ; I = I + 1) {
            //x = x + I ;
            //if(x > M) {
                //break ;
            //}
            //System.out.println(x);
        //}

        int nombre = 1234 ;
        int reste = 1 ;
        int resultat = 0 ;
        while (nombre > 0) {
            reste = nombre % 10 ;
            System.out.println(reste);
            nombre = nombre / 10 ;
            System.out.println(nombre);
            resultat = resultat * 10 + reste ;
            System.out.println(resultat);
        }

    }
}
