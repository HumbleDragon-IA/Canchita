package Ejercicio4;

public class Producto {

	private String marca;
	private String modelo;
	private String numSerie;
	private double voltaje;
	private Estado estado;
	private double precio;
	
	
	public Producto(String marca, String modelo, String numSerie, double voltaje, Estado estado, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numSerie = numSerie;
		this.voltaje = voltaje;
		this.estado = estado;
		this.precio = precio;
	}
	
	
	
	public void mostrarDatosPreliminares() {
		System.out.print(toString());
		
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public void mostrarDatosCompletos() {
		this.mostrarDatosPreliminares();
		
	}
	
	@Override
	public String toString() {
		return "Marca: "+this.marca+". Modelo: "+this.modelo+". Precio: "+this.precio;
	}
}
