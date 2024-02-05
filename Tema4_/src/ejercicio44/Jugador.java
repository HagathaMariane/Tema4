package ejercicio44;

public class Jugador {
	private String nombre;
	private EquipoCombate equipo;
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected EquipoCombate getEquipo() {
		return equipo;
	}
	protected void setEquipo(EquipoCombate equipo) {
		this.equipo = equipo;
	}	
}