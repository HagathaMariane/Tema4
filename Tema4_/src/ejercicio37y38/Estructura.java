package ejercicio37y38;

import java.util.ArrayList;
import java.util.List;

public abstract class Estructura {
		
		protected List<String> datos;
		
		public Estructura() {
			datos = new ArrayList<>();
		}
		public void añadirCadena(String cadena) { //Constructor para colaCadenas y pilaCadenas
			datos.add(cadena);
		}
		public Integer getTamaño() {
			return datos.size();
		}
		
		//Hay que añadirle el .toString() para poner usarlo
		@Override
		public String toString() {
			return datos.toString();
		}
		public  abstract String sacarCadena(); //Solo ponemos aquí el título y arriba ponemos que la clase es abstracta
	}