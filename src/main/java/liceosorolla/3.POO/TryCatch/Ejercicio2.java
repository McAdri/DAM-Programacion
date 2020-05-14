package TryCatch;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total =30;
		int alumnos = 0;
		try {
			System.out.println("La media es " + calculaMedia(total, alumnos));
		}
		catch(ArithmeticException ae) {
			System.out.println("No es posible divir");
		}
	}
	
	public static int calculaMedia(int total, int alumnos) throws ArithmeticException{
		
		try {
			int media = total / alumnos;
			return media;
		}
		catch(ArithmeticException ae) {
			System.out.println("No se puede dividir entre 0");
			throw ae;
		}
	}

}
