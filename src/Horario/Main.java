package Horario;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SistemaGestionEmpleados {
    private List<Empleado> empleados;
    private Scanner scanner;

    public SistemaGestionEmpleados() {
        empleados = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        SistemaGestionEmpleados sistema = new SistemaGestionEmpleados();
        sistema.ejecutar();
    }

    private void ejecutar() {
        boolean salir = false;
        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1. Registrar Empleado de Planta");
            System.out.println("2. Registrar Empleado por Horas");
            System.out.println("3. Mostrar Salarios de Empleados");
            System.out.println("4. Listar todos los Empleados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarEmpleadoDePlanta();
                    break;
                case 2:
                    registrarEmpleadoPorHoras();
                    break;
                case 3:
                    mostrarSalarios();
                    break;
                case 4:
                    listarEmpleados();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private void registrarEmpleadoDePlanta() {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();
        double salarioFijo = 2100000; // Salario fijo de 2.100.000
        Empleado empleado = new EmpleadoDePlanta(nombre, edad, salarioFijo);
        empleados.add(empleado);
        System.out.println("Empleado de Planta registrado exitosamente.");
    }

    private void registrarEmpleadoPorHoras() {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese pago por hora: ");
        double pagoPorHora = scanner.nextDouble();
        System.out.print("Ingrese horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        Empleado empleado = new EmpleadoPorHoras(nombre, edad, pagoPorHora, horasTrabajadas);
        empleados.add(empleado);
        System.out.println("Empleado por Horas registrado exitosamente.");
    }

    private void mostrarSalarios() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString() + ", Salario: " + empleado.calcularSalario());
        }
    }

    private void listarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }
    }
}