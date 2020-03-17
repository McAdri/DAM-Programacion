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
