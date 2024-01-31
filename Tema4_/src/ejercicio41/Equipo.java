package ejercicio41;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import ejercicio30.Alumno;

public class Equipo {
	
	 //Atributos privados con métodos Nombre String, Capitan Jugador, Jugadores Lista de Jugador.
	 private String nombre;
	 private Jugador capitan ;
	 private List<Jugador> jugadores;
	 
		//Constructor que reciba por parámetro el atributo nombre. 
	    public Equipo(String nombre){
	        this.nombre = nombre;
	       jugadores = new ArrayList<>();
	    }
		//Método equals que compare los nombres. 
	        public int hashCode() {
		    return Objects.hash(nombre);
	    }
     	public boolean equals(Object obj) {
		    if (this == obj)
			return true;
		    if (obj == null)
			return false;
		    if (getClass() != obj.getClass())
			return false;
		    Equipo other = (Equipo) obj;
		    return Objects.equals(nombre, other.nombre);
	     }
		//Método toString para que se imprima algo tal que así: 
		public String toString() {
			return nombre
			+ "- Capitan:" + capitan.getNombre()
	        + "- Jugadores:" + jugadores;	
		}
}