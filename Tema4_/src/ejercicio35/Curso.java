package ejercicio35;

public class Curso {

		//Crea una clase Curso que tenga los atributos privados identificador y descripción.
		private long indentificador;
		private String descripción;
		
		public long getIndentificador() {
			//Devuelve el valor 
			return indentificador;
		}

		public void setIndentificador(long l) {
			//Defini los objetos
			this.indentificador = l;
		}
		public String getDescripción() {
			//Devuelve el valor 
			return descripción;
		}

		public void setDescripción(String descripción) {
			//Defini los objetos
			this.descripción = descripción;
		}

		@Override
		public String toString() {
			return "Curso [indentificador=" + indentificador + ", descripción=" + descripción + "]";
		}
	}