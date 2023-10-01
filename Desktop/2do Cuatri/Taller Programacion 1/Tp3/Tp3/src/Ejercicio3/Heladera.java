package Ejercicio3;

public class Heladera extends Producto {

	private double capacidad;
	private boolean esNoFrost;
	
	
	public Heladera(String marca, String modelo, String numSerie, double voltaje, Estado estado, double precio,
			double capacidad, boolean esNoFrost) {
		super(marca, modelo, numSerie, voltaje, estado, precio);
		this.capacidad = capacidad;
		this.esNoFrost = esNoFrost;
	}
	
	@Override
	public void mostrarDatosCompletos() {
		
		mostrarDatosPreliminares();
		System.out.print(". Capacidad en Litros "+this.capacidad+". Es No Frost: "+this.esNoFrost());
		
		
	}
	public void mostrarDatosPreliminares() {
		System.out.print("Heladera: ");
		super.mostrarDatosPreliminares();
		
	}
	
	private String esNoFrost() {
		return this.esNoFrost==true ? "Si" : "No";
	}
	
}
