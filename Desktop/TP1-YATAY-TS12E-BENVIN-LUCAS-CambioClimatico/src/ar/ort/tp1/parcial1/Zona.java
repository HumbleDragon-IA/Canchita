package ar.ort.tp1.parcial1;

import java.util.ArrayList;

/**
*/
public abstract class Zona implements Monitoreable {

	private int elevacion;
	private ArrayList<Double> temperaturas;
	private Coordenada coordenada;	

	
	public Zona (ArrayList<Double> e, int elevacion, int latitud, int longitud) {
		
		this.temperaturas= e;
		this.coordenada= new Coordenada (latitud, longitud);
		this.elevacion=elevacion;
	}

	public abstract boolean enRiesgo();
	
	private double sumaTemp() {
		int suma=0;
		for (Double d : this.temperaturas) {
			suma+=d;
		}
		return suma;
	}
	
	public boolean coincideCoord(Coordenada c) {
		return this.coordenada.coincideCon(c);
	}
	
	public boolean excedeTemp() {
		return (this.sumaTemp()/ this.temperaturas.size())>43;
	}
	
	public boolean excedeElevacion() {
		return this.elevacionAlta();
	}
	
	public boolean tempBaja() {
		return this.bajaTempe();
	}
	
	private boolean bajaTempe () {
		boolean esBaja= false;
		int i =0;
		double temp=0;
		while (i<this.temperaturas.size() && !esBaja) {
			temp=this.temperaturas.get(i);
			if(temp<15) {
				esBaja=true;
			} i++;
			
		}
		return esBaja;
	}
	

	
	private boolean elevacionAlta() {
		return this.elevacion>1000;
	}
}

