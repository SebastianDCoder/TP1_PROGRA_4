package Ejecicio1;

public class Principal {
    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Desarrollador");
        empleados[1] = new Empleado("Diseñador");
        empleados[2] = new Empleado("Analista");

        Empleado emple = new Empleado("Tester");


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
