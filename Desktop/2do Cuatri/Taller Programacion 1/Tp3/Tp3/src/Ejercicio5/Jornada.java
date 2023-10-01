package Ejercicio5;

import java.util.ArrayList;

public class Jornada {
	private int numeroFecha;
	private ArrayList<Partido> partidos;

	public Jornada(int fecha) {
		this.numeroFecha = fecha;
		this.partidos = new ArrayList<>();

	}

	public void cargarPartido(Equipo local, Equipo visitante, int golLocal, int golVisitante) {
		this.partidos.add(new Partido(local, visitante, golLocal, golVisitante));
	}

	public boolean coincideFecha(int i) {
		return this.numeroFecha == i;
	}

	public ArrayList<Partido> getPartidos() {
		ArrayList<Partido> p = new ArrayList<>();
		p.addAll(this.partidos);

		return p;
	}
}
