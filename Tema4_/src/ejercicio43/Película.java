package ejercicio43;

import java.util.ArrayList;
import java.util.List;

public class Película {
	
    //Atributos AñoDeEstreno, Título, ListaDeActores, SuGuionista y Director.
	
	    public Integer AñoDeEstreno;
	    public String título;
	    public List <Actor> actores;
	    public Guionista guionista;
	    public Director director;
	    
	    //Estoy creando la lista
	    public Película()  {
	    	actores = new ArrayList <>();
	    }
	    
	     // (tendremos que tener métodos get() y set() para ellos):
		protected Integer getAñoDeEstreno() {
			return AñoDeEstreno;
		}
		protected void setAñoDeEstreno(Integer añoDeEstreno) {
			AñoDeEstreno = añoDeEstreno;
		}
		protected String getTítulo() {
			return título;
		}
		protected void setTítulo(String título) {
			this.título = título;
		}
		protected List<Actor> getActores() {
			return actores;
		}
		protected void setActores(List<Actor> actores) {
			this.actores = actores;
		}
		protected Guionista getGuionista() {
			return guionista;
		}
		protected void setGuionista(Guionista guionista) {
			this.guionista = guionista;
		}
		protected Director getDirector() {
			return director;
		}
		protected void setDirector(Director director) {
			this.director = director;
		}
	} 