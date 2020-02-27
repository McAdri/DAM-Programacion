package Herencia;

public abstract class NormalUser extends Usuario{

	private Tipo tipo;
	
	public NormalUser(String nombre,String password) {
		super(nombre,password);
		this.tipo = Tipo.FREE;
	}
	
	public NormalUser(String nombre,String password,int horas,Tipo tipo) {
		super(nombre,password,horas);
		this.tipo = tipo;
	}
	
	public Tipo getTipo() {
		return tipo;
	}
	
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
}
