package Examen;

import java.util.Comparator;

public class Comparador implements Comparator<Alumno>{

	@Override
	public int compare(Alumno o1, Alumno o2) {
		if(o1.getEdad()>o2.getEdad()) {
			return -1;
		}else if(o1.getEdad()<o2.getEdad()) {
			return 1;
		}else {
			return 0;
		}
	}

}
