package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int compararCaracteres = 0;
        int compararCaracter2 = 0;
        char uno;
        boolean ordenado = false;
        System.out.println("escribe una secuencia de caracteres: ");
        Scanner teclado = new Scanner(System.in);
        String secuenciaCaracteres =teclado.nextLine();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("la secuencia de caracteres que ingresaste es: "+ secuenciaCaracteres);

        for (int i = 0; i < secuenciaCaracteres.length() ; i++) {
            System.out.print( (int)secuenciaCaracteres.charAt(i)+ ", ");
            uno = secuenciaCaracteres.charAt(i);
            compararCaracteres = (int)uno;
            if (  compararCaracteres > compararCaracter2+1 || compararCaracteres < compararCaracter2){
                ordenado = false;
            }else{
                ordenado = true;
            }
            compararCaracter2 =(int)uno;

        }
        System.out.print("esta es la secuencia de caracteres en el sitema ASCII ");
        System.out.println();
        if(ordenado == true){
            System.out.println(ordenado + ",La secuencia de caracteres esta ordenada ");
        }else
            System.out.println(ordenado+ ",La secuencia de caracteres no esta ordenada");
    }
}