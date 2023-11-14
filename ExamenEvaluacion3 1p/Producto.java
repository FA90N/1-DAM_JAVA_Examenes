package zEvaluacion3;

import java.io.Serializable;

public class Producto implements Serializable{
	//Atributo
	protected int codigo;
	protected double precio;
	//Constructor
	public Producto() {
		super();
	}
	public Producto(int codigo, double precio) {
		super();
		this.codigo = codigo;
		this.precio = precio;
	}
	//Getters and Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	//Clases
	public void subeprecio() {
		this.precio=precio*1.10;
	}
	public void subeprecio(double p) {
		this.precio=precio+p;
	}
	@Override
	public String toString() {
		return "[codigo=" + codigo + ", precio=" + precio + "]";
	}
	
	
}
