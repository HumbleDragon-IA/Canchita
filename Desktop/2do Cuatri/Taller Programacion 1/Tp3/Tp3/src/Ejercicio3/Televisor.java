package Ejercicio3;

public class Televisor extends Producto {

	private double dimensonPulgadas;
	private boolean esSmart;
	
	
	public Televisor(String marca, String modelo, String numSerie, double voltaje, Estado estado, double precio,
			double dimensonPulgadas, boolean esSmart) {
		super(marca, modelo, numSerie, voltaje, estado, precio);
		this.dimensonPulgadas = dimensonPulgadas;
		this.esSmart = esSmart;
	}


	@Override
	public void mostrarDatosCompletos() {
		mostrarDatosPreliminares();
		System.out.print(" Pulgadas: " + dimensonPulgadas + ", esSmart?: "+this.esSmart()+".");
	
	}
	
	public void mostrarDatosPreliminares() {
		System.out.print("Televisor: ");
		super.mostrarDatosPreliminares();
		
	}
	
	private String esSmart() {
		return this.esSmart==true ? "Si" :"No";
	}
}
