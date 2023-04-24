package org.example.HerenciaMultiple;

public class AlumnoDeportistaArtista extends Alumno implements Deportista,Artista{
    private int actividadesExtra;
    private String deportista;
    private String arte;

    public AlumnoDeportistaArtista() {
    }

    public AlumnoDeportistaArtista(int edad, String nombre, int numeroCuenta, String carrera, double promedio, int actividadesExtra, String deportista, String arte) {
        super(edad, nombre, numeroCuenta, carrera, promedio);
        this.actividadesExtra = actividadesExtra;
        this.deportista = deportista;
        this.arte = arte;
    }

    public int getActividadesExtra() {
        return actividadesExtra;
    }

    public void setActividadesExtra(int actividadesExtra) {
        this.actividadesExtra = actividadesExtra;
    }

    public String getDeportista() {
        return deportista;
    }

    public void setDeportista(String deportista) {
        this.deportista = deportista;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {
        return super.toString()+
                "AlumnoDeportistaArtista{" +
                "actividadesExtra=" + actividadesExtra +
                ", deportista='" + deportista + '\'' +
                ", arte='" + arte + '\'' +
                '}';
    }

    @Override
    public int ensayar(String diciplina) {
        System.out.println("El alumno esta ensayando "+this.arte);
        return 2;
    }

    @Override
    public boolean presentarObra() {
        System.out.println(getNombre()+" está presentando su obra");
        return false;
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre()+" está entrenando el deporte ");
        return 2;
    }

    @Override
    public boolean presentarCompetencia(String ubicación) {
        System.out.println(getNombre()+" está en competencia del deporte ");
        return true;
    }
}
