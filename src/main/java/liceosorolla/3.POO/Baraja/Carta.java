package Baraja;

public class Carta implements Comparable<Carta>{

	private Palo palo;
	private Numero numero;
	private int id;
	
	public Carta(Palo palo,Numero numero) {
		this.palo = palo;
		this.numero = numero;
		id = palo.ordinal()*10 + numero.ordinal();
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public Numero getNumero() {
		return numero;
	}

	public void setNumero(Numero numero) {
		this.numero = numero;
	}
	
	public int getId() {
		return id;
	}
	
	public int valorCarta() {
		int valor = 0;
		
		switch (numero) {
		case As:
			valor = 13;
		break;
		case Tres:
			valor = 10;
		break;
		case Sota:
			valor = 2;
		break;
		case Caballo:
			valor = 3;
		break;
		case Rey:
			valor = 4;
		break;
		
		}
		
		
		return valor;
	}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", numero=" + numero + "]";
	}
	
	@Override     
	  public int compareTo(Carta carta) {          
	    return (this.id < carta.getId() ? -1 : 
	            (this.id == carta.getId() ? 0 : 1));     
	  }  
}
