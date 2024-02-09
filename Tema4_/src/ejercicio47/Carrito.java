package ejercicio47;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carrito {

	/*
	 * Nos han encargado que programemos unas clases para gestionar el Carrito de
	 * compra de una tienda online. El carrito tendrá que guardar esta información:
	 * Estoy creando atributos:
	 */
	// Fecha de creación
	private LocalDate fechaCreación;
	// Fecha de última actualización
	private LocalDate fechaModificación;
	//
	private Cliente cliente;
	// Lista de artículos
	private List<Articulo> articulos;

	// um construtor
	public Carrito(Cliente cliente) {
		this.cliente = cliente;
		this.fechaCreación = LocalDate.now();
		this.fechaModificación = LocalDate.now();
		this.articulos = new ArrayList<>();
	}

	protected LocalDate getFechaCreación() {
		return fechaCreación;
	}

	protected LocalDate getFechaModificación() {
		return fechaModificación;
	}

	protected Cliente getCliente() {
		return cliente;
	}

	protected List<Articulo> getArticulos() {
		return articulos;
	}

	Integer cantidad();

	public Integer getCantida() {
    	Integer cantidad = 0D;
    	for (Articulo articulo : articulos) {
    	cantidad = cantidad + articulo.getPrecio();	

	public Double getTotal() {
		Double total = 0D;
		for (Articulo articulo : articulos) {
			total = total + articulo.getPrecio();
		}
		return total;
	}
	public Double getMedio() {
		Double total = 0D;
		for (Articulo articulo : articulos) {
			medio = medio + articulos.getPrecio();
		}
	}
	
		}
	}
}
