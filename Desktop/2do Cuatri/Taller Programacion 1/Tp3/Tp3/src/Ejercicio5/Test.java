package Ejercicio5;

public class Test {

	public static void main(String[] args) {

		Organizacion o = new Organizacion();

		Torneo t8 = new Torneo8();
		o.nuevoTorneo(t8);
		Equipo boca = new Equipo("Boca", 8);
		Equipo river = new Equipo("River", 8);
		Equipo racing = new Equipo("Racing", 8);
		Equipo sl = new Equipo("San Lorenzo", 8);
		Equipo indep = new Equipo("Independiente", 8);
		Equipo velez = new Equipo("Velez", 8);
		o.inscribirEquipo(t8, boca);
		o.inscribirEquipo(t8, river);
		o.inscribirEquipo(t8, racing);
		o.inscribirEquipo(t8, sl);
		o.inscribirEquipo(t8, indep);
		o.inscribirEquipo(t8, velez);

		t8.cargarJornada(1);
		t8.asignarPartidoAJornada(1, boca, sl, 5, 4);
		t8.asignarPartidoAJornada(1, river, racing, 1, 2);
		t8.asignarPartidoAJornada(1, velez, indep, 2, 6);

		t8.calcularPuntos(1);
		t8.mostrarTabla();
		System.out.println("-------------------");
		t8.cargarJornada(2);
		t8.asignarPartidoAJornada(2, boca, river, 4, 3);
		t8.asignarPartidoAJornada(2, sl, indep, 3, 0);
		t8.asignarPartidoAJornada(2, racing, velez, 5, 1);

		t8.calcularPuntos(2);
		t8.mostrarTabla();
		System.out.println("-------------------");
		t8.cargarJornada(3);
		t8.asignarPartidoAJornada(3, boca, velez, 6, 6);
		t8.asignarPartidoAJornada(3, sl, river, 3, 1);
		t8.asignarPartidoAJornada(3, racing, indep, 2, 4);

		t8.calcularPuntos(3);
		t8.mostrarTabla();
		System.out.println("-------------------");
		t8.cargarJornada(4);
		t8.asignarPartidoAJornada(4, boca, racing, 0, 0);
		t8.asignarPartidoAJornada(4, river, indep, 1, 2);
		t8.asignarPartidoAJornada(4, sl, velez, 4, 4);

		t8.calcularPuntos(4);
		t8.mostrarTabla();
		System.out.println("-------------------");
		t8.cargarJornada(5);
		t8.asignarPartidoAJornada(5, boca, indep, 2, 1);
		t8.asignarPartidoAJornada(5, river, velez, 2, 5);
		t8.asignarPartidoAJornada(5, sl, racing, 0, 3);

		t8.calcularPuntos(5);

		t8.mostrarTabla();
	}

}
