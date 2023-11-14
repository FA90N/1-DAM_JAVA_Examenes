package Examen;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n= ValidarNum(sc,"Escribe un numero entre 40 y 60");
		Random ale=new Random();
		int rellena[]=new int[100];
		int cont=0;
		
		
		for (int i=0; i<rellena.length;i++) {
			
			rellena[i]=ale.nextInt((60-40)+1)+40;
			
			if (rellena[i]==n) 
			{
				cont++;
			}
			if (cont==3) {
				break;
			}
			
			System.out.print(rellena[i] + " ");
			
		}
		
		System.out.println(" ");
		
		int media=Mediaprimo(rellena);
		
		if(media==0) {
			System.out.println("No hay primo");
		}else {
			System.out.println("La media de los primos es " + media);
		}
		
		
		
	}
		
		
		
		
	public static int Mediaprimo(int array[])	{
		int suma=0;
		int cont=0;
		int contprimo=0;
		for (int i=0; i<array.length;i++) {
			
			for(int x=2;x<array[i];x++) 
			{
				
					if (array[i]%2==0) 
					{
						cont++;
						
						break;
					}
					
					if (cont>0) {
						cont=0;
					}else {
						suma=suma+array[i];
						contprimo++;
					}
				
			}
		}
		int result=suma/contprimo;
		
		
		return result;
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
		if(n>=40 && n<=60)
		bien=true;
		else
		bien=false;
		
		}catch(Exception e) {
			System.out.println("Error");
		}
		
		}while(!bien);
		return n;
	}
	
	
	
	

}
