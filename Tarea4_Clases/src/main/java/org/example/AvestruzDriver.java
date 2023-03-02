package org.example;

public class AvestruzDriver {
    public static void main(String[] args) {
        Avestruz pollo = new Avestruz("Ronaldo", "Macho", (byte) 55, 2.6f,150.450f);
        System.out.println(pollo);
        System.out.println(pollo.esconderCabeza());
        System.out.println(pollo.corre());
        System.out.println(pollo.cuantoComio());
    }
}
