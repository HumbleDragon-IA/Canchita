package Ejercicio2;

public class Test {

	public static void main(String[] args) {
		Empresa e = new Empresa();
		
		
		e.agregarEmpleadoAsalariado("Jose", 30, 10000);
		e.agregarEmpleadoSubContratado("Carlos", 23, 50, 100);
		e.agregarVendedor("Pedro", 25, 100, 200, 5);
		e.agregarVendedor("Maria", 30, 100, 200, 10);
		e.mostrarEmpleados();

	}

}
