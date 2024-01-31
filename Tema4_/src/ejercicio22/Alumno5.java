package ejercicio22;

public class Alumno5  extends Curso {
	
	private String dni;
	private Double nota;
	private Curso curso;
	
	public Alumno5(String dni, Double nota, Curso curso) {
		super();
	}
	//Estoy contruindo un contructor sin parametro.
	public Alumno5() {
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
	public Curso getCurso() {
		//Devuelve el valor 
		return curso;
	}

	public void setCurso(Curso curso) {
		//Defini los objetos
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return "Alumno5 [dni=" + dni + ", nota=" + nota + ", curso=" + curso + "]";
	}
}