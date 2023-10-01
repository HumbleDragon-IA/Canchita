package Ejercicio5;

public class Equipo {

	private String nombre;
	private int jugadores;
	private int puntos;

	public Equipo(String nombre, int cantJugadores) {
		this.nombre = nombre;
		this.jugadores = cantJugadores;
		this.puntos = 0;
	}

	public boolean excedeLimite(int cant) {
		return this.jugadores == cant;
	}

	public void sumarPuntos(int puntosFecha) {
		this.puntos += puntosFecha;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + " puntos: " + this.puntos;
	}

}
