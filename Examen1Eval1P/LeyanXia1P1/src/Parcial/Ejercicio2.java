package Parcial;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		boolean bien=false;
		int n1=0,n2=0;
		int suma=0;
		int fact=1;
		int x=1;
		int j=1;
		int v=1;
		int o=1;
		do {
			
			try {
			System.out.println("Introduce primer numero");
			String s=sc.nextLine();
			n1= Integer.parseInt(s);
			
			System.out.println("Introduce segundo numero");
			String s1=sc.nextLine();
			n2= Integer.parseInt(s1);
			System.out.println("El primero numero es " + n1 + " El segundo numero es " +n2);
			
			suma=n1+n2;
			
			if(suma>25) 
			{
				if (n1>n2) 
				{
					System.out.println("Divisores de " + n1);
					for(int i=1;i<=n1;i++) 
					{
						
						if(n1%i==0) {
							System.out.println(i);
						}
					}
					
					
				}else 
				{
					System.out.println("Divisores de " + n2);
					
					for(int i=1;i<=n2;i++) 
					{
						
						if(n2%i==0) 
						{
							System.out.println(i);
						}
					}
					
				}

			}else {
				
				System.out.println("No es mayor de 25");
				
				
				
				
				if(n1<n2) 
				{
				
						for(;n1<=n2;n1++) {
							
							fact=1;
							for(x=1;x<=n1;x++) {
								fact=fact*x;
								
							}
							System.out.println("Factorial de " + n1 + " es " + fact);
	
						}
	
					
					
				}else if(n1>n2)
				{
					
				for(;n2<=n1;n2++) {
					fact=1;
					for(o=1;o<=n2;o++) {
						fact=fact*o;
						
					}
					System.out.println("Factorial de " + n2 + " es " + fact);
				}
					
				}
				
				
				
			}
			
			
			
			bien=true;
			
			
			
			
			
			
			}catch(Exception e)
			{
				System.out.println("Introduzca un numero");
			}
			
		}while(!bien);
		
		
		
		
		

	}

}
