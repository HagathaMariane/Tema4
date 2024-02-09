package ejercicio47;

public class Cliente {

	/*
	 * Nos han encargado que programemos unas clases para gestionar el Carrito de
	 * compra de una tienda online. El carrito tendrá que guardar esta información:
	 * Estoy creando atributos:
	 */

	// DNI
	private String dni;
	// Nombre
	private String nombre;

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
