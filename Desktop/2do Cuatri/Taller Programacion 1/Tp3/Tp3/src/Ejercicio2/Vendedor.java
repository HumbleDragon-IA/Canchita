package Ejercicio2;

public class Vendedor extends SubContratado {
	
	private double porcentaje;

	public Vendedor(String nombre, int edad, double cantHoras, double precioHora, double porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		this.porcentaje = porcentaje;
	}
	
	@Override
	public double calcularPago() {
		return super.calcularPago()+super.calcularPago()*(this.porcentaje/100);
	}

	@Override
	public String toString() {
		return "Vendedor "+super.toString();
	}
	
	
	
	
}
