package Ejercicio5;

import java.util.ArrayList;

public class Organizacion {

	private ArrayList<Torneo> torneos;

	public Organizacion() {
		this.torneos = new ArrayList<>();
	}

	public void nuevoTorneo(Torneo t) {
		this.torneos.add(t);
	}

	public void inscribirEquipo(Torneo torneo, Equipo equipo) {
		torneo.inscribirEquipo(equipo);
	}

}
