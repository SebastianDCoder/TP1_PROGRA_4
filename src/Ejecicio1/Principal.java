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

    }
}
