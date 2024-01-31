package ejercicio33;

public class Semaforo {
	
	/*Tendrá dos atributos: color, de tipo String. Podrá ser Rojo, Ámbar o Verde. 
	ESTO SON CONSTANTES*/
	public static final String ROJO ="ROJO";
	public static final String VERDE ="VERDE";
	public static final String AMBAR ="ÁMBAR";
	
	/*Lo correcto es que 
	declares estos valores como constantes. */
	
	
	//Crea una clase Semafaro que tenga los atributos privados color de tipo String y parpadeando de tipo Boolean.
	private String color;
	private Boolean parpadeando;
	
	
	//Sólo tendrá el constructor por defecto, que tendrá que inicializar el color en Rojo sin parpadear (false). 
	public Semaforo() {
		this.color = ROJO;
		this.parpadeando = false;
	}
    //Crea los métodos get
	private String getColor() {
		return color;
	}

	public void setColor (String color) {
		if (color.equals(ROJO) || color.equals (AMBAR) || color.equals(VERDE));
		//Crea los métodos set
		this.color = color;
	}

    //Crea los métodos get
	private Boolean getParpadeando() {
		return parpadeando;
	}
	public void setParpadeando (Boolean parpadeando) {
		if (parpadeando && !color.equals(AMBAR) ) {
		 return;
		}
		//Crea los métodos set
		this.parpadeando = parpadeando;
	}
}