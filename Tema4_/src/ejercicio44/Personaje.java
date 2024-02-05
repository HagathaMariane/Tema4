package ejercicio44;

public abstract class Personaje {
	private String nombre;
	private String codigo;

	public abstract Integer getPuntosVida();
	public abstract Integer getDaño();
	public abstract Integer getDañoTiempo();
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getCodigo() {
		return codigo;
	}
	protected void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}