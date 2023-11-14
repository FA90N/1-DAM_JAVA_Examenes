package Examen;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=menu(sc);
		boolean bien=false;
		
		do {
			if(n==1) {
				
				bien=true;
			}else {
				System.out.println("Elige primero la opcion 1");
				n=menu(sc);
			}
		}while(!bien);
		
		
		
		int num=ValidarNum(sc, "introduce mayor que 10");
		int array[]=new int[num];
		
		do {
			
			if(n==1) {
				
				array=rellenoArray(num);
		
			}else if(n==2) 
			{
			
				for (int i=0; i<array.length;i++) {
					if(i==0)
					System.out.print(array[i]);
					else 
					System.out.print("-" + array[i]);
					
				}
				System.out.println(" ");
			
				
			}else if (n==3) {
				
				for (int i=0;i<array.length;i++) {
					
					if(array[i]%2==0) {
						
					}else {
						array[i]=array[i]+10;
					}
					
					System.out.print(array[i] + " ");
				}
				System.out.println(" ");
				
			}else if(n==4) {
				int x= ValidarCorrect(sc,"Introduce entre 1 y 9");
				int cont=contador (x,array);
				System.out.println("Hay " + cont + " numeros divisible por " + x + " y menores de 30");
				
				
			
			}
			
			n=menu(sc);
			
		}while(!(n==5));
		System.out.println("Finalizado");
		
		

}
	
	public static int contador (int n, int array[]){
		
		int cont=0;
		for (int i=0; i<array.length;i++) {
			
			if(array[i]%n==0 && array[i]<30) 
			{
				cont++;
				System.out.println(array[i] +" Cumple");
			}
			
		}
		
		
		
		return cont;
	}
	
	
	
	
	
	public static int[]rellenoArray( int num){
		
		Random ale = new Random();
		int []array= new int[num];
		for(int i=0; i<array.length;i++) {

			array[i]=ale.nextInt(50)+1;
			
		}
	
		
		return array;
		
		
	}
	
	
	

	
	
	
	
	
	//menu
	public static int menu(Scanner sc ) {
		
		boolean bien= false;
		int n=0;
		do {
			
			try {
				System.out.println("1-Rellenar array");
				System.out.println("2-Mostrar array");
				System.out.println("3-Actualizar array");
				System.out.println("4-Multiplos");
				System.out.println("5-Salir");
				String s=sc.nextLine();
				n=Integer.parseInt(s);
				if (n==1 || n==2 || n==3 || n==4 || n==5) {
					bien=true;
				}else {
					System.out.println("Porfavor de 1-5");
				}
				
				
			}catch(Exception e) {
				System.out.println("error");
			}
	
		}while (!bien);
		
		
		
		return n;
	}
	
	public static int ValidarCorrect (Scanner sc, String instrucciones) 
	{
		boolean bien=false;
		int n=0;
		do {
			
		try {
		System.out.println(instrucciones);
		String s=sc.nextLine();
		n=Integer.parseInt(s);
		if (n>0 && n<10)
		bien=true;
		else
			bien=false;
		
		}catch(Exception e) {
			System.out.println("Error");
		}
		
		}while(!bien);
		return n;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int ValidarNum(Scanner sc, String instrucciones) 
	{
		boolean bien=false;
		int n=0;
		do {
			
		try {
		System.out.println(instrucciones);
		String s=sc.nextLine();
		n=Integer.parseInt(s);
		if (n>10)
		bien=true;
		
		}catch(Exception e) {
			System.out.println("Error");
		}
		
		}while(!bien);
		return n;
	}
	
	
	
	
	

}
