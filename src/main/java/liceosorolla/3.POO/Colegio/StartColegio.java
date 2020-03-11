package Colegio;

import java.util.ArrayList;

public class StartColegio {

	public static void main(String[] args) {

		Profesor profesor = new Profesor("Jose Luis","Zapatero");
		
		
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		alumnos.add(new Alumno("Pepe","Porras","2FP",false));		
		alumnos.add(new Alumno("Ned","Stark"));
		alumnos.add(new Alumno("Ragnar","Lodbruk","2FP",true));
		
		for(int i=0;i<alumnos.size();i++) {
			alumnos.get(i).califica(profesor.corregir());
		}
		
		int total = 0;
		int totalDinero = 0;
		for(int i=0;i<alumnos.size();i++) {
			total += alumnos.get(i).getNota();
			totalDinero += alumnos.get(i).getDinero();
		}
		
		System.out.println("La media es " + total/alumnos.size());
		System.out.println("Los ingresos son " + totalDinero);
		

		
	}
}
