package ejercicio43;

public class Persona {
	
	//ESTO SON CONTANTES
	final static Integer SUELDO_ACTOR = 100000;
	final static Integer SUELDO_GUIONISTA = 50000;
	final static Integer SUELDO_DIRECTORE = 200000;
	
	//ESTA ES A CLASE PADRE.
	//Tanto actores como guionistas y directores se identifican por su nombre, año de nacimiento y 
    //nacionalidad. Cada una de estas clases tendrá que tener: 
	public String Nombre;
	public Integer AñoDeNacimiento;
	public String nacionalidad;
	//Métodos get() y set() de todos esos atributos.
	protected String getNombre() {
		return Nombre;
	}
	protected void setNombre(String nombre) {
		Nombre = nombre;
	}
	protected Integer getAñoDeNacimiento() {
		return AñoDeNacimiento;
	}
	protected void setAñoDeNacimiento(Integer añoDeNacimiento) {
		AñoDeNacimiento = añoDeNacimiento;
	}
	protected String getNacionalidad() {
		return nacionalidad;
	}
	protected void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	//Método getSueldo(), que es constante para cada tipo:
	protected static Integer getSueldoActor() {
		return SUELDO_ACTOR;
	}
	protected static Integer getSueldoGuionista() {
		return SUELDO_GUIONISTA;
	}
	protected static Integer getSueldoDirectore() {
		return SUELDO_DIRECTORE;
	}
}