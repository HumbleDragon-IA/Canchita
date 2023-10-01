package Ejercicio5;

public class Torneo11 extends Torneo {

	private final static int CANT_JUGADORES = 11;

	private final static int PTOS_EMPATE = 1;
	private final static int PTOS_GANADO = 3;
	private final static int PTOS_PERDIDO = 0;
	private final static int PTOS_VALLA_INVICTA_LOCAL = 0;
	private final static int PTOS_MAS_DE_4_GOLES = 0;
	private final static int PTOS_EMPATE_MAS_3_GOLES = 0;
	
	
	@Override
	public void puntosSegunResultado(Partido p1) {
		p1.calcular(PTOS_EMPATE, PTOS_GANADO, PTOS_PERDIDO, PTOS_VALLA_INVICTA_LOCAL, PTOS_MAS_DE_4_GOLES , PTOS_EMPATE_MAS_3_GOLES);
	}

	@Override
	public boolean excedeLimiteJugadores(Equipo e) {
		return e.excedeLimite(CANT_JUGADORES);
	}

}
