package org.example;

public class Avestruz {

    private String nombre;
    private String genero;
    private byte edad;
    private float tamanoEnMetros;
    private float pesoEnKilogramos;

    public Avestruz(String nombre, String genero, byte edad, float tamanoEnMetros, float pesoEnKilogramos) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.tamanoEnMetros = tamanoEnMetros;
        this.pesoEnKilogramos = pesoEnKilogramos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public float getTamanoEnMetros() {
        return tamanoEnMetros;
    }

    public void setTamanoEnMetros(float tamanoEnMetros) {
        this.tamanoEnMetros = tamanoEnMetros;
    }

    public float getPesoEnKilogramos() {
        return pesoEnKilogramos;
    }

    public void setPesoEnKilogramos(float pesoEnKilogramos) {
        this.pesoEnKilogramos = pesoEnKilogramos;
    }

    @Override
    public String toString() {
        return "Avestruz{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", edad=" + edad +
                ", tamanoEnMetros=" + tamanoEnMetros +
                ", pesoEnKilogramos=" + pesoEnKilogramos +
                '}';
    }

    public boolean esconderCabeza (){
        System.out.println( nombre + " se espanto? esta escondiendo la cabeza? ");
         boolean resultado = Math.random() < 0.51;
         return resultado;
    }
    public String corre(){
        String corre = nombre;
        boolean resultado = Math.random() < 0.51;
        if (resultado == true) {
            System.out.println(" empezo a correr a 70km por hora :");
        }else {
            System.out.println(" esta cansado no va a correr :");
        }
        return corre;
    }

    public int cuantoComio(){
        boolean resultado = Math.random() > 0.31;
        int numeroFrutas = 1;
        while(resultado == true){
            resultado = Math.random() > 0.31;
            System.out.println(" esta comiendo.....");
            numeroFrutas = numeroFrutas + 1;
        }
        System.out.println(" comio: "+numeroFrutas+ " Frutas");
        return numeroFrutas;
    }
}
