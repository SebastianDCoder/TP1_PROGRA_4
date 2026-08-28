package Ejecicio1;

public class Empleado extends Persona{

    private final int legajo;
    private static int legajoCounter = 999;
    private String puesto;

    // Constructor


    public Empleado(String puesto) {
        legajoCounter++;
        this.legajo = legajoCounter;
        this.puesto = puesto;
    }

    //Getters y Setters
    public int getLegajo() {
        return legajo;
    }

    //public void setLegajo(int legajo) {
    //    this.legajo = legajo;
    //}

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    //Metodo toString

    @Override
    public String toString() {
        return "Empleado{" +
                "legajo=" + legajo +
                ", puesto='" + puesto + '\'' +
                '}';
    }
}