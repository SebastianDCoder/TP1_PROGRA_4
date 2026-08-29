package Ejecicio1;

import java.time.LocalDate;

public class Empleado extends Persona{

    private final int legajo;
    private static int legajoCounter = 999;
    private String puesto;

    // Constructor
    public Empleado(){
        super();
        legajoCounter++;
        this.legajo = legajoCounter;
    }

    public Empleado(String dni, String nombre, String apellido,
                    LocalDate fechaNacimiento, String genero,
                    String direccion, String telefono, String email, String puesto){
        super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
        this.puesto = puesto;
        legajoCounter++;
        this.legajo = legajoCounter;
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