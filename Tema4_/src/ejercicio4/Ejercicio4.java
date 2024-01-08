package ejercicio4;

import ejercicio1.Ejercicio1;
import ejercicio2.Ejercicio2;

public class Ejercicio4 {
	
	public static void main(String[] args) {
			//Crea un método llamado getMayMin que reciba una cadena por parámetro:
	    	//PUEDO HACER ASI TAMBIEN
			//System.out.println("  Pasar a Mayusculas (1):  ");
			System.out.println(getMayMin(1,"  SOy HaGaThA EN Mayusculas  "));
			//PUEDO HACER ASI TAMBIEN
			//System.out.println("  Pasar a Minusculas (2):  ");
			System.out.println(getMayMin(2,"  SOy HaGaThA EN Minusculas  "));
		}
		public static String getMayMin (int num,String cadena) {
			//Un número que podrá ser 1
			if (num == 1)
				//He quitando los espacios en blanco del principio y del final y he puesto la cadena en mayúsculas.
				cadena= Ejercicio1.getMayusculas(cadena);
			// Un número que podrá ser 2
			else if (num == 2) 
				//He quitando los espacios en blanco del principio y del final y he puesto la cadena en minúsculas.
				cadena= Ejercicio2.getMinusculas(cadena);
			
			return cadena;
	   }
	}
