package ar.ort.tp1.parcial1;

import java.util.ArrayList;

public  class ZonaTropicalMonzonica extends ZonaTropical {
	
	private IntensidadViento intensidadViento;
	
	public ZonaTropicalMonzonica(ArrayList<Double> e, int elevacion, int latitud, int longitud, int miliLovidos, IntensidadViento intensidad) {
		super(e, elevacion, latitud, longitud, miliLovidos);
		this.intensidadViento= intensidad;
	}
	
	
	
	public boolean enRiesgo() {
		
		return super.enRiesgo()||super.tempBaja() && this.intensidadViento==IntensidadViento.LEVE;
	}



	@Override
	public String toString() {
		return "ZonaTropicalMonzonica [intensidadViento=" + intensidadViento + "]";
	}
	
	
}
