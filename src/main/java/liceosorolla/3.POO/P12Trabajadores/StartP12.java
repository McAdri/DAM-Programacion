package P12Trabajadores;

public class StartP12 {

	public static void main(String[] args) {
		Trabajador[] trabajadores = new Trabajador[7];
		
		trabajadores[0] = new Trabajador("Rafael","Nadal",400000,10);	
		
		trabajadores[0].cumple();
		
		trabajadores[1] = new Trabajador("Fernando","Alonso",400000,2,Categoria.Socio,0);
		
		trabajadores[1].cumple();
		
		trabajadores[2] = new Trabajador("Matias","Prats",10000,45,Categoria.Arquitecto,5);
		
		trabajadores[3] = new Trabajador("Ignatius","Farray",10,45,Categoria.Junior,1);
		
		trabajadores[3].cumple();
		
		trabajadores[4] = new Trabajador("Pedro","Sanchez",90000,45,Categoria.Manager,2);
		
		trabajadores[5] = new Trabajador("Bill","Gates",9000000,65);
		
		trabajadores[5].cumple();

		trabajadores[6] = new Trabajador("Brad","Pitt",25000,30);
		
		trabajadores[1].noCumple();
		
		
		/////Ejecución de la práctica
		
	}

}
