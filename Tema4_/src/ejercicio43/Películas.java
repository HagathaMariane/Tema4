package ejercicio43;

public class Películas {
	
    //Atributos AñoDeEstreno, Título, ListaDeActores, SuGuionista y Director.
	
	    public Integer AñoDeEstreno ;
	    public String Título;
	    public String ListaDeActores ;
	    public Integer SuGuionista;
	    public String Director;
	    
	    // (tendremos que tener métodos get() y set() para ellos):
		protected Integer getAñoDeEstreno() {
			return AñoDeEstreno;
		}
		protected void setAñoDeEstreno(Integer añoDeEstreno) {
			AñoDeEstreno = añoDeEstreno;
		}
		protected String getTítulo() {
			return Título;
		}
		protected void setTítulo(String título) {
			Título = título;
		}
		protected String getListaDeActores() {
			return ListaDeActores;
		}
		protected void setListaDeActores(String listaDeActores) {
			ListaDeActores = listaDeActores;
		}
		protected Integer getSuGuionista() {
			return SuGuionista;
		}
		protected void setSuGuionista(Integer suGuionista) {
			SuGuionista = suGuionista;
		}
		protected String getDirector() {
			return Director;
		}
		protected void setDirector(String director) {
			Director = director;
		} 
}