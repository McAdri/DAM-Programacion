package Ej1Persona;

public class Start {

	public static void main(String[] args) {
		
		Persona miProfe = new Persona("Adrian",170);
		Persona pilotes = new Persona();
		
		System.out.println(miProfe.getNombre());
		
		//miProfe.setAltura(235);
		
		miProfe.setPeso((float) 100);
		
		miProfe.calculaPeso();

		miProfe.setEdad(28);
		
		//miProfe.comprobarMayorEdad();
		
		miProfe.SetDni("12345678B");
		
		miProfe.setEdad(28);
		miProfe.setCarne(true);
		
		if(miProfe.comprobarDNI()) {
			System.out.println("El DNI es correcto");
		}
		else {
			System.out.println("El DNI es falsisimo");
		}
		
		if(miProfe.compruebaCarne()) {
			System.out.println("Adelante Schumacher");
		}
		else {
			System.out.println("Eres un inconsciente");
		}
		
	}

}
