package Parcial;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		boolean bien=false;
		int n=0;
		do {
			
			try {
			System.out.println("Introduce un numero");
			String s=sc.nextLine();
			n= Integer.parseInt(s);
			System.out.println("Tu numero es " + n);
			bien=true;
			
			}catch(Exception e)
			{
				System.out.println("Introduzca un numero");
			}
			
		}while(!bien);
		
		
		
		int num=0;
		int suma=0;
		int cont=0;
		int producto=1;
		Random r= new Random();
		for (int i=0;i<n*2;i++) 
		{
			num =r.nextInt((80-20)+1)+20;
			
			
			System.out.print(num +",");
			
			if (num%2==0) {
				suma=suma+num;
			}
			
			
			if(num%5==0){
				cont++;
				producto=producto*num;
			}
			
			
		}
		System.out.println();
		if(suma>0) {
			System.out.println("La suma de los numeros pares es " +suma);
		
		}else {
			System.out.println("No ha salido ningun numero par");
		}
		
		
		
		if(cont>=1) {
		System.out.println("Multiplos de 5 ha salido " + cont +" veces" + " Y el producto es " + producto);
		}else {
			System.out.println("No ha salido multiplo de 5");
		}
		
		
		
		
		
		
		
		

	}

}
