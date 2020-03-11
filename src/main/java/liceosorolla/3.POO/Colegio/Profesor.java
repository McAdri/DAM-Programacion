package Colegio;

import java.util.Scanner;

public class Profesor extends Persona{

	private String asignatura;
	
	public Profesor(String nombre,String apellidos) {
		super(nombre,apellidos);
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	public String corregir() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca la nota de alumno: ");
		String calificacion = teclado.next();
		
		return calificacion;
	}
}
