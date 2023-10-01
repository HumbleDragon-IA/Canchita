package ar.ort.tp1.parcial1;

import java.util.ArrayList;

/**
*/
public class CentroDeMonitoreo {

	private ArrayList<Zona> zonasMonitoreadas;

	public CentroDeMonitoreo() {
		this.zonasMonitoreadas = new ArrayList<>();
	}

	public void agregarZonaSeca(ArrayList<Double> e, int elevacion, int longitud, int latitud, double porcInsolacion) {
		this.zonasMonitoreadas.add(new ZonaSeca(e, elevacion, longitud, latitud, porcInsolacion));

	}

	public void agregarZonaTropical(ArrayList<Double> e, int elevacion, int longitud, int latitud, int miliLovidos) {
		this.zonasMonitoreadas.add(new ZonaTropical(e, elevacion, longitud, latitud, miliLovidos));

	}

	public void agregarZonaMonzonica(ArrayList<Double> e, int elevacion, int longitud, int latitud, int miliLovidos,
			IntensidadViento intensidad) {

		this.zonasMonitoreadas.add(new ZonaTropicalMonzonica(e, elevacion, longitud, latitud, miliLovidos, intensidad));

	}

	public double porcZonaRiesgo() {
		double cantZonaRiesgo = 0;
		for (Zona z : this.zonasMonitoreadas) {
			if (z.enRiesgo()) {
				cantZonaRiesgo++;
			}
		}
		return cantZonaRiesgo * 100 / this.zonasMonitoreadas.size();
	}

	private boolean zonaEnListaEsRiesgo(Zona z) {
		return z.enRiesgo();
	}

	public void informarRiesgo(Coordenada c) {
		int i = 0;
		boolean coincide = false;
		Zona z = null;
		while (i < this.zonasMonitoreadas.size() && !coincide) {
			z = this.zonasMonitoreadas.get(i);
			if (z.coincideCoord(c)) {
				coincide = true;
				mensajeEsta(c, coincide, z);
			}

			i++;
		}
		if (!coincide) {
			System.out.println("No existe zona de coordenadas " + c);
		}

	}

	private void mensajeEsta(Coordenada c, boolean coincide, Zona z) {
		if (coincide) {
			System.out.println("La zona situada en " + c + imprimirMensajeRiesgo(z) + " esta en riesgo");
			coincide = true;
		} else {
			System.out.println("No existe zona de coordenadas " + c);
		}

	}

	private String imprimirMensajeRiesgo(Zona z) {

		return !this.zonaEnListaEsRiesgo(z) ? "no " : "";
	}

}