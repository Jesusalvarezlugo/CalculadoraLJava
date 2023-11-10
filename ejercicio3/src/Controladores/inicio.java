package Controladores;

import java.util.Scanner;

import Servicios.menuImplementacion;
import Servicios.menuInterfaz;
import Servicios.operativaImplementacion;
import Servicios.operativaInterfaz;

public class inicio {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		menuInterfaz mi=new menuImplementacion();
		operativaInterfaz oi=new operativaImplementacion();
		int opcionS;
		String palabra1="";
		String palabra2="";
		boolean cerrarMenu=false;
		
		while(!cerrarMenu) {
			
			opcionS=mi.mostrarMenuYSeleccion(sc);
			
			if(opcionS!=1) {
				palabra1=mi.pedirPalabra(sc);
				palabra2=mi.pedirPalabra(sc);
			}
			
			switch(opcionS) {
			
			case 1:
				System.out.println("Se cierra la aplicación");
				cerrarMenu=true;
				break;
				
			case 2:
				System.out.println("Se ejecutara caso 2");
				oi.Igualdad(palabra1, palabra2);
				break;
				
			case 3:
				System.out.println("Se ejecutara caso 3");
				oi.Desigualdad(palabra1, palabra2);
				break;
				
			default:
				System.out.println("[ERROR] opcion seleccionada no valida");
				break;
			}
		}
		
		

	}

}
