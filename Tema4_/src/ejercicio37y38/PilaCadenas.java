package ejercicio37y38;

import java.util.ArrayList;
import java.util.List;

//Crea la clase PilaCadenas
public class PilaCadenas extends Estructura{
	
	public PilaCadenas() {
		super(); //Llamo al constructor del padre
	}
 
	public String sacarCadena() {
		if (datos.isEmpty()) {
			return null;
		} else {
			int ultimo = datos.size()-1;
			String resultado = datos.get(ultimo);
			datos.remove(ultimo);
			return resultado;
		}
	}
}