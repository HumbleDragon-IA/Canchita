package ar.ort.tp1.parcial1;

import java.util.ArrayList;

public class ZonaSeca extends Zona {

	private double porcInsolacion;

	public ZonaSeca(ArrayList<Double> e, int elevacion, int latitud, int longitud, double porcInsolacion) {
		super(e, elevacion, latitud, longitud);
		this.porcInsolacion = porcInsolacion;
	}

	
	
	@Override
	public boolean enRiesgo() {
		
	return super.excedeTemp()&& this.porcInsolacion>90;
	}



	@Override
	public String toString() {
		return "ZonaSeca [porcInsolacion=" + porcInsolacion + "]";
	}

}
