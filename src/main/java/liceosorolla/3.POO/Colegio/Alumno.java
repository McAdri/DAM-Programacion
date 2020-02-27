package Colegio;

import java.util.Scanner;

public class Alumno extends Persona{

	private String curso;
	private int nota;
	
	public Alumno(String nombre,String apellidos) {
		super(nombre,apellidos);
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public void califica() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca la nota de " + getNombre() + " " + getApellidos() + ": ");
		String calificacion = teclado.next();
		
		switch (calificacion) {
		case "S":
				this.nota = 4;
			break;
			case "A":
				this.nota = 5;
			break;
			case "B":
				this.nota = 6;
			break;
			case "N":
				this.nota = 8;
			break;
			case "SB":
				this.nota = 10;
			break;
			default:
				this.nota = 0;
			break;
		}
	}
}
