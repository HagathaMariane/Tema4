package ejercicio47;

import java.time.LocalDate;
import java.util.List;

public class Carrito {
	
	/*Nos han encargado que programemos unas clases para gestionar el Carrito de compra de una 
	tienda online. El carrito tendrá que guardar esta información:
	Estoy creando atributos:*/
	//Fecha de creación
	private LocalDate fecha_creación;
	//Fecha de última actualización
	private LocalDate fecha_ult_actual;
	//Lista de artículos
	private List<String>artículos;
	//artículos en la cesta
	private Integer cantidadArticulos;
	private Integer importeTotal;
	private Integer precioMedio;
	
	//Nos piden que el carrito tenga estos métodos:
	//get() de todos los atributos
	protected LocalDate getFecha_creación() {
		return fecha_creación;
	}
	protected void setFecha_creación(LocalDate fecha_creación) {
		this.fecha_creación = fecha_creación;
	}
	protected LocalDate getFecha_ult_actual() {
		return fecha_ult_actual;
	}
	protected void setFecha_ult_actual(LocalDate fecha_ult_actual) {
		this.fecha_ult_actual = fecha_ult_actual;
	}
	protected List<String> getArtículos() {
		return artículos;
	}
	protected void setArtículos(List<String> artículos) {
		this.artículos = artículos;
	}
	//Constructor único que recibirá un Cliente.
		private Cliente cliente;
		public void Cliente (Cliente clietne) {
		}
		protected void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
     // getCantidad() que devuelve la cantidad total de artículos en la cesta
		protected Integer getArticulosCestas() {
			return cantidadArticulos;
		}
		protected void setArticulosCestas(Integer articulosCestas) {
			this.cantidadArticulos = articulosCestas;
		}
     //getTotal() que devuelve el importe total que habría que pagar
		protected Integer getImporteTotal() {
			return importeTotal;
		}
		protected void setImporteTotal(Integer importeTotal) {
			this.importeTotal = importeTotal;
		}
	//getPrecioMedio() que devuelve el precio medio de la cesta (división del total entre la cantidad de artículos) 
		protected Integer getPrecioMedio() {
			return precioMedio;
		}
		protected void setPrecioMedio(Integer precioMedio) {
			this.precioMedio = precioMedio;
		}
	/*toString() que imprima datos de cliente, cantidad de artículos, suma del total a pagar y 
	fecha de última actualización en formato dd/MM/yyyy*/ 	

	// addArticulo() que recibe un artículo y lo añade a la lista 
		
	//borrarArticulo() que recibe un entero y borra el artículo que ocupa esa posición.
		
	//vaciarCesta() que elimina todo el contenido de la cesta. 	
}