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
			}
			else {
				paises.add(pais);
				capitales.add(pedirCapital());
			}
		}while (!pais.equals("0"));
	}
	
	public static String pedirPais() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿De que pais quieres saber la capital???");
		return teclado.next();
	}
	
	public static String pedirCapital() {
		System.out.println("Lo siento, no conozco esa capital...");
		System.out.println("Me la podrias decir???");
		Scanner teclado = new Scanner(System.in);
		return teclado.next();
	}
}
