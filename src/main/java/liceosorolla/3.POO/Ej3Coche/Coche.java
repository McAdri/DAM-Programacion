package Ej3Coche;

import java.util.Scanner;

public class Coche {

	private String marca;
	private String modelo;
	private int cv;
	private float revision;
	private int velocidad;
	private float kilometros;
	private boolean arrancado;
	
	public Coche(String marca, String modelo, int cv) {
		this.marca = marca;
		this.modelo = modelo;
		this.cv = cv;
		this.revision = 30000;
		this.velocidad = 0;
		this.kilometros = 0;
		this.arrancado = false;
	}
	
	public Coche(String marca, String modelo, int cv,float revision, float kilometros) {
		this.marca = marca;
		this.modelo = modelo;
		this.cv = cv;
		this.revision = revision;
		this.velocidad = 0;
		this.kilometros = kilometros;
		this.arrancado = false;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCv() {
		return cv;
	}
	public void setCv(int cv) {
		this.cv = cv;
	}
	public float getRevision() {
		return revision;
	}
	public void setRevision(float revision) {
		this.revision = revision;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public float getKilometros() {
		return kilometros;
	}
	public void setKilometros(float kilometros) {
		this.kilometros = kilometros;
	}
	
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", cv=" + cv + ", revision=" + revision + ", velocidad="
				+ velocidad + ", kilometros=" + kilometros + "]";
	}
	
	public void arranca() {
		if(arrancado) {
			System.out.println("Vas a romper el motor");
		}
		else {
			this.arrancado = true;
			System.out.println("Brummmmm");
		}
	}
	
	public void para() {
		if(!arrancado) {
			System.out.println("Antes debes arrancar el coche");
		}
		else {
			this.arrancado = false;
			System.out.println("Retire la tarjeta.");
		}
	}
	
	public void transformarVelocidad() {
		System.out.println("La velocidad son " + velocidad * 1000 / 3600 + " m/s");
	}
	
	public void proximaRevision() {
		System.out.println("La proxima revision será en " + revision + " kilometros.");
	}
	
	public void potencia() {
		System.out.println("El coche tiene " + cv * 0.7457 + " kW de potencia");
	}
	
	public void aumentaVelocidad() {
		if(arrancado) {
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("¿En cuantos km/h quieres aumentar la velocidad?");
			this.velocidad = this.velocidad + teclado.nextInt();
		}
		else {
			System.out.println("Antes debes arrancar el coche");
		}
	}
	
	public void disminuyeVelocidad() {
		if(arrancado && velocidad >0) {
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("¿En cuantos km/h quieres disminuir la velocidad?");
			this.velocidad = this.velocidad - teclado.nextInt();
		}
		else {
			System.out.println("Antes debes arrancar el coche o ir circulando");
		}
	}
	
	public void circula() {
		if(arrancado && velocidad >0) {
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("¿Cuanto tiempo has circulado?");
			int minutos = teclado.nextInt();
			this.kilometros = kilometros + (velocidad * minutos / 60);
			this.revision = revision - (velocidad * minutos / 60);
		}
		else {
			System.out.println("Antes debes arrancar el coche o ir circulando");
		}
	}
	
}
