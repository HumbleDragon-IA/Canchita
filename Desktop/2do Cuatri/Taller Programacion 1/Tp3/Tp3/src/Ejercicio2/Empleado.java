package Ejercicio2;

public abstract class Empleado {

	private String nombre;
	private int edad;
	
	public Empleado(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public abstract double calcularPago();

	@Override
	public String toString() {
		return   nombre;
	}
	
	
	
}
