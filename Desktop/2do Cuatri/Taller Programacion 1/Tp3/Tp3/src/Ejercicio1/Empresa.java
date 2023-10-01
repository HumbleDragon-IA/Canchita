package Ejercicio1;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Empleado> empleados;
	
	
	public Empresa() {
		this.empleados=new ArrayList<>();
	}
	
	
	public void agregarEmpleadoAsalariado (String nom, int edad, double sueldo) {
		this.empleados.add(new Asalariado(nom,edad,sueldo));
	}
	
	public void agregarEmpleadoSubContratado(String nom, int edad, double cantHoras, double precioHora) {
		this.empleados.add(new SubContratado(nom,edad,cantHoras, precioHora));
	}
	
	
	public void mostrarEmpleados() {
		for(Empleado e: this.empleados) {
			System.out.println(e.toString());
		}
	}
}
