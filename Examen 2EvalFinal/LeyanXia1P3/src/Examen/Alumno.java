package Examen;

import java.io.Serializable;

public class Alumno implements Serializable{
	//Atributos
	private String nombre;
	private int edad;
	private String direccion;
	//Constructor
	public Alumno(String nombre, int edad, String direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}
	public Alumno() {
		super();
	}
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//toString
	@Override
	public String toString() {
		return "[nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + "]";
	}
	
	//Metodos
	public void aumentaEdad() {
		this.edad++;
	}
	@Override
	public boolean equals(Object obj) {
		Alumno alu = (Alumno)obj;
		if(alu.getNombre().equals(this.nombre) && alu.getDireccion().equals(this.direccion) && (this.edad == alu.getEdad())) {
			return true;
		}
		return false;
	}

	
	
	
	
	
	
}
