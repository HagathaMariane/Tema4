package ejercicio41;

import java.util.Objects;

public class Jugador {
    
	        //Atributos privadosNombre String y  Dorsal Integer.
		    private String nombre;
		    private Integer dorsal;
		    
		    //Atributos privados con métodos get y set:
		    public Jugador(String nombre, Integer dorsal){
		        this.nombre = nombre;
		        this.dorsal = dorsal;
		    }


			public String getNombre() {
				return nombre;
			}


			public void setNombre(String nombre) {
				this.nombre = nombre;
			}


			public Integer getDorsal() {
				return dorsal;
			}


			public void setDorsal(Integer dorsal) {
				this.dorsal = dorsal;
			}


			public int hashCode() {
				return Objects.hash(dorsal);
			}

            //Método equals() que compare los dorsales 
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Jugador other = (Jugador) obj;
				return Objects.equals(dorsal, other.dorsal);
			}
			// Método toString() para que imprima algo tal que: “9 – Blas” 
		        public String toString() {
					return nombre;  
	}

}