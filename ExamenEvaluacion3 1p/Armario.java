package zEvaluacion3;

import java.io.Serializable;

public class Armario extends Producto implements Serializable{
	private boolean doblealtura;
	private int puertas;
	
	public Armario(int codigo, double precio) {
		super(codigo, precio);
	}
	public Armario() {
		super();
	}
	public void establecePuertas(boolean doblealtura) {
		if(doblealtura)
			this.puertas=4;
		else
			this.puertas=2;
	}
	@Override
	public void subeprecio() {
		this.precio=this.precio*1.15;
	}
	@Override
	public String toString() {
		return "Armario [doblealtura=" + doblealtura + ", puertas=" + puertas + "]" + super.toString();
	}
	
	

}
