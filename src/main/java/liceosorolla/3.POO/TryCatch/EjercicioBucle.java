package TryCatch;

import java.util.Scanner;

public class EjercicioBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		boolean valido = false;
		do {
			try {
				valido = false;
				System.out.println("Introduce");
				
				numero = teclado.nextInt();
				System.out.println("mensaje 1");
				valido = true;
	
			}
			catch (Exception e){
				teclado.next();
				System.out.println("GILIPOLLASSSSSSSSS");
				System.out.println(e.getMessage());
				System.out.println(e.getClass());
			}
		}
		while(!valido);
		
	}

}
