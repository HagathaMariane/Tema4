package ejercicio21;

public class Alumno4 extends Persona {
	//Crea una clase llamada Alumno que tenga como atributos privados el dni, nombre, edad y nota.
	private String dni;
	private Double nota;
	
	//He creado los 4 construtores sin parametros.
	//public Alumno4() {
	//this.dni = "";
	//this.nota = 0D;
    //}
	//Cambia el constructor de la clase para que reciba un parámetro String que sea el dni del alumno
	//He creado los 4 construtores con 4 parametros.
	public Alumno4(String nombre, String dni, Integer edad, Double nota) {
		super();
	}
	//Estoy contruindo un contructor sin parametro.
	public Alumno4() {
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

	public Double getNota() {
		//Devuelve el valor 
		return nota;
	}

	public void setNota(Double nota) {
		//Defini los objetos
		this.nota = nota;
	}	
}
