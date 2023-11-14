package zEvaluacion3;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

import Temario.function;

public class Main1 {
/*Crea una clase que ejecutarás una vez para generar 20 productos y guardarlos en un fichero. 
Para saber qué producto añadir, calcúlalo aleatoriamente (por ejemplo, 1- mesa, 2- silla, 3-
armario). El código un número consecutivo del 1 al 20, sin repetir entre distintos productos. El 
resto de datos aleatorios. Para el color crea un array con colores y cógelo aleatoriamente de 
ahí. Los precios entre 1 y 100 euros. La altura de la silla entre 20 y 30 cm.
*/
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		//guardaFichero(sc);
		leerFichero(sc);

	}
	

	private static void leerFichero(Scanner sc) {
		String fichero=AAFunciones.Function.PideString(sc, "Introduzca la ruta del fichero: ");
		ObjectInputStream ois = null;
		Object aux = null;
		
		try {
			ois=new ObjectInputStream(new FileInputStream(fichero));
			do
			{
					aux = ois.readObject();
					System.out.println(aux);	
				
			}while (aux!=null);

			
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		} catch (Exception e) {
			aux=null;
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	
	}


	private static void guardaFichero(Scanner sc) {
		Producto p = new Producto();
		Random r= new Random();
		int n=0;
		int c=0;
		double precio=0;
		double altura=0;
		String fichero=AAFunciones.Function.PideString(sc, "Introduzca la ruta del fichero: ");
		ObjectOutputStream oos=null;
		String [] color= {"verde","azul","roja","naranja","amarillo"};
		try {
			oos= new ObjectOutputStream(new FileOutputStream(fichero));
			for(int i=0;i<20;i++) {
				n=r.nextInt(3)+1;
				precio=function.redondeo(r.nextDouble()*(100-1+0.1)+1);
				if(n==1) {
					c=r.nextInt(4);
					p=new Mesa(i,precio,color[c]);
					oos.writeObject(p);
					
				}else if(n==2){
					altura=r.nextInt(11)+20;
					p=new Silla(i,precio,altura);
					oos.writeObject(p);
					
				}else {
					p=new Armario(i,precio);
					oos.writeObject(p);
				}
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
