package Ejercicio1;

public class Asalariado extends Empleado {

	private double sueldo;
	
	
	public Asalariado(String nombre, int edad, double sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}


	@Override
	public double calcularPago() {
		return this.sueldo;
	}


	@Override
	public String toString() {
		return "Asalariado "+ super.toString() +" gana: "+ this.calcularPago() + "";
	}

}
