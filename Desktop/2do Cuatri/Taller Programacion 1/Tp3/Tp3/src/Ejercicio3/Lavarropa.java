package Ejercicio3;

public class Lavarropa extends Producto {

	private double cargaMaxKg;
	private TipoLavarropa tipo;
	
	
	public Lavarropa(String marca, String modelo, String numSerie, double voltaje, Estado estado, double precio,
			double cargaMaxKg, TipoLavarropa tipo) {
		super(marca, modelo, numSerie, voltaje, estado, precio);
		this.cargaMaxKg = cargaMaxKg;
		this.tipo = tipo;
	}
	
	@Override
	public void mostrarDatosCompletos() {
		mostrarDatosPreliminares();
		System.out.print(". Carga Maxima: "+this.cargaMaxKg+". Tipo de Lavarropa: "+this.tipo);
		
	}
	
	public void mostrarDatosPreliminares() {
		System.out.print("Lavarropa: ");
		super.mostrarDatosPreliminares();
		
	}
}
