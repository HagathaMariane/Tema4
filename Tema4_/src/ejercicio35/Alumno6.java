package ejercicio35;

import java.util.Objects;

import ejercicio22.Curso;

/**
 * 
 */
public class Alumno6 {
	
	private String dni;
	private Double nota;
	private ejercicio35.Curso curso;
	private String nombre;
	private int edad;
	
	public Alumno6(String dni, Double nota, Curso curso, String nombre, int edad) {
		super();
	}
	//Estoy contruindo un contructor sin parametro.
	public Alumno6() {
		super()	;
		}
	
	public Alumno6(String dni2) {
		// TODO Auto-generated constructor stub
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

	public void setNota(Double nota2) {
		//Defini los objetos
		this.nota = nota2;
	}	
	public ejercicio35.Curso getCurso() {
		//Devuelve el valor 
		return curso;
	}

	public void setCurso(ejercicio35.Curso curso2) {
		//Defini los objetos
		this.curso = curso2;
	}
	public String getNombre() {
		//Devuelve el valor 
		return nombre;
	}

	public void setNombre(String nombre) {
		//Defini los objetos
		this.nombre = nombre;
	}
	public int getEdad() {
		//Devuelve el valor 
		return edad;
	}

	public void setEdad(int edad) {
		//Defini los objetos
		this.edad = edad;
	}
	//Crea método equals() en la clase Alumno para definir que un alumno será igual a otro si tienen el mismo DNI.
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno6 other = (Alumno6) obj;
		return Objects.equals(dni, other.dni);
	}
}