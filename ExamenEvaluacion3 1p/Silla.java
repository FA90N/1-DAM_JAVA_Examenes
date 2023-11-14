package zEvaluacion3;

import java.io.Serializable;

public class Silla extends Producto implements Serializable{
	private double altura;
	
	public Silla(int codigo, double precio, double altura) {
		super(codigo, precio);
		this.altura = altura;
	}
	public Silla() {
		super();
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Silla [altura=" + altura + "]" + super.toString();
	}
	
}
