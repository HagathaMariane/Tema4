package ejercicio37;

import java.util.ArrayList;
import java.util.List;
   
    //Crea la clase ColaCadenas
public class ColaCadenas {
	
	//La lista deve se crear en el constructor.
	//Estoy creando una lista
	private  List<String> cola;
	
	public ColaCadenas () {
		cola = new ArrayList<>();
	}
	
	//Método:añadirCadena(): recibe una cadena y no devuelve nada. Se tendrá que añadir esa cadena a la cola de espera. 
	public void añadirCadena (String cadena) {
		cola.add(cadena);	
	}
	
	//Método: sacarCadena(): no recibe nada y devuelve una cadena. Tendrá que devolver la cadena que hace más tiempo que se añadió. 
    public String sacarCadena() {
    	if (cola.isEmpty()) {
    		return null;
    	}
    	String cadena = cola.get(0);
    	cola.remove(0);
    	return cadena;
    	}
    
    // getTamaño(): no recibe nada y devuelve un entero con todos los elementos que hay en la cola. 
    public Integer getTamaño() {
    	return cola.size();	
    }
    
    //toString(): debe imprimir el contenido de la cola
    public String toString () {
    	return cola.toString();
    }
}