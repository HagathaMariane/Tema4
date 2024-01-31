package ejercicio41;

import java.util.ArrayList;
import java.util.List;

public class Resultado {
	
	    //Atributos privados con métodos get y set: golesLocales Integer, golesVisitante Integer 
	    private Integer golesLocales;
	    private Integer golesVisitante ;
	    
		// Constructor por defecto que inicializa el resultado a 0 
	    public Resultado(String nombre){
	        this.nombre = nombre;
	        resultado = new ArrayList<>();
	    
		//Método equals que compare los dos atributos 
		//Método toString para que se imprima algo tal que así: 0 – 0 
		//Métodos: 
		//isVictoriaLocal() que devuelve Boolean si han ganado los locales 
		//isVictoriaVisitante() que devuelve Boolean si han ganado los visitantes 
		//isEmpate() que devuelve Boolean si ha sido empate 

}
