package Herencia;

public abstract class Usuario {

	private String nombre;
	private String password;
	private int horas;
	
	public Usuario(String nombre,String password) {
		this.nombre = nombre;
		this.password = password;
		this.horas = 0;
	}
	
	public Usuario(String nombre,String password,int horas) {
		this.nombre = nombre;
		this.password = password;
		this.horas = horas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getHoras() {
		return this.horas;
	}
	
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public String toString() {
		return "Usuario: " + this.nombre + " password " + this.password;
	}
	
	public void bienvenida() {
		System.out.println("Bienvenido, espero que disfrutes de tu experiencia");
	}
	
	public void trabaja() {
		this.horas++;
	}
	
	public void trabaja(int horas) {
		this.horas = this.horas + horas;
	}
	
	public void trabaja(long a) 
	{
		
	}
}
