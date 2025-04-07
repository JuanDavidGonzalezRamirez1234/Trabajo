package Horario;

public class EmpleadoDePlanta extends Empleado{
    private double salarioFijo ;

    public EmpleadoDePlanta(String nombre, int edad, double salarioFijo){
        super (nombre, edad);
        this.salarioFijo = salarioFijo;
    }
    @Override

    public double calcularSalario() {
        return salarioFijo;
    }
    @Override
    public String toString (){
        return super.toString()+ " Salario fijo; "+ salarioFijo;
    }

}
