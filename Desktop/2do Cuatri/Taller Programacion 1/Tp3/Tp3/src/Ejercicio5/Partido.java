package Ejercicio5;

public class Partido {

	private Equipo local;
	private Equipo visitante;
	private int golesLocal;
	private int golesVisitante;

	public Partido(Equipo local, Equipo visitante, int golesLocal, int golesVisitante) {

		this.local = local;
		this.visitante = visitante;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
	}

	
	private Equipo quienGano() {
		return this.golesLocal > this.golesVisitante ? this.local : this.visitante;
	}

	private Equipo quienPerdio() {
		return this.golesLocal > this.golesVisitante ? this.visitante : this.local;
	}

	private boolean huboEmpante() {
		return this.golesLocal == this.golesVisitante;
	}

	private boolean vallaInvicta() {
		return this.golesVisitante == 0|| this.golesLocal==0;
	}

	
	private boolean GanoPorMasDe4() {
		return (this.golesLocal - this.golesVisitante) >= 4 || (this.golesLocal - this.golesVisitante) <= -4;
	}

	private boolean hubo3Goles() {
		return this.golesLocal >= 3;
	}

	private void sumarEmpate(int i) {
		this.local.sumarPuntos(i);
		this.visitante.sumarPuntos(i);
	}

	private void sumarPuntosMas3(int i) {
		this.local.sumarPuntos(i);
		this.visitante.sumarPuntos(i);
	}

	
	public void calcular( int empate, int ganado, int perdido, int valla, int mas4Goles, int empate3Goles) {
		if (huboEmpante()) {
			sumarEmpate(empate);
			if (hubo3Goles()) {
				sumarPuntosMas3(empate3Goles);
			}
		} else {
			Equipo ganador = quienGano();
			Equipo perdedor = quienPerdio();
			ganador.sumarPuntos(ganado);
			perdedor.sumarPuntos(perdido);
			vallaInvicta(ganador, valla);
			masDe4( ganador, mas4Goles);
		}
	}

	private void vallaInvicta(Equipo ganador, int valla) {
		if (vallaInvicta()) {
			ganador.sumarPuntos(valla);
		}
	}

	private void masDe4( Equipo ganador, int mas4Goles) {
		if (GanoPorMasDe4()) {
			ganador.sumarPuntos(mas4Goles);
		}
	}
	
}
