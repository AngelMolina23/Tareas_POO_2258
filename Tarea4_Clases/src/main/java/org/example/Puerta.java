package org.example;

public class Puerta {
    private String material;
    private String tipoDePuerta;
    private String tipoDeCerradura;
    private byte numeroDeBisagras;
    private float longitud;

    public Puerta(String material, String tipoDePuerta, String tipoDeCerradura, byte numeroDeBisagras, float longitud) {
        this.material = material;
        this.tipoDePuerta = tipoDePuerta;
        this.tipoDeCerradura = tipoDeCerradura;
        this.numeroDeBisagras = numeroDeBisagras;
        this.longitud = longitud;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoDePuerta() {
        return tipoDePuerta;
    }

    public void setTipoDePuerta(String tipoDePuerta) {
        this.tipoDePuerta = tipoDePuerta;
    }

    public String getTipoDeCerradura() {
        return tipoDeCerradura;
    }

    public void setTipoDeCerradura(String tipoDeCerradura) {
        this.tipoDeCerradura = tipoDeCerradura;
    }

    public byte getNumeroDeBisagras() {
        return numeroDeBisagras;
    }

    public void setNumeroDeBisagras(byte numeroDeBisagras) {
        this.numeroDeBisagras = numeroDeBisagras;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Puerta{" +
                "material='" + material + '\'' +
                ", tipoDePuerta='" + tipoDePuerta + '\'' +
                ", tipoDeCerradura='" + tipoDeCerradura + '\'' +
                ", numeroDeBisagras=" + numeroDeBisagras +
                ", longitud=" + longitud +
                '}';
    }

    public boolean abierto() {
        boolean abierto = Math.random() > .51;
        System.out.println(" ¿la puerta esta abierta? ");
        return abierto;
    }
    public int numeroPuertaDigital() {
        System.out.println("el numero de seguridad de la puerta digital cambio a: ");
    int numero1 = (int)(Math.random()*99999+1);
        return numero1;
    }
    public String tieneCandado() {
        boolean resultado = Math.random() < 0.51;
        if (resultado == true) {
            String candado = "sin candado";
            return candado;
        } else {
            String candado = "con candado";
            return candado;
        }
    }
}
