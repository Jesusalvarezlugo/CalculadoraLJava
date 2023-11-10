package Servicios;

import java.util.Scanner;

public class menuImplementacion implements menuInterfaz {

	@Override
	public int mostrarMenuYSeleccion(Scanner sc) {
		int opcionS;
		
		System.out.println("################");
		System.out.println("1. Cerrar");
		System.out.println("2. Igualdad");
		System.out.println("3. Desigualdad");
		System.out.println("Elige una opcion: ");
		opcionS=sc.nextInt();
		return opcionS;
	}

	@Override
	public String pedirPalabra(Scanner sc) {
		
		String palabra;
		System.out.println("Introduzca una palabra");
		palabra=sc.next();
		return palabra;
	}

}
