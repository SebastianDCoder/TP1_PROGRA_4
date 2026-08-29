package Ejecicio1;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {


        Empleado[] empleados = new Empleado[5];
        empleados[0] = new Empleado("46039631", "Sebastian", "Durazzini", java.time.LocalDate.of(
                2009, 7,9), "Masculino",
                "2400","123456","sebas@gmail.com", "Game Developer");

        empleados[1] = new Empleado("46039649", "Alejo", "Martinez", java.time.LocalDate.of(
                2010,7,9), "Masculino",
                "1080","123456","ale@gmail.com", "Backend Developer");


        empleados[2] = new Empleado("00000001", "Leandro", "Serrano", java.time.LocalDate.of(
                1800,7,9), "Masculino",
                "8520","123456","lean@gmail.com", "Web Developer");

        empleados[3] = new Empleado();
        empleados[4] = new Empleado();


        for (Empleado e : empleados) {
            System.out.println(e.toString());
        }

        System.out.println("El próximo legajo será el: " + Empleado.devuelveProximoLegajo());

    }
}
