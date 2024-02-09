package ejercicio47;

public class Libro extends Articulo {

	// Y los libros tienen autor.
	private String autor;

	protected String getAutor() {
		return autor;
	}

	protected void setAutor(String autor) {
		this.autor = autor;
	}
}