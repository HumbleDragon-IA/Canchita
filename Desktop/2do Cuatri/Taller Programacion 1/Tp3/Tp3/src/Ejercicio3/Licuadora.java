package Ejercicio3;

public class Licuadora extends Producto {

	private double potenciaWatts;
	private int cantVelocidades;
	
	
	public Licuadora(String marca, String modelo, String numSerie, double voltaje, Estado estado, double precio,
			double potenciaWatts, int cantVelocidades) {
		super(marca, modelo, numSerie, voltaje, estado, precio);
		this.potenciaWatts = potenciaWatts;
		this.cantVelocidades = cantVelocidades;
	}
	
	
	@Override
	public void mostrarDatosCompletos() {
		mostrarDatosPreliminares();
		System.out.print(". Potencia en Watts: "+this.potenciaWatts+". Cantidad Velocidades"+this.cantVelocidades);
		
	}
	public void mostrarDatosPreliminares() {
		System.out.print("Licuadora: ");
		super.mostrarDatosPreliminares();
		
	}
}
