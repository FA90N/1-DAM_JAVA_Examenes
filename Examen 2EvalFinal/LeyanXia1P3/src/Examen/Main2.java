package Examen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		List <Alumno> a = new ArrayList <Alumno>();
		leerOrdenar(a);
		mostrar(a);
		aniadirAlumnos(a,sc);
		cumpleEdad(a,sc);
		borraDatos(a,sc);
		//leerOrdenar(a); Comprobacion mia, para ver si se ha guardado correctamente en el fichero
	}
	
	//Borrar alumno que coincida con la edad indicada, reescribirlo en el fichero y mostrar
	private static void borraDatos(List<Alumno> a, Scanner sc) {
		
		int edad=Funcion.pideNumeroInt(sc, "Indica la edad del alumno del que quieres borrar ");
		Iterator<Alumno> it = a.iterator();
		while(it.hasNext()){
			if(it.next().getEdad()==edad) {
				it.remove();
			}
		}
		reescribirlo(a);
		mostrar(a);
		
	}
	//Reescribirlo en el fichero
	private static void reescribirlo(List<Alumno> a) {
		ObjectOutputStream oos = null;
		try {
			oos=new ObjectOutputStream(new FileOutputStream("src/ficheroAlumnos",false));
			for (int i=0;i<a.size();i++) {
				oos.writeObject(a.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
	//Pedir edad y actualizar edad y mostrarlo.
	private static void cumpleEdad(List<Alumno> a, Scanner sc) {
		int edad=Funcion.pideNumeroInt(sc, "Indica una edad ");
		for (Alumno al:a) {
			if(al.getEdad()<edad) {
				al.aumentaEdad();
			}
		}
		mostrar(a);
		
	}
	//aniadir Alumno nuevo
	private static void aniadirAlumnos(List<Alumno> a, Scanner sc) {
		ObjectOutputStream oos=null;
		File f = new File("src/ficheroAlumnos");
		System.out.println("Añadir alumno nuevo> ");
		String nombre=Funcion.pideString(sc, "Indica su nombre");
		int edad=Funcion.pideNumeroInt(sc, "Indica su edad");
		String direccion= Funcion.pideString(sc, "Indica su direccion");
		Alumno al=new Alumno(nombre,edad,direccion);
		boolean siono=buscarenlista(a,al);
		if(siono) {
			System.out.println("Esta en la lista");
		}else {
			System.out.println("No esta en la lista");
		a.add(al);
		if(f.exists())
			try {
				oos = new ObjectOutputStreamPropia(new FileOutputStream(f,true));
				oos.writeObject(al);
			} catch (Exception e1) {
				e1.printStackTrace();
			} 
		else
			try {
				oos = new ObjectOutputStream(new FileOutputStream(f,true));
				oos.writeObject(al);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		mostrar(a);
	}
		
		
		
	//Buscar el alumno si esta en la lista o no
	private static boolean buscarenlista(List<Alumno> a, Alumno al) {
		for(int i=0;i<a.size();i++) {
			if(a.get(i).equals(al)) {
				return true;
			}
		}
		return false;
	}
	
	//Muestro el arry de la siguiente forma, con la edad ordenada descendemente;
	private static void mostrar(List<Alumno> a) {
		for (Alumno ar:a) {
			String nombre=ar.getNombre();
			int edad=ar.getEdad();
			String direccion=ar.getDireccion();
			System.out.println(nombre+" - "+edad+" - "+direccion);
		}
		
		
	}
	//Leo el fichero lo guardo en un array y ordeno el array por edad del alumno;
	private static void leerOrdenar(List<Alumno> a) {
		
		ObjectInputStream ois = null;
		Object aux = null;

		try {
			ois=new ObjectInputStream(new FileInputStream("src/ficheroAlumnos"));
			do
			{
				//if(aux!=null)
					//System.out.println(aux);
				aux = ois.readObject();
				a.add((Alumno) aux);
			}while (aux!=null);

		} catch (Exception e) {
			aux=null;
		
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
			}
		}
		Collections.sort(a,new Comparador());
		
		
	}

}
