package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Capitales {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido a clase con Epi y Blas!!!!");
		System.out.println("Hoy estudiaremos las capitales!!!");
		
		ArrayList<String> paises = new ArrayList<String>();
		paises.add("España");
		paises.add("Francia");
		
		ArrayList<String> capitales = new ArrayList<String>();
		capitales.add("Madrid");
		capitales.add("Paris");
		
		String pais;
		do {
			pais = pedirPais();
			if(paises.contains(pais)) {
				int posicion = paises.indexOf(pais);
				System.out.println("la capital de " + pais + " es " + capitales.get(posicion));
				
				if(!imprime("¿Es correcta la capital?")) {
					capitales.set(posicion, pedirCapital("Introduce el nuevo valor"));
				}
				else {
					if(imprime("Quieres borrar este pais?")) {
						capitales.remove(posicion);
						paises.remove(posicion);
					}
				}
				
			}
			else {
				paises.add(pais);
				capitales.add(pedirCapital("Lo siento, no conozco esa capital...\nMe la podrias decir???\""));
			}
		}while (!pais.equals("0"));
	}
	
	public static boolean imprime(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(texto);
		String in = teclado.next();
		boolean comprueba = false;
		if(in.equalsIgnoreCase("SI")) {
			comprueba = true;
		}
		
		return comprueba;
	}
	
	public static String pedirPais() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("�De que pais quieres saber la capital???");
		return teclado.next();
	}
	
	public static String pedirCapital(String texto) {
		System.out.println(texto);
		Scanner teclado = new Scanner(System.in);
		return teclado.next();
	}
}
