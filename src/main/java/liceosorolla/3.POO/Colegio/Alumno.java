package Colegio;

public class Alumno extends Persona{

	private String curso;
	private int nota;
	private boolean extrasecolar;
	private int dinero;
	
	public Alumno(String nombre,String apellidos) {
		super(nombre,apellidos);
		this.extrasecolar = false;
		this.curso = "1FP";
		calcularPrecio();
	}
	
	public Alumno(String nombre,String apellidos,String curso,boolean extraescolar) {
		super(nombre,apellidos);
		this.curso = curso;
		this.extrasecolar = extraescolar;
		calcularPrecio();
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
	
	public boolean isExtrasecolar() {
		return extrasecolar;
	}

	public void setExtrasecolar(boolean extrasecolar) {
		this.extrasecolar = extrasecolar;
	}

	public int getDinero() {
		return dinero;
	}
	
	private void calcularPrecio() {
		if(this.curso.equals("1FP")) {
			dinero = 350;
		}else if(this.curso.equals("2FP")) {
			dinero = 500;
		}
		
		if(isExtrasecolar()) {
			dinero =(int) (dinero * 1.2);
		}
	}
	
	public void califica(String calificacion) {
		
		
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
