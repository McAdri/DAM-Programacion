package Ej4Fraccion;

public class StartFraccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fraccion fraccion = new Fraccion(3, 9);
		
		System.out.println(fraccion.toString());
		
		//Invertir
		fraccion.invierte();
		System.out.println(fraccion.toString());
		
		//Multiplica
		fraccion.multiplica(3);
		System.out.println(fraccion.toString());
		
		//Divide
		fraccion.divide(3);
		System.out.println(fraccion.toString());
		
		//Simplifica
		fraccion.invierte();
		fraccion.simplifica();
		System.out.println(fraccion.toString());
		
		//Suma fracciones
		System.out.print("Suma fr: ");
		fraccion = fraccion.suma(new Fraccion(1,2));
		System.out.println(fraccion.toString());
		
		//Resta fracciones
		System.out.print("Resta fr: ");
		fraccion = fraccion.resta(new Fraccion(1,2));
		System.out.println(fraccion.toString());
		fraccion.simplifica();
		
		//Multiplica fracciones
		System.out.print("Multiplica fr: ");
		fraccion = fraccion.multiplica(new Fraccion(1,3));
		System.out.println(fraccion.toString());

		//Divide fracciones
		System.out.print("Divide fr: ");
		fraccion = fraccion.divide(new Fraccion(1,3));
		System.out.println(fraccion.toString());
	}

}
