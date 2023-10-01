package ar.ort.tp1.parcial1;

import java.util.ArrayList;
import java.util.Arrays;

/**
*/
public class Test {

	public static void main(String[] args) {
		// No hay nada que hacer aquí en el main...
		CentroDeMonitoreo centro = new CentroDeMonitoreo();
		
		agregarZonasDePrueba(centro);
		testearPorcentajeDeZonasEnRiesgo(centro);
		System.out.println("------------------");
		testearInformarRiesgo(centro);
	}
	
	private static void agregarZonasDePrueba (CentroDeMonitoreo centro) {
		ArrayList<Double> temps1 = new ArrayList<>(Arrays.asList(47.3, 45.2, 40.1, 46.8, 39.6, 48.0, 49.8));
		ArrayList<Double> temps2 = new ArrayList<>(Arrays.asList(35.5, 36.2, 34.8, 33.9, 35.7, 36.5));
		ArrayList<Double> temps3 = new ArrayList<>(Arrays.asList(28.7, 29.2, 30.5, 31.1, 29.8, 30.0, 28.3, 32.0, 28.9));
		ArrayList<Double> temps4 = new ArrayList<>(Arrays.asList(55.6, 54.8, 56.2, 57.3, 55.9));
		ArrayList<Double> temps5 = new ArrayList<>(Arrays.asList(15.2, 15.5, 15.3, 15.7, 15.1, 14.9, 15.5));
		ArrayList<Double> temps6 = new ArrayList<>(Arrays.asList(15.8, 15.3, 15.6, 15.7, 15.2, 15.8, 15.1));
		
		centro.agregarZonaSeca(temps1, 2700, 3,4, 87);
		centro.agregarZonaTropical(temps2, 1350, 0,2, 256);
		centro.agregarZonaTropical(temps3, 900, 9,-6, 212);
		centro.agregarZonaSeca(temps4, 3100, -2,7, 92);
		centro.agregarZonaMonzonica(temps5, 2100, 4,0, 110, IntensidadViento.LEVE);
		centro.agregarZonaMonzonica(temps6, 1900, 5,5, 115, IntensidadViento.LEVE);
		
	}
	
	private static void testearPorcentajeDeZonasEnRiesgo (CentroDeMonitoreo centro) {
		
		System.out.println("Porcentaje de zonas en riesgo: " + centro.porcZonaRiesgo() + "%");
	}
	
	private static void testearInformarRiesgo (CentroDeMonitoreo centro) {	
		// No hay nada que hacer aquí...
	centro.informarRiesgo(new Coordenada(3,4));
		centro.informarRiesgo(new Coordenada(0,2));
		centro.informarRiesgo(new Coordenada(9,-6));
		centro.informarRiesgo(new Coordenada(-2,7));
		centro.informarRiesgo(new Coordenada(4,0));
		centro.informarRiesgo(new Coordenada(5,5));
		centro.informarRiesgo(new Coordenada(0,0));
	}

}