package ejercicio23;

public class ProfesorNuevo  extends Profesor {
	
	private Integer edad;
	private String nombre;
	
	public ProfesorNuevo (String edad, String nombre) {
		super();
	}
	//Estoy contruindo un contructor sin parametro.
	public ProfesorNuevo() {
		super()	;
		}
	
	public Integer getEdad() {
		//Devuelve el valor 
		return edad;
	}
	public void setEdad(Integer edad) {
		//Defini los objetos
		this.edad = edad;
	}

	public String getNombre() {
		//Devuelve el valor 
		return nombre;
	}

	public void setNombre (String nombre) {
		//Defini los objetos
		this.nombre = nombre;
	}	
	
	@Override
	//He creado el método toString(). He ultilizado para imprimir al final el objeto que he creado (tanto el profesor como el profesorNuevo) 
	public String toString() {
		return "ProfesorNuevo [edad=" + edad + ", nombre=" + nombre + "]";
	}
}