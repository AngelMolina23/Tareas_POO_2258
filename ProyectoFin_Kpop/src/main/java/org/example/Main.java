package org.example;

import org.example.controlador.ControladorKpop;
import org.example.vista.VentanaKpop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VentanaKpop VentanaKpop = new VentanaKpop("por favor funciona y Grupos de KPOP :) ");
        ControladorKpop controller = new ControladorKpop(VentanaKpop);
    }
}