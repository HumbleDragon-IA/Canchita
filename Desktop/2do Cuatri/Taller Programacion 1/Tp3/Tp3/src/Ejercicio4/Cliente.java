package Ejercicio4;

import java.util.ArrayList;

public class Cliente {
    private String cuil;
	private String apenom;
	private Ticket ticket;

	public Cliente(String cuil, String apenom) {
		this.cuil=cuil;
		this.apenom = apenom;
		
	}

	public void mostrarProductosTicket() {
		this.ticket.imprimir();
	}
	

	public void agregarProductos(ArrayList<Producto> p) {
		this.ticket = new Ticket (p);
	}

}
