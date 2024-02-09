package ejercicio47;

public class Ropa extends Articulo{
	
	//Pero la ropa además tiene talla y color.
	private String talla;
	private String color;
	
	protected String getTalla() {
		return talla;
	}
	protected void setTalla(String talla) {
		this.talla = talla;
	}
	protected String getColor() {
		return color;
	}
	protected void setColor(String color) {
		this.color = color;
	}
 
}