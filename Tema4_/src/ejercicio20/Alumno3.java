package ejercicio20;

public class Alumno3 {
	
		//Crea una clase llamada Alumno que tenga como atributos privados el dni, nombre, edad y nota.
		private String nombre;
		private String dni;
		private Integer edad;
		private Double nota;
		
		//He creado los 4 construtores sin parametros.
		public Alumno3() {
		this.nombre = "";
		this.dni = "";
		this.edad = 0;
		this.nota = 0D;
	}
		//Cambia el constructor de la clase para que reciba un parámetro String que sea el dni del alumno
		//He creado los 4 construtores con 4 parametros.
		public Alumno3(String nombre, String dni, Integer edad, Double nota) {
			super();
			this.nombre = nombre;
			this.dni = dni;
			this.edad = edad;
			this.nota = nota;
		}

		public String getNombre() {
			//Devuelve el valor 
			return nombre;
		}

		//Obtengo el Nombre del alumno.
		public void setNombre(String nombre) {
			//Defini los objetos
			this.nombre = nombre;
		}

		public Integer getEdad() {
			//Devuelve el valor 
			return edad;
		}

		public void setEdad(Integer edad) {
			//Defini los objetos
			this.edad = edad;
		}

		public String getDni() {
			//Devuelve el valor 
			return dni;
		}
		public void setDni(String dni) {
			//Defini los objetos
			this.dni = dni;
		}

		public Double getNota() {
			//Devuelve el valor 
			return nota;
		}

		public void setNota(Double nota) {
			//Defini los objetos
			this.nota = nota;
		}	
		    
		//Estableca la nota en un 5
			public void Aprobar () {
				nota = 5.0;
		}
	}