package Herencia;

public class Visitante extends NormalUser{

	private int numeroVisitas;

	public Visitante(String nombre,String password) {
		super(nombre,password);
		this.numeroVisitas = 0;
	}
	
	public Visitante(String nombre,String password,int numeroVisitas,int horas,Tipo tipo) {
		super(nombre,password,horas,tipo);
		this.numeroVisitas = numeroVisitas;
	}
	
	public int getNumeroVisitas() {
		return numeroVisitas;
	}

	public void setNumeroVisitas(int numeroVisitas) {
		this.numeroVisitas = numeroVisitas;
	}
	
	@Override
	public String toString(){
		return "Usuario: " + this.getNombre()  + " lleva " + numeroVisitas + " visitas.";
	}
	
	public void visita() {
		this.numeroVisitas++;
	}
}
