package P12Trabajadores;

public class StartP12 {

	public static void main(String[] args) {
		Trabajador[] trabajadores = new Trabajador[7];
		
		trabajadores[0] = new Trabajador("Rafael","Nadal",400000,10);	
		
		trabajadores[0].cumple();
		
		trabajadores[1] = new Trabajador("Fernando","Alonso",400000,2,Categoria.Socio,0);
		
		trabajadores[1].cumple();
		
		trabajadores[2] = new Trabajador("Matias","Prats",10000,45,Categoria.Arquitecto,5);
		
		trabajadores[2].cumple();
		
		trabajadores[3] = new Trabajador("Ignatius","Farray",10,45,Categoria.Junior,1);
		
		trabajadores[3].cumple();
		
		trabajadores[4] = new Trabajador("Pedro","Sanchez",90000,45,Categoria.Manager,2);
		
		trabajadores[5] = new Trabajador("Bill","Gates",9000000,65);
		
		trabajadores[5].cumple();

		trabajadores[6] = new Trabajador("Brad","Pitt",25000,30);
		
		trabajadores[1].noCumple();
		
		
		/////Ejecución de la práctica
		
		
		System.out.println("El gasto total es: " + gastoTotal(trabajadores));
		
		System.out.println("El sueldo neto medio es: " + sueldoNetoMedio(trabajadores));
		
		System.out.println("El numero medio de hijos es: " + numeroHijos(trabajadores));
		
		numeroTrabajadoresCategoria(trabajadores);
		
		System.out.println("El trabajador que mas cobra es: " + trabajadorMasCobra(trabajadores));
		
	}
	
	public static int gastoTotal(Trabajador[] trabajadores) {
		int total = 0;
		
		for(int i=0;i<trabajadores.length;i++) {
			total = total + trabajadores[i].sueldoBrutoMensual();
		}
		
		return total;
	}
	
	public static int sueldoNetoMedio(Trabajador[] trabajadores) {
		int total = 0;
		
		for(int i=0;i<trabajadores.length;i++) {
			total = total + trabajadores[i].getSueldoNeto();
		}
		
		total = total / trabajadores.length;
		return total;
	}
	
	public static float numeroHijos(Trabajador[] trabajadores) {
		float total = 0;
		for(int i=0;i<trabajadores.length;i++) {
			total += trabajadores[i].getNumeroHijos();
		}
		
		total = total / trabajadores.length;
		return total;
	}
	
	public static void numeroTrabajadoresCategoria(Trabajador[] trabajadores) {
		for(Categoria categoria:Categoria.values()) {
			int contador = 0;
			
			for(int j=0;j<trabajadores.length;j++) {
				if(categoria==trabajadores[j].getCategoria())
					contador++;
			}
			
			System.out.println("Hay " + contador + " empleados de la categoria " + categoria);
			
		}
	}
	
	public static String trabajadorMasCobra(Trabajador[] trabajadores) {
		String nombre = "";
		int max = 0;
		
		for(int i=0;i<trabajadores.length;i++) {
			if(max<trabajadores[i].getSueldoNeto()) {
				max = trabajadores[i].getSueldoNeto();
				nombre = trabajadores[i].getNombre() + " " + trabajadores[i].getApellidos();
			}
		}
		
		return nombre;
	}

}
