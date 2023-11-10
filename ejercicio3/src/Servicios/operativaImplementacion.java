package Servicios;

public class operativaImplementacion implements operativaInterfaz {

	@Override
	public void Igualdad(String palabra,String palabra2) {
		
		if(palabra==palabra2) {
			System.out.println("La igualdad es: "+palabra.equals(palabra2));
		}else {
			System.out.println("La igualdad es: "+palabra.equals(palabra2));
		}
	}

	@Override
	public void Desigualdad(String palabra,String palabra2) {
		
		if(palabra!=palabra2) {
			System.out.println("La desigualdad es: "+!palabra.equals(palabra2));
		}else {
			System.out.println("La desigualdad es: "+palabra.equals(palabra2));
		}
	}

}
