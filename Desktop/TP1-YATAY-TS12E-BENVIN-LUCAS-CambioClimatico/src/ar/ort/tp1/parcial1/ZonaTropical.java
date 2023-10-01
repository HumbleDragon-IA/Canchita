package ar.ort.tp1.parcial1;

import java.util.ArrayList;

public class ZonaTropical extends Zona {



	private int miliLlovidos;
	
	
	public ZonaTropical(ArrayList<Double> e, int elevacion, int latitud, int longitud, int miliLovidos) {
		super(e, elevacion, latitud, longitud);
		this.miliLlovidos= miliLovidos;
		
		
	}
	@Override
	public boolean enRiesgo() {
	
		return this.excedeMiliLlovidos()&& super.excedeElevacion();
	}

	@Override
	public String toString() {
		return "ZonaTropical [miliLlovidos=" + miliLlovidos + "]";
	}
	private boolean excedeMiliLlovidos() {
		return this.miliLlovidos>= 200;
	}
}
