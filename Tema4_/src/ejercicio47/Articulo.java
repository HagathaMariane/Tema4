package ejercicio47;

public class Articulo {

	// Los artículos los hay de dos tipos: Ropa y Libros. Todos tienen una
	// descripción y un precio.
	private String descripción;
	private Integer precio;

	protected String getDescripción() {
		return descripción;
	}

	protected void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	protected Integer getPrecio() {
		return precio;
	}

	protected void setPrecio(Integer precio) {
		this.precio = precio;
	}

}