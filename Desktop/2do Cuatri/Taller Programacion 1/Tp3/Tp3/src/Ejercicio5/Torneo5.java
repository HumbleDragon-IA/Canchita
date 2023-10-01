package Ejercicio5;

public class Torneo5 extends Torneo {

	private final static int CANT_JUGADORES = 5;

	private final static int PTOS_EMPATE = 1;
	private final static int PTOS_GANADO = 2;
	private final static int PTOS_PERDIDO = 0;
	private final static int PTOS_VALLA_INVICTA_LOCAL = 0;
	private final static int PTOS_MAS_DE_4_GOLES = 1;
	private final static int PTOS_EMPATE_MAS_3_GOLES = 2;

	@Override
	public void puntosSegunResultado(Partido p1) {
		p1.calcular(PTOS_EMPATE, PTOS_GANADO, PTOS_PERDIDO, PTOS_VALLA_INVICTA_LOCAL, PTOS_MAS_DE_4_GOLES , PTOS_EMPATE_MAS_3_GOLES);
	}

	@Override
	public boolean excedeLimiteJugadores(Equipo e) {
		return e.excedeLimite(CANT_JUGADORES);
	}

}
