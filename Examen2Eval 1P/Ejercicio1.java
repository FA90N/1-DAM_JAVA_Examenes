package Examen;

import java.util.Random;

public class Ejercicio1 {
//MAIN
	public static void main(String[] args) {
		
		int [][] numero=new int[5][8];
		//Relleno Matriz
		rellena(numero);
		//Muestro el matriz
		muestra(numero);
		//devuelvo el array sumado
		int []array=devolver(numero);
		// muestro el array para verificar
		muestraarray(array);
		
		//Devuelvo el array 
		int []seisnum= delvo(numero);
		System.out.println(" ");
		for(int i=0;i<seisnum.length;i++) {
			if(i==0)
				System.out.print(seisnum[i]);
			else
				System.out.print(","+seisnum[i]);
			
		}
	}
	



//Rellena el arry que sea impar y divisble por 3
private static int[] delvo(int[][] numero) {
	
	int []array=new int[6];
	int i=0;
	for(int fil=0;fil<numero.length;fil++) {
		
		for(int col=0;col<numero[0].length;col++) {
			
			if(numero[fil][col]%2!=0 && numero[fil][col]%3==0) {
						if(i<6) {
						array[i]=numero[fil][col];
						i++;
						}
				}
			}
			
			}
		
	return array;
}


//Muestraarray

private static void muestraarray(int[] array) {
		
	for(int i=0;i<array.length;i++) {
		
		System.out.print(array[i] + " ");
	}
	
}


//Devolver suma columnas
private static int[] devolver(int[][] numero) {
	
	int[] array= new int [8];
	int suma=0;
	
	for(int col=0;col<numero[0].length;col++) {
		suma=0;
		for(int fil=0;fil<numero.length;fil++) {
			
			suma=suma+numero[fil][col];
			
		}
		if(suma>300) {
			System.out.println("La columna " + (col+1) + " es mayor de 300");
		}
		
		
		array[col]=suma;
		
	}
	return array;
}




//Muestra Matriz
private static void muestra(int[][] numero) {
	
		for(int fil=0;fil<numero.length;fil++) {
			
			for(int col=0;col<numero[0].length;col++) {
				
				System.out.print(numero[fil][col] + " ");
			}
			System.out.println(" ");
		}
	
	
	
}
//RELLENA MATRIZ
	private static void rellena(int[][] numero) {
		
		Random ale = new Random ();
		for(int fil=0;fil<numero.length;fil++) {
			
			for(int col=0;col<numero[0].length;col++) {
				numero[fil][col]=ale.nextInt(100)+1;
				
			}
			
		}
		
		
	}

}
