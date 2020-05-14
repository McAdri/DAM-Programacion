package TryCatch;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce nota:");
		
		try {
			int nota = teclado.nextInt();

			try {
				muestraNota(nota);
			}
			catch(ExceptionNota en) {
				System.out.println("Esa nota no es valida");
			}
		}
		catch(Exception e) {
			System.out.println("Esa nota no es valida 2");
		}
	}

	public static void muestraNota(int nota) throws ExceptionNota{
		if(nota<0 || nota>10)
			throw new ExceptionNota();
		
		if(nota<5) {
			System.out.println("Suspenso");
		}
		else {
			System.out.println("Aprobado");
		}
	}
}
