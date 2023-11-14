package Examen;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Funcion {
	//String[] dias = {"","Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
	//String[] meses = {"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio", "Agosto", "Septiembre","Octubre","Noviembre","Diciembre"};

	public static int pideNumeroInt(Scanner sc,String instruccion)
	{
		int n=0;
		boolean fin =false;
		do
		{
			try {
				System.out.print(instruccion+": ");
				String s = sc.nextLine();
				n = Integer.parseInt(s);
				fin=true;
			}
			catch(Exception e)
			{
				System.out.println("Número incorrecto");
			}
		}while(!fin);
		return n;
	}
	
	public static int pideNumeroIntRango(Scanner sc,String instruccion,int min, int max)
	{
		//le doy un valor fuera del rango
		int n=max+1;
		do
		{
			try {
				System.out.print(instruccion+": ");
				String s = sc.nextLine();
				n = Integer.parseInt(s);
			}
			catch(Exception e)
			{
				System.out.println("Número incorrecto");
			}
		}while(n<min || n>max);
		return n;
	}
	
	public static double pideNumeroDouble(Scanner sc,String instruccion)
	{
		double n=0;
		boolean fin =false;
		do
		{
			try {
				System.out.print(instruccion + ": ");
				String s = sc.nextLine();
				n = Double.parseDouble(s);
				fin=true;
			}
			catch(Exception e)
			{
				System.out.println("Número incorrecto");
			}
		}while(!fin);
		return n;
	}
	
	
	public static int factorial (int n)
	{
		int fact=1;
		for(int i=2;i<=n;i++)
		{
			fact = fact*i;
		}
		return fact;
	}
	
	public static boolean esPrimo(int n)
	{
		for(int i=n-1;i>1;i--)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static double redondeo (double n)
	{
		n=n*100;
		n=Math.round(n);
		n=n/100.00;
		return n;
	}
	
	
	public static void muestraArray(String[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			if(i<(array.length-1))
				System.out.print(array[i] + ", ");
			else
				System.out.print(array[i]);
		}
	}
	
	public static void muestraArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			if(i<(array.length-1))
				System.out.print(array[i] + ", ");
			else
				System.out.print(array[i]);
		}
		System.out.println();
	}
	
	public static boolean esta(int[] array,int n)
	{
		int cont=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==n)
				return true;
		}
		return false;
	}
	
	public static int busca(int[] array,int n)
	{
		int cont=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==n)
				cont++;
		}
		return cont;
	}
	public static void muestraLista(List<String> lista)
	{
		for(int i=0;i<lista.size();i++)
		{
			if(i==0)
				System.out.print(lista.get(i));
			else
				System.out.print(", " + lista.get(i));
		}
		System.out.println();
	}
	public static void muestraListaInt(List<Integer> lista)
	{
		for(int i=0;i<lista.size();i++)
		{
			if(i==0)
				System.out.print(lista.get(i));
			else
				System.out.print(", " + lista.get(i));
		}
		System.out.println();
	}
	
	public static void muestraMatriz(int[][] matriz)
	{
		for(int fil=0;fil<matriz.length;fil++)
		{
			for(int col=0;col<matriz[0].length;col++)
			{
				System.out.print(matriz[fil][col] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static LocalDate pideFecha(Scanner sc, String instruccion)
	{
		LocalDate fecha = null;
		do
		{
			System.out.print(instruccion + ": ");
			String s = sc.nextLine();
			try
			{
				//para admitir también dd-MM-yyyy
				s=s.replace("-","/");
				String[] v = s.split("/");
				fecha = LocalDate.of(Integer.parseInt(v[2]), Integer.parseInt(v[1]),Integer.parseInt(v[0]));
			}
			catch(Exception ex)
			{
				System.out.println("Fecha incorrecta");
			}
		}while(fecha==null);
		return fecha;
	}
	
	
	public static Date pideFechaDate(Scanner sc, String instruccion)
	{
		Date fecha = null;
		do
		{
			System.out.print(instruccion + ": ");
			String s = sc.nextLine();
			try
			{
				//para admitir también dd-MM-yyyy
				s=s.replace("-","/");
				fecha = convierte_String_a_Date(s);
			}
			catch(Exception ex)
			{
				System.out.println("Fecha incorrecta");
			}
		}while(fecha==null);
		return fecha;
	}
	
	public static String pideString(Scanner sc,String instruccion)
	{
		String s="";
		do
		{
			System.out.print(instruccion+": ");
			s = sc.nextLine();	
		}while(s.equals(""));
		return s;
	}

	public static String pideEmail(Scanner sc,String instruccion)
	{
		String dato="";
		do
		{
			System.out.print(instruccion+ ": ");
			dato=sc.nextLine();
			if(dato.equals("") || !dato.contains("@") || !dato.contains("."))
				System.out.println("Email incorrecto");
		}while(dato.equals("") || !dato.contains("@") || !dato.contains("."));
		return dato;
	}
	
	public static Date convierte_String_a_Date(String fecha)
	{
		try {
			fecha = fecha.replace("-","/");
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			sdf.setLenient(false);
			Date fechaDate = sdf.parse(fecha);
			return fechaDate;
		} 
		catch (Exception e) {
			return null;
		}

	}
	
	public static String convierte_Date_a_String(Date fecha)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String fechaString = sdf.format(fecha);
		return fechaString;
	}
	
	public static LocalDate convierte_Date_a_LocalDate(Date fecha)
	{
		LocalDate date = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return date;
	}
	
	public static Date convierte_LocalDate_a_Date(LocalDate fecha)
	{
		Date date = Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant());
		return date;
	}
}