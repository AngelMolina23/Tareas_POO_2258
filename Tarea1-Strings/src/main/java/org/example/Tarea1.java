package org.example;

import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {

        System.out.println(" escribe un nombre, una profesión y una nacionalidad: ");
        Scanner teclado = new Scanner(System.in);
        String carrera = teclado.nextLine();
        System.out.println("---------------------------------------");
        String [] separado = carrera.trim().split(" ");
        System.out.println("----------- Separado -------------");
        for (int i =0; i < separado.length; i++){
            if (i == 0){
                System.out.println("nombre: "+ separado[i]);}
            if (i == 1){
                System.out.println("profesion: "+ separado[i]);}
            if (i == 2){
                System.out.println("nacionalidad: "+ separado[i]);}

        }



    }
}