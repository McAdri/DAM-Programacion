package TryCatch;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu numero de telefono: ");
		
		String telefono = teclado.nextLine();
		
		try {
			System.out.println(cuentaTelefono(telefono));
		}
		catch(ExcepcionTelefono et) {
			System.out.println("Has entrado en el catch!!!");
		}
	}
	
	public static boolean cuentaTelefono(String telefono) throws ExcepcionTelefono{
		
		boolean compruebaDigito = true;
		
		for(int i=0;i<telefono.length();i++) {
			if(!Character.isDigit(telefono.charAt(i)))
				compruebaDigito = false;
		}
		
		if(telefono.length()!=9 || !compruebaDigito)
			throw new ExcepcionTelefono();
		
		boolean comprueba = false;
		int contador = 0;
		
		for(int i=0;i<telefono.length();i++) {
			if(Integer.parseInt(String.valueOf(telefono.charAt(i))) >=5 ) {
				contador++;
			}
		}
		
		if(contador>=5)
			comprueba=true;
		
		return comprueba;
	}

}
