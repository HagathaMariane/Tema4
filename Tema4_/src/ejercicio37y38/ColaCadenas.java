package ejercicio37y38;

import java.util.ArrayList;
import java.util.List;
   
    //Crea la clase ColaCadenas
public class ColaCadenas extends Estructura {
	
	public ColaCadenas() {
		super(); //Llamo al constructor del padre
	}
	
	public String sacarCadena() {
		if (datos.isEmpty()) {
			return null;
		} else {
			String resultado = datos.get(0);
			datos.remove(0);
			return resultado;
		}
	}
}