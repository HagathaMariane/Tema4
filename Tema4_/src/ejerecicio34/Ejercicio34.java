package ejerecicio34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> cadenas = new ArrayList<>();

		// Crea un programa que solicite al usuario 5 cadenas  y añado en la lista
		//a (Hazlo con un bucle). = for
		for (int i = 0; i < 5; i++) {
			System.out.println(" Dame 1 cadena");
			String cadena = scanner.nextLine();
			cadenas.add(cadena);
		}
		System.out.println(cadenas);
		//Imprimo la lista usando el método toString().
		cadenas.toString();
		
		// Pon todas las cadenas de la lista en mayúsculas. Imprime la lista de nuevo. 
		for (int i = 0; i < 5; i++) {
			String mayusculas = cadenas.get(i);
			cadenas.set(i, mayusculas.toUpperCase());
		}
		//Imprimo la lista usando.
		System.out.println(cadenas);
		
		// Comprueba si la lista contiene alguna cadena vacía. En tal caso, escribe un mensaje por consola indicándolo. (No lo hagas con un bucle)
        if (cadenas.contains("")); {
        	System.out.println("Hay alguna cadena vacía en la lista");
        }
		//Borra todas las cadenas de la lista que tengan una longitud menor a 6 caracteres.
        Iterator<String> it = cadenas.iterator();
        while (it.hasNext()) {
             if (it.next().length()<6) {
            	it.remove(); 
           
            	 
        scanner.close();    	 
      }
        System.out.println(cadenas);
	}
  }
}