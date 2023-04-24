package org.example.HerenciaMultiple;

public class Alumno extends Persona{
    private int numeroCuenta;
    private String Carrera;
    private double promedio;

    public Alumno() {
    }

    public Alumno(int numeroCuenta, String carrera, double promedio) {
        this.numeroCuenta = numeroCuenta;
        Carrera = carrera;
        this.promedio = promedio;
    }

    public Alumno(int edad, String nombre, int numeroCuenta, String carrera, double promedio) {
        super(edad, nombre);
        this.numeroCuenta = numeroCuenta;
        Carrera = carrera;
        this.promedio = promedio;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "numeroCuenta=" + numeroCuenta +
                ", Carrera='" + Carrera + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
