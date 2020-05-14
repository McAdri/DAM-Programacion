package Baraja;

import java.util.ArrayList;
import java.util.Collections;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Carta> baraja = new ArrayList<Carta>();
		
		for(Palo palos:Palo.values()) {
			for(Numero numeros:Numero.values()) {
				baraja.add(new Carta(palos,numeros));
			}
		}
		
		
		ArrayList<Carta> baraja2 = new ArrayList<Carta>();
		
		for(int i = 0;i<10;i++) {
			int pos = sacarCarta(baraja.size());
			baraja2.add(baraja.get(pos));
			baraja.remove(pos);
			System.out.println(baraja2.get(i).toString());
		}
		
		while(!baraja.isEmpty()) {
			int pos = sacarCarta(baraja.size());
			baraja2.add(baraja.get(pos));
			System.out.println(baraja.get(pos).toString());
			baraja.remove(pos);
			
		}
		
		
		Collections.sort(baraja2);
		System.out.println("---------");
		System.out.println("Reordenanado baraja: ");
		System.out.println(baraja2.size());
		for(int i=0;i<baraja2.size();i++) {
			System.out.println(baraja2.get(i).toString());
		}
		
		System.out.println("---------");
		System.out.println("Brisca!!!!!!");
		
		baraja.clear();
		
		int total = 0;
		
		for(int i=0;i<5;i++) {
			int posicion = sacarCarta(baraja2.size());
			baraja.add(baraja2.get(posicion));
			baraja2.remove(posicion);
			System.out.println(baraja.get(i).toString() + " vale " + baraja.get(i).valorCarta() + " puntos");
			total += baraja.get(i).valorCarta();
		}
		
		System.out.println("El valor total es " + total);
		
		
	}
	
	public static int sacarCarta(int cartas) {
		int numero = (int) (Math.random() * cartas);
		return numero;
	}

}
