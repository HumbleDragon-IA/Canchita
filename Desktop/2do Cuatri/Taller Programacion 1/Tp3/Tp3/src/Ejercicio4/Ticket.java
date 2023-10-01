package Ejercicio4;

import java.util.ArrayList;

public class Ticket implements Imprimible {

	private ArrayList<Producto> productos;
	
	public Ticket (ArrayList<Producto>e) {
		this.productos=e;
	}
	public void imprimir() {
		System.out.println("Articulos del carrito elegido: ");
		for (Producto p : this.productos) {

			p.mostrarDatosCompletos();
			System.out.println();
		}
		System.out.println("Por un total de:" + this.obtenerValorCarrito());
	}
	private double obtenerValorCarrito() {
		double precioTotal = 0;
		for (Producto p : this.productos) {
			precioTotal += p.getPrecio();
		}
		return precioTotal;
	}
	
}
