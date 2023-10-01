package Ejercicio2;

public class SubContratado extends Empleado {

	private double cantHoras;
	private double precioHora;
	public SubContratado(String nombre, int edad, double cantHoras, double precioHora) {
		super(nombre, edad);
		this.cantHoras = cantHoras;
		this.precioHora = precioHora;
	}
	@Override
	public double calcularPago() {
		return this.precioHora*cantHoras;
	}
	@Override
	public String toString() {
		return "SubContratado " +super.toString()+" gana: "+this.calcularPago();
	}

}
