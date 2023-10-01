package Ejercicio1;

public class Test {

	public static void main(String[] args) {
		Empresa e = new Empresa();
		
		
		e.agregarEmpleadoAsalariado("Jose", 30, 10000);
		e.agregarEmpleadoSubContratado("Carlos", 23, 50, 100);
		
		e.mostrarEmpleados();

	}

}
