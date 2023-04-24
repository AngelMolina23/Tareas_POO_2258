package org.example;

import org.example.HerenciaMultiple.AlumnoDeportistaArtista;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cuadrado cuadrado=new Cuadrado();
        cuadrado.setLado(5);
        System.out.println("Area "+cuadrado.calcularArea());

        Circulo circulo = new Circulo();
        circulo.setRadio(2.4);
        System.out.println("Area del circulo: "+circulo.calcularArea());

        AlumnoDeportistaArtista alumno =new AlumnoDeportistaArtista();
        alumno.setNombre("Juan");
        alumno.setArte("Pintuira");
        System.out.println(alumno);
        alumno.ensayar("Oleo");
        alumno.entrenar();
        alumno.presentarCompetencia("Naucalli");
    }
}