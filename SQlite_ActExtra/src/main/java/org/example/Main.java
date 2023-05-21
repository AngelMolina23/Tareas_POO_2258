package org.example;

import org.example.controlador.ControladorLibro;
import org.example.vista.VentanaLibro;

public class Main {
    public static void main(String[] args) {
        VentanaLibro view = new VentanaLibro("Actividades extra 7,8 y 9");
        ControladorLibro controller = new ControladorLibro(view);
        }

    }

