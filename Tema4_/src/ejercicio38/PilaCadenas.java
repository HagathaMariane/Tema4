package ejercicio38;

import java.util.ArrayList;
import java.util.List;

//Crea la clase PilaCadenas
public class PilaCadenas {
	
	//La lista deve se crear en el constructor.
	//Estoy creando una lista
	private  List<String> pila;
	
	public PilaCadenas () {
		pila = new ArrayList<>();
	}
	//añadirCadena(): recibe una cadena y no devuelve nada. Se tendrá que añadir esa cadena a la pila de espera. 
	public void añadirCadena (String cadena) {
		pila.add(cadena);	
	}
	
	//sacarCadena(): no recibe nada y devuelve una cadena. Tendrá que devolver la palabra que hace menos tiempo que se añadió. 
	 public String sacarCadena() {
	    	if (pila.isEmpty()) {
	    		return null;
	    	}
	    	
	    	String cadena = pila.get(pila.size()-1);
	    	pila.remove (pila.size()-1);
	    	return cadena;
	    	}
	 
	//getTamaño(): no recibe nada y devuelve un entero con todos los elementos que hay en la pila. 
	 public Integer getTamaño() {
	    	return pila.size();	
	    }
	    
	 
	//toString(): debe imprimir el contenido de la pila.
	  //toString(): debe imprimir el contenido de la cola
	    public String toString () {
	    	return pila.toString();
	    }
}
