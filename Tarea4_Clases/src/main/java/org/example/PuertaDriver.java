package org.example;

public class PuertaDriver {
    public static void main(String[] args) {
       Puerta micuarto = new Puerta("madera","interior","Digital",(byte)4,2.75f);
        System.out.println(micuarto.toString());
        //System.out.println(micuarto);
        System.out.println(micuarto.numeroPuertaDigital());
        System.out.println(micuarto.abierto());
        System.out.println(micuarto.tieneCandado());
    }
}