package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	static Scanner miTeclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		FravegOrt f = new FravegOrt();
			
		f.agregarHeladera("Whirpool", "HTX 3500 ", "35005522", 220, Estado.APAGADO, 20000, 350, false);
		f.agregarHeladera("Whirpool",  "H2745", "27455522", 220, Estado.APAGADO, 14999, 250, true);
		f.agregarLavarropa("Drean", "Concept", "C152ASD", 220, Estado.APAGADO, 6799, 6, TipoLavarropa.SEMIAUTOMATICO);
		f.agregarLavarropa("Whirpool", "XT14521", "XT145212ASD", 220, Estado.APAGADO, 9799, 9, TipoLavarropa.AUTOMATICO);
		f.agregarLicuadora("Kelvinator", "Kelv1231", "KelXa123", 220, Estado.APAGADO, 5000, 120, 7);
		f.agregarLicuadora("Philips", "PH31", "Philips123", 220, Estado.APAGADO, 7000, 130, 8);
		f.agregarTelevisor("Sony", "S3500", "s35000222", 220, Estado.APAGADO, 35000, 29, false);
		f.agregarTelevisor("Philips", "49PGFS", "phil4900222", 220, Estado.APAGADO, 35000, 29, true);
		
		
		mostrarCarrito(menu(f));
	}
	
	public static void mostrarCarrito(ArrayList<Producto> e) {
		int precioTotal=0;
		System.out.println("Articulos del Carrito: ");
		for(Producto p: e) {
			p.mostrarDatosCompletos();
			precioTotal+= p.getPrecio();
			System.out.println();
		}
		System.out.println("Por un total de: "+precioTotal);
	}
	
	private static Producto seleccionarProducto(int opcion, FravegOrt f) {
		Producto p1 = f.listaProductos().get(opcion-1);
		System.out.println("Seleccionó el item: ");
		p1.mostrarDatosPreliminares();
		System.out.println();
		System.out.println("-------------------------");
		return p1;
	}
	
	
	
	public static ArrayList<Producto> menu (FravegOrt f) {
		ArrayList<Producto> carrito= new ArrayList<>();
		int opcion=-1;
		
		do {
		System.out.println("Bienvenid@! Elija el producto que desee agregar a su lista");
		f.mostrarLista();
		opcion=Integer.parseInt(miTeclado.nextLine());
		if (!termino(opcion)) {
		carrito.add(seleccionarProducto(opcion, f));
		}
		}while (!termino(opcion));
		return carrito;
		
	}
	
	private static boolean termino(int opcion) {
		return opcion==0;
	}
	
}
