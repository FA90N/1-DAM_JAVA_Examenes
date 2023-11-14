package Examen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		boolean bien=false;
		LocalDate fecha = LocalDate.of(2022, 03, 11);
		int anio=0;
		int mes=0;
		int dia=0;
		do {
			try {
			anio=Funciones.ValidarNum(sc,"Introduce anio");
			mes=Funciones.ValidarNum(sc,"Introduce mes");
			dia=Funciones.ValidarNum(sc,"Introduce dia");
			
			fecha=LocalDate.of(anio, mes, dia);
			bien=true;
			}catch(Exception e){
				System.out.println("Error");
			}
		}while(!bien);
		
		LocalDate[] fechas =fechas1(anio,mes,dia);
		String [] meses= 
		{"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	
		for (int i=0;i<fechas.length;i++) {
			System.out.println(fechas[i].getDayOfMonth() + " de " + meses[fechas[i].getMonthValue()] + " de " + fechas[i].getYear());
		}
		
}

	public static LocalDate [] fechas1 (int anio, int mes, int dia){
		

		
		LocalDate[]fecha=new LocalDate[12];
		LocalDate ld=LocalDate.now();
	
		LocalDate fecha1 = LocalDate.of(anio, mes, dia);
		
		fecha1=LocalDate.of(anio, mes, fecha1.lengthOfMonth());
	
		
		for(int i=0;i<fecha.length;i++) 
		{
			

				fecha[i]=fecha1.plusMonths(i+1);
			
		}
		
		return fecha;
			
	}
	


}
