package Ej4Fraccion;

public class Fraccion {

	private int numerador;
	private int denominador;
	
	public Fraccion(int numerador,int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public Fraccion() {
		this.numerador = 1;
		this.denominador = 1;
	}
	
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	public String toString() {
		return this.numerador + "/" + this.denominador;
	}
	
	public void invierte() {
		this.numerador = this.numerador * -1;
	}
	
	public void invierte2() {
		int aux = this.numerador;
		this.numerador = this.denominador;
		this.denominador = aux;
	}
	
	public void multiplica(int n) {
		this.numerador = this.numerador * n;
	}
	
	public void divide(int n) {
		this.denominador = this.denominador * n;
	}
	
	public void simplifica() {
		int i=2;
		
		while(i<=this.numerador) {
			if(this.numerador % i == 0 && this.denominador % i == 0) {
				this.numerador = this.numerador /i;
				this.denominador = this.denominador /i;
			}
			else {
				i++;
			}
		}
		
	}
	
	public Fraccion suma(Fraccion fraccion) {
		Fraccion fracc = new Fraccion();
		fracc.setDenominador(this.denominador * fraccion.getDenominador());
		fracc.setNumerador((this.numerador * fraccion.getDenominador()) 
				+ (fraccion.getNumerador() * this.denominador));
		return fracc;
	}
	
	public Fraccion resta(Fraccion fraccion) {
		Fraccion fracc = new Fraccion();
		fracc.setDenominador(this.denominador * fraccion.getDenominador());
		fracc.setNumerador((this.numerador * fraccion.getDenominador()) - (fraccion.getNumerador() * this.denominador));
		return fracc;
	}
	
	public Fraccion multiplica(Fraccion fraccion) {
		Fraccion fracc = new Fraccion();
		fracc.setDenominador(this.denominador * fraccion.getDenominador());
		fracc.setNumerador((this.numerador * fraccion.getNumerador()));
		return fracc;
	}
	
	public Fraccion divide(Fraccion fraccion) {
		Fraccion fracc = new Fraccion();
		fracc.setDenominador(this.denominador * fraccion.getNumerador());
		fracc.setNumerador((this.numerador * fraccion.getDenominador()));
		return fracc;
	}
}
