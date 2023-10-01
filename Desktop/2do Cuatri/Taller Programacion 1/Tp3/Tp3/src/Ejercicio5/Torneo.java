package Ejercicio5;

import java.util.ArrayList;

public abstract class Torneo {

	private ArrayList<Jornada> fechas;
	private ArrayList<Equipo> equiposInscriptos;

	public Torneo() {
		this.fechas = new ArrayList<>();
		this.equiposInscriptos = new ArrayList<>();

	}

	public void cargarJornada(int fecha) {
		Jornada j = this.buscarFecha(fecha);
		if (j == null) {
			this.fechas.add(new Jornada(fecha));
		}
	}

	public void asignarPartidoAJornada(int fecha, Equipo local, Equipo visitante, int golLocal, int golVisitante) {
		Jornada j = this.buscarFecha(fecha);
		if (j != null) {
			j.cargarPartido(local, visitante, golLocal, golVisitante);
		}
	}

	public boolean inscribirEquipo(Equipo e) {
		boolean inscribe = false;

		if (excedeLimiteJugadores(e)) {
			this.equiposInscriptos.add(e);
			inscribe = true;
		} else {
			System.out.println("Cantidad de Jugadores no valida para el torneo" + e);
		}

		return inscribe;
	}

	private Jornada buscarFecha(int fecha) {
		Jornada jBuscada = null;
		Jornada jEncontrada = null;
		int i = 0;

		while (i < this.fechas.size() && jEncontrada == null) {
			jBuscada = this.fechas.get(i);
			if (jBuscada.coincideFecha(fecha)) {
				jEncontrada = jBuscada;
			}
			i++;
		}
		return jEncontrada;
	}

	
	public  abstract void puntosSegunResultado(Partido p1) ;
	
	public abstract boolean excedeLimiteJugadores(Equipo e);
	
	

	public void mostrarTabla() {
		
		for (Equipo e : this.equiposInscriptos) {
			System.out.println(e.toString());
		}
	}

	public void calcularPuntos(int fecha) {
		System.out.println("Tabla de posiciones Fecha "+fecha);
		Jornada j = this.fechas.get(fecha - 1);
		ArrayList<Partido> partido = j.getPartidos();
		for (Partido p : partido) {
			puntosSegunResultado(p);
		}

	}
	
	
	
}
