package Colegio;

import java.util.ArrayList;

public class StartColegio {

	public static void main(String[] args) {

		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		alumnos.add(new Alumno("Pepe","Porras"));		
		alumnos.add(new Alumno("Ned","Stark"));
		alumnos.add(new Alumno("Ragnar","Lodbruk"));
		
		for(int i=0;i<alumnos.size();i++) {
			alumnos.get(i).califica();
		}
		
		int total = 0;
		for(int i=0;i<alumnos.size();i++) {
			total += alumnos.get(i).getNota();
		}
		
		System.out.println("La media es " + total/alumnos.size());
	}
}
