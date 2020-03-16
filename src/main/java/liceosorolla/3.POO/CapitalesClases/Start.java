package CapitalesClases;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Pais> paises = new ArrayList<Pais>();
		
		paises.add(new Pais("España", "Madrid"));
		paises.add(new Pais("Portugal", "Lisboa"));
		
		String pais;
		do {
			pais = pedirPais();
			int posicion = 0;
			boolean encuentra = false;
			while(!encuentra && posicion<paises.size()) {
				if(paises.get(posicion).getPais().equals(pais)) {
					encuentra = true;
					System.out.println("la capital de " + pais + " es " + paises.get(posicion).getCapital());
				}
				else{
					posicion++;
				}
			}
			
			if(!encuentra) {
				paises.add(new Pais(pais,pedirCapital("Lo siento, no conozco esa capital...\nMe la podrias decir???\"")));
			}
			else {
				if(!imprime("¿Es correcta la capital?")) {
					
					paises.get(posicion).setCapital(pedirCapital("Introuzca el nuevo valor: "));
				}
				else {
					if(imprime("¿Quieres borrar este pais?")) {
						paises.remove(posicion);
					}
				}
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
