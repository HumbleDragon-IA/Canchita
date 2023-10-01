package Ejercicio3;

import java.util.ArrayList;

public class FravegOrt {

	private ArrayList<Producto> listaProductos;
	
	
	public FravegOrt () {
		this.listaProductos=new ArrayList<>();
	}
	
	
	public void agregarLavarropa(String marca, String modelo, String numSerie, double voltaje, Estado estado, double precio,
			double cargaMaxKg, TipoLavarropa tipo) {
		this.listaProductos.add(new Lavarropa(marca,modelo,numSerie,voltaje,estado,precio,cargaMaxKg,tipo));
	}
	
	public void agregarTelevisor(String marca, String modelo, String numSerie, double voltaje, Estado estado, double precio,
			double dimensonPulgadas, boolean esSmart) {
		this.listaProductos.add(new Televisor(marca,modelo,numSerie,voltaje,estado,precio,dimensonPulgadas,esSmart));
	}
	
	public void agregarHeladera(String marca, String modelo, String numSerie, double voltaje, Estado estado, double precio,
			double capacidad, boolean esNoFrost) {
		this.listaProductos.add(new Heladera(marca,modelo,numSerie,voltaje,estado,precio,capacidad,esNoFrost));
	}
	
	public void agregarLicuadora(String marca, String modelo, String numSerie, double voltaje, Estado estado, double precio,
			double potenciaWatts, int cantVelocidades) {
		this.listaProductos.add(new Licuadora(marca,modelo,numSerie,voltaje,estado,precio,potenciaWatts,cantVelocidades));
	}
	
	
	public void mostrarLista () {
		int i=0;
		for(Producto p: this.listaProductos) {
			i++;
			System.out.print(i+"° Producto: ");
			p.mostrarDatosPreliminares();
			System.out.println();
		}
	}
	public ArrayList<Producto> listaProductos() {
		ArrayList<Producto> productos = new ArrayList<>();
		int i =0;
		for (Producto p :this.listaProductos) {
			i++;
			productos.add(p);
			}
		
		
		return productos;
	}
}
