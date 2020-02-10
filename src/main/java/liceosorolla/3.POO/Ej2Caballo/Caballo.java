package Ej2Caballo;

public class Caballo {
	
	private String nombre;
	private Float peso;
	private String raza;
	private Float altura;
	private Float velocidad;
	private int edad;
	private String yeguada;
	private boolean carreras;
	private boolean puraSangre;
	private char Sexo;
	
	public Caballo(String nombre, Float peso,Float altura,int edad,boolean carreras,boolean puraSangre) {
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
		this.carreras = carreras;
		this.puraSangre = puraSangre;
		
		calcularVelocidad();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	public Float getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(Float velocidad) {
		this.velocidad = velocidad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getYeguada() {
		return yeguada;
	}
	public void setYeguada(String yeguada) {
		this.yeguada = yeguada;
	}
	public boolean isCarreras() {
		return carreras;
	}
	public void setCarreras(boolean carreras) {
		this.carreras = carreras;
	}
	public boolean isPuraSangre() {
		return puraSangre;
	}
	public void setPuraSangre(boolean puraSangre) {
		this.puraSangre = puraSangre;
	}
	public char getSexo() {
		return Sexo;
	}
	public void setSexo(char sexo) {
		Sexo = sexo;
	}
	
	private void calcularVelocidad() {
		if(this.edad < 2) {
			this.velocidad = (float) 15;
		}
		else if(this.edad <10) {
			this.velocidad = (float) 65;
		}
		else {
			this.velocidad = (float) 30;
		}
	}
	
	public void calculaDistanciaSalto() {
		if(carreras && puraSangre && this.altura >= (float) 1.6) {
			System.out.println("Salta 2,5 metros");
		}
		else {
			System.out.println("Salta 1,5 metros");
		}
		
	}
	
	public float calculaDistanciaRecorrida(int minutos) {
		float total = 0;
		
		total = (this.velocidad  * 1000 / 60) * minutos;
		
		float noRecorre = 0;
		
		if(this.peso > 400) {
			noRecorre = (this.peso - 400) * 20 * minutos;
		}
		
		total = total - noRecorre;
		
		return total;
	}
}
