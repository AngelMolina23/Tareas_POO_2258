package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            System.out.println("Hello world!");
        Caja<String> miCaja = new Caja<>(new String[10]);
        miCaja.add(0,"balon");
        miCaja.add(1,"raqueta");
        miCaja.add(2,"guantes");
        System.out.println(miCaja);
        String temp =miCaja.get(0);
        System.out.println(temp);

        System.out.println("----SinGenericos----");
        CajaSinGenericos cajaSin = new CajaSinGenericos(new Object[10]);
        cajaSin.add(0, "cuchara");
        cajaSin.add(1, "tenedor");
        cajaSin.add(2, "Cuchillo");
        System.out.println(cajaSin);
        String temp2 =(String)cajaSin.get(0);  // convertir
        System.out.println(temp2);

        System.out.println("----Comida----");
        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0,new Comida("Yogurth",true));
        cajaComida.add(1,new Comida("Zanahoria",false));
        System.out.println(cajaComida);
        System.out.println(cajaComida.get(0));

        System.out.println("----ClasesGenericasDinamica----");
        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("Manzana",false));
        comidas.add(new Comida("Manzana",false));
        comidas.add(new Comida("Manzana",false));
        comidas.add(new Comida("Manzana",false));
        comidas.add(new Comida("Manzana",false));
        comidas.add(new Comida("Mango",false));
        System.out.println(comidas.size()); //cuantas hay
        System.out.println(comidas.get(5));

        System.out.println("-----ArrayList-----");
        ArrayList<Comida> comidas2 = new ArrayList<>();
        comidas2.add(new Comida("zanahoria",false));
        comidas2.add(new Comida("yogurth",true));
        comidas2.add(new Comida("danonino",true));
        comidas2.add(new Comida("Manzana",false));
        comidas2.add(new Comida("bisteck",false));
        System.out.println(comidas2.get(3));
        comidas2.set(3,new Comida("Fresa",false));//cambiar
        System.out.println(comidas2.get(3));

        System.out.println("----ResultadoFinal----");
        for (Comida comida:comidas2) {
            System.out.println(comida);
        }

        System.out.println("----Agregar-----");
        comidas2.add(2,new Comida("Naranja",false));//agregarEntre
        for (Comida comida:comidas2) {
            System.out.println(comida);
        }






    }
}