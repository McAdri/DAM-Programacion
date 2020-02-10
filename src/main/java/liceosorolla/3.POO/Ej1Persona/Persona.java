package Ej1Persona;

public class Persona {

	private String nombre;
	private int altura;
	private Float peso;
	private String dni;
	private int edad;
	private boolean carne;
	private String lugarNacimiento;
	private char sexo;


	public Persona(String nombre,int altura) {
		this.nombre = nombre;
		this.altura = altura;
	}
	
	public Persona() {
		this.nombre = "Pilotes";
		this.altura = 120;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getAltura() {
		return this.altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public Float getPeso() {
		return this.peso;
	}
	
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public void SetDni(String dni) {
		this.dni = dni;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean getCarne() {
		return this.carne;
	}
	
	public void setCarne(boolean carne) {
		this.carne = carne;
	}
	
	public String getLugarNacimiento() {
		return this.lugarNacimiento;
	}
	
	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String toString() {
		return "Nombre " + nombre + " Altura " + altura + " Peso " + peso +
				" DNI " + dni + " Edad " + edad + 
				" Carne " + carne + 
				" Lugar nacimiento " + lugarNacimiento + " Sexo " + sexo;
	}
	
	public void calculaPeso() {
		String texto = "";
		double resultado = peso / Math.pow((float) altura/100, 2);
	
		
		if(resultado < 18.5) {
			texto = "Delgado";
		} else if (resultado < 25) {
			texto = "Normal";
		} else {
			texto = "Gordo";
		}
		
		System.out.println(texto);
	}
	
	public boolean comprobarMayorEdad() {
		boolean comprueba = false;
		if(edad>18) {
			comprueba = true;
		}
		return comprueba;
	}
	
	public boolean comprobarDNI() {
		boolean comprueba = false;
		
		char letras[]= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

		char letraDNI = dni.charAt(dni.length()-1);
		
		int numero = Integer.parseInt(dni.substring(0, dni.length()-1));
		
		char letraReal = letras[numero % 23];
		
		if(letraDNI == letraReal) {
			comprueba = true;
		}
		
		return comprueba;
	}
	
	public boolean compruebaCarne() {
		boolean comprueba = false;
		
		if(comprobarMayorEdad() && this.carne) {
			comprueba = true;
		}
		
		return comprueba;
	}
	
	
}
