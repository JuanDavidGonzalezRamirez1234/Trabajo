package Horario;

public class EmpleadoDePlanta extends Empleado {
    private double salarioFijo;

    public EmpleadoDePlanta(String nombre, int edad, double salarioFijo) {
        super(nombre, edad);
        this.salarioFijo = salarioFijo;
    }

    @Override
    public double calcularSalario() {
        return salarioFijo;
    }

    public double getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(double salarioFijo) {

        this.salarioFijo = salarioFijo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salario Fijo: " + salarioFijo;
    }
}
