package Herencia;

public class StartHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente("Adrian","manolito");
		
		System.out.println(cliente.toString());
		
		cliente.bienvenida();
		
		Admin admin =new Admin("javier","123456");
		
		System.out.println(admin.toString());
		
		admin.bienvenida();
		
		Visitante v1 = new Visitante("v1", "1");
		
		Visitante v2 = new Visitante("v2", "1", 55);
		
		System.out.println(v1.toString());
		
		System.out.println(v2.toString());
		
	}

}
