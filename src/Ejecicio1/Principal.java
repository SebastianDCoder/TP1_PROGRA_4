package Ejecicio1;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("46039631", "Sebastian", "Durazzini", java.time.LocalDate.of(2009,7,9), "Masculino", "2400","123456","sebas@gmail.com", "Game Developer");
        empleados[1] = new Empleado("46039649", "Alejo", "Martinez", java.time.LocalDate.of(2010,7,9), "Masculino", "1080","123456","ale@gmail.com", "Backend Developer");
        empleados[2] = new Empleado("00000001", "Leandro", "Serrano", java.time.LocalDate.of(1800,7,9), "Masculino", "8520","123456","lean@gmail.com", "Web Developer");

        Empleado emple = new Empleado("46000001", "Pedro", "Sanches", java.time.LocalDate.of(1800,7,9), "Masculino", "1234","123456","pato@gmail.com", "Tester");


        System.out.println("Empleados:");
        for (Empleado e : empleados) {
            System.out.println(e.toString());
        }

        System.out.println(emple.toString());

        System.out.println("Persona:");
        Persona persona = new Persona(
                "12345678",
                "Alejo",
                "Martinez",
                java.time.LocalDate.of(2004, 4, 12),
                "Masculino",
                "Calle Falsa 123",
                "555-1234",
                "ale@gmail.com");

        System.out.println(persona.toString());

        System.out.println(emple.toString());

    }
}
