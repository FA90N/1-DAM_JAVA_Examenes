package Examen;

import java.util.Scanner;

public class Funciones {

	public static int ValidarNum(Scanner sc, String instrucciones) 
	{
		boolean bien=false;
		int n=0;
		do {
			
		try {
		System.out.println(instrucciones);
		String s=sc.nextLine();
		n=Integer.parseInt(s);
		bien=true;
		
		}catch(Exception e) {
			System.out.println("Error");
		}
		
		}while(!bien);
		return n;
	}

}
