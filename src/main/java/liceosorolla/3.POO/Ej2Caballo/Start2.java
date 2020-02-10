package Ej2Caballo;

public class Start2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caballo miCaballo = new Caballo("Perdigon", (float) 450, (float) 1.75, 8, false, true);
		
		System.out.println(miCaballo.getVelocidad());
		
		miCaballo.calculaDistanciaSalto();
		
		System.out.println(miCaballo.calculaDistanciaRecorrida(10) + " metros");
	}

}
