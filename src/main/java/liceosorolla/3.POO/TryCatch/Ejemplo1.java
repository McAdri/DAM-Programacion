package TryCatch;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce: ");
		int numero = teclado.nextInt();
		try {
			pinta(numero);
		}
		catch (ExcepcionNumeroNegativo e) {
			System.out.println("No ha sido posible realizar el proceso");
		}
		
		teclado.close();
	}
	
	public static void pinta(int h) throws ExcepcionNumeroNegativo{
		if(h<0) {
			throw new ExcepcionNumeroNegativo();
		}
		int planta = 1;
		int longitudDeLinea = 1;
		int espacios = h - 1;
		while (planta <= h) {
		// inserta espacios
		for (int i = 1; i <= espacios; i++) {
		System.out.print(" ");
		}
		// pinta la línea
		for (int i = 1; i <= longitudDeLinea; i++) {
		System.out.print("*");
		}
		System.out.println();
		planta++;
		espacios--;
		longitudDeLinea += 2;
		}
	}

}
