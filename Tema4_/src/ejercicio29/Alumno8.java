package ejercicio29;

import ejercicio27.Curso;

public class Alumno8  extends Curso {
		
		private String dni;
		
		public Alumno8(String dni) {
			super();
		}
		//Estoy contruindo un contructor sin parametro.
		public Alumno8() {
			super()	;
			}
		
		public String getDni() {
			//Devuelve el valor 
			return dni;
		}
		public void setDni(String dni) {
			//Defini los objetos
			this.dni = dni;
		}

			@Override
		public String toString() {
			return "Alumno7 [dni=" + dni + "]";
		}
			//Crea un método validarDNI() en la clase Alumno que devuelva un Boolean indicando si el dni que tiene establecido el alumno es correcto o no. 
			public Boolean validarDni() {
				return (!dni.isBlank() && dni.length()==9 && dni != null);
		}
	}