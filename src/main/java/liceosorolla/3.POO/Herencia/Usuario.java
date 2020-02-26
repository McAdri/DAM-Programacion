package Herencia;

public abstract class Usuario {

	private String nombre;
	private String password;
	
	public Usuario(String nombre,String password) {
		this.nombre = nombre;
		this.password = password;
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
	
	public String toString() {
		return "Usuario: " + this.nombre + " password " + this.password;
	}
	
	public void bienvenida() {
		System.out.println("Bienvenido, espero que disfrutes de tu experiencia");
	}
	
}
