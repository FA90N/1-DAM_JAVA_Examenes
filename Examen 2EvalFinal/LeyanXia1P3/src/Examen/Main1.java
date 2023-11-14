package Examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Alumno a = new Alumno();
		File f= new File("src/ficheroAlumnos");
		int num=Funcion.pideNumeroInt(sc, "Introduzca el num");
		generaAlumnos(a,num,f);
	}
	//Genero Alumnos Aleatorios
	private static void generaAlumnos(Alumno a, int num, File f) {
		Random r= new Random();
		ObjectOutputStream oos = null;
		int edad=0;
		
		try {
			oos= new ObjectOutputStream(new FileOutputStream(f,false));
			for (int i=0;i<num;i++) {
				edad=r.nextInt(21)+10;
				a=new Alumno("nom"+i,edad,"dire"+i);
				oos.writeObject(a);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
			
		
	}

}
