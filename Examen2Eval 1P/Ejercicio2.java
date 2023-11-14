package Examen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=util.pideNumeroInt(sc, "Dime un Numero: ");
		String [] palabra= new String[n];
		
		//Rellena
		rellena(sc,palabra);
		//Muestra
		muestraarray(palabra);
		System.out.println("");
		//buscar
		pideconsola(palabra,sc);
		//Buscar abcedario
		buscar(palabra,sc);
		

	}
//Buscar
private static void buscar(String[] palabra, Scanner sc) {
		
		System.out.print("Dime una letra: ");
		String letra=sc.next().toLowerCase();
		int cont=0;
		
		for(int i=0;i<palabra.length;i++) {
			
			if(esta(palabra[i],letra)) {
				System.out.println(palabra[i]);
				cont++;
			}
				
		}	
		if(cont==0) {
			System.out.println("No hay palabra con mas 1");
		}
		
}

//Pedir una letra y decir si hay alguna palabra que tenga mas de esos 2..
private static boolean esta(String string, String letra) {
	
	int cont=0;
	
	for (int i=0;i<string.length();i++) {
		if(string.substring(i,i+1).compareToIgnoreCase(letra)==0) {
			cont++;
		}
			
	}
	
	if(cont>1) {
		return true;
	}else
		return false;
}
//Buscar si esta en el array
private static void pideconsola(String[] palabra,Scanner sc) {
		
		System.out.print("Dime una palabra: ");
		String consola=sc.next();
		int cont=0;
		for(int i=0;i<palabra.length;i++) {
			
			if(palabra[i].compareToIgnoreCase(consola)==0) {
				cont++;
			}
	}
		if(cont>0) {
			System.out.println("Si que esta en el array");
		}else {
			System.out.println("No esta en el array");
		}
		
		
}
//Muestra palabra
	private static void muestraarray(String[] palabra) {
		
		
		for(int i=0;i<palabra.length;i++) {
			
			if(i==0)
				System.out.print(palabra[i]);
			else
				System.out.print(","+palabra[i]);
			
		}
		
	}
//Rellena array de cadenas
	private static void rellena(Scanner sc, String[] palabra) {
		
		String pal=" ";
		String vacio="";
		for(int i=0;i<palabra.length;i++) {
			
			System.out.print("Escribe una palabra: ");
			pal=sc.next();
			
			if(pal.equalsIgnoreCase(vacio)) {
				System.out.println("Error");
			}else {
				String nuevo="";
				for(int n=0;n<pal.length();n++) {
					if(n==0)
					nuevo=nuevo+pal.toUpperCase().charAt(n);
					else
						nuevo=nuevo+pal.toLowerCase().charAt(n);
				}
				
			palabra[i]=nuevo;
			}
			
			
		}
		

	}

}
