package Herencia;

public class Cliente extends NormalUser{
	
	public Cliente(String nombre,String password) {
		super(nombre,password);
	}
	
	public Cliente(String nombre,String password,int horas,Tipo tipo) {
		super(nombre,password,horas,tipo);
	}

}
