package Examen;

import java.util.Scanner;

public class util {

	public static int pideNumeroInt(Scanner sc,String instruccion)
	{
		int n=0;
		boolean fin =false;
		do
		{
			try {
				System.out.print(instruccion);
				String s = sc.nextLine();
				n = Integer.parseInt(s);
				fin=true;
			}
			catch(Exception e)
			{
				System.out.println("Numero incorrecto");
			}
		}while(!fin);
		return n;
	}
	
	
	
}
