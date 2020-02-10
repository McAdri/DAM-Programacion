package Ej3Coche;

import java.util.Scanner;

public class Start3 {

	public static void main(String[] args) {
		Coche megane = new Coche("Renault","Megane",110, 2100, 186000);

		System.out.println("Bienvenido");
		System.out.println(megane.toString());
		int opcion = 0;
		do {
			opcion = menu();
			switch(opcion) {
				case 1:
					megane.arranca();
				break;
				case 2:
					megane.para();
				break;
				case 3:
					megane.circula();
				break;
				case 4:
					megane.aumentaVelocidad();
					System.out.println("Tu nueva velocidad es " + megane.getVelocidad() + " km/h");
				break;
				case 5:
					megane.disminuyeVelocidad();
					System.out.println("Tu nueva velocidad es " + megane.getVelocidad() + " km/h");
				break;
				case 6:
					System.out.println("El coche tiene "+ megane.getKilometros() + " kilometros");
				break;	
				case 7:
					megane.potencia();
				break;
				case 8:
					megane.transformarVelocidad();
				break;
				case 9:
					megane.proximaRevision();
				break;
				case 10:
					System.out.println("Adiós.");
				break;
			};
		}
		while(opcion != 10);
		
		System.out.println(megane.toString());
	}
	
	public static int menu() {
		int opcion = 1;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("============");
			System.out.println("1. Arrancar el motor");
			System.out.println("2. Para el motor");
			System.out.println("3. Andar con el coche");
			System.out.println("4. Aumentar velocidad");
			System.out.println("5. Disminuir velocidad");
			System.out.println("6. Ver kilometors");
			System.out.println("7. Ver potencia en kW");
			System.out.println("8. Ver velocidad en m/s");
			System.out.println("9. Cuantos kilometros hasta proxima revision");
			System.out.println("10. Salir");
			opcion = teclado.nextInt();
		}
		while(opcion <0 || opcion >10);
		
		return opcion;
	}

}
