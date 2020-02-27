package Herencia;

public class StartHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente("Adrian","manolito");
		
		System.out.println(cliente.toString());
		
		cliente.bienvenida();
		
		Admin admin =new Admin("javier","123456",87);
		
		System.out.println(admin.toString());
		
		admin.bienvenida();
				
		Visitante v1 = new Visitante("v1", "1");
		
		Visitante v2 = new Visitante("v2", "1", 55,7,Tipo.PREMIUM);
		
		System.out.println(v1.getTipo());
		
		System.out.println(v2.getTipo());
		
		admin.trabaja();
		
		System.out.println("El admin ha trabajado " + admin.getHoras());
		
		v1.trabaja();
		v1.trabaja(8);
		
		System.out.println("El visitante 1 ha navegado " + v1.getHoras());
		
		for(int i=0;i<50;i++) {
		
			v1.visita();
		}
		System.out.println("visitas del visitante 1: " + v1.getNumeroVisitas());
		
	}

}
