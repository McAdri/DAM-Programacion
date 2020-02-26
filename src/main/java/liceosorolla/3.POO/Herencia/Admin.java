package Herencia;

public class Admin extends Usuario{

	public Admin(String nombre,String password) {
		super(nombre,password);
	}
	
	@Override
	public void bienvenida() {
		System.out.println("Ponte a trabajar, que ya es hora, vago!!!!");
	}
}
