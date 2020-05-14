package TryCatch;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		
	
			try {
				System.out.println("Introduce");
				numero = teclado.nextInt();
				System.out.println("mensaje 1");

			}
			catch (Exception e){
				System.out.println("GILIPOLLASSSSSSSSS");
				System.out.println(e.getMessage());
				System.out.println(e.getClass());
			}
			finally {
				System.out.println("mensaje 2");
			}
		

		
		System.out.println("es jueves");
		System.out.println("empieza el puente");
		
		
	}

}
