package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce una cadena que contega 9 caracteres de  los siguientes caracteres '_', 'X', 'O' : ");
        String entrada = teclado.nextLine();
        System.out.println("los caracteres ingresados son: "+ entrada);
        char d;
        boolean comparacion = false, caracteres = true;
        int tamanoDEntrada = entrada.length();
        for (int j = 0; j <entrada.length() ; j++) {
            d = entrada.charAt(j);
            int valoresASSIC = (int)d;
            if( tamanoDEntrada == 9){
                if (  valoresASSIC == 88 ||  valoresASSIC == 95 || valoresASSIC == 79  ){
                    comparacion = true;
                }else{
                    comparacion = false;
                    break;
                }}else{
                caracteres = false;
                break;
            }
        }
        if (caracteres == false){
            System.out.println("Los carateres que ingresaste son mayores a nueve o menores, revisa e intenta de nuevo :)");
        }else{
            if (comparacion == true){
                String primeros3 = entrada.substring(0,3);
                String segundos3 = entrada.substring(3,6);
                String ultimos3 = entrada.substring(6,9);

                StringBuffer LineaUno = new StringBuffer( "||");
                StringBuffer LineaDos = new StringBuffer( "||");
                StringBuffer LineaTres = new StringBuffer( "||");

                LineaUno.insert(1, primeros3);
                LineaDos.insert(1, segundos3);
                LineaTres.insert(1, ultimos3);

                System.out.println("------");
                System.out.println(LineaUno);
                System.out.println(LineaDos);
                System.out.println(LineaTres);
                System.out.println("------");

            }else
                System.out.println("Los caracteres ingresados son distintos a '_', 'X', 'O'");
        }


    }
}