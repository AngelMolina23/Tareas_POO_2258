package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Kpop {
    private int id;
    public int numeroDeIntegrantes;
    private int fundacion;
    private String nombre;
    private String imagen;
    private String agencia;

    public Kpop() {
    }

    public Kpop(int id,String nombre ,int numeroDeIntegrantes ,String agencia ,int fundacion , String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.numeroDeIntegrantes = numeroDeIntegrantes;
        this.agencia = agencia;
        this.fundacion = fundacion;
        this.imagen = imagen;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroDeIntegrantes() {
        return numeroDeIntegrantes;
    }

    public void setNumeroDeIntegrantes(int numeroDeIntegrantes) {
        this.numeroDeIntegrantes = numeroDeIntegrantes;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Kpop{" +
                "id=" + id +
                ", numeroDeIntegrantes=" + numeroDeIntegrantes +
                ", fundacion=" + fundacion +
                ", nombre='" + nombre + '\'' +
                ", imagen='" + imagen + '\'' +
                ", agencia='" + agencia + '\'' +
                '}';
    }
    public ImageIcon getImage() throws MalformedURLException {
        URL urlImagen = new URL(this.imagen);
        return new ImageIcon(urlImagen);}



    }

