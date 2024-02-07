package ejercicio44;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EquipoCombate {
	
	private List<Personaje> tropa;
	private Integer totalPuntosVida;
	
	public EquipoCombate () {
		//Estoy creando la lista
		tropa = new ArrayList<>();
		totalPuntosVida = 0;
	
	}
	public void añadirPersonaje(Personaje personaje) {
	if (tropa.size()<5 && !tropa.contains(personaje)) {
		tropa.add(personaje);
		totalPuntosVida += personaje.getPuntosVida();
	}
	}
	protected List<Personaje> getTropa() {
		return tropa;
	}
	protected void setTropa(List<Personaje> tropa) {
		this.tropa = tropa;
	}
	protected Integer getTotalPuntosVida() {
		return totalPuntosVida;
	}
	protected void setTotalPuntosVida(Integer totalPuntosVida) {
		this.totalPuntosVida = totalPuntosVida;
	}
	@Override
	public int hashCode() {
		return Objects.hash(totalPuntosVida, tropa);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EquipoCombate other = (EquipoCombate) obj;
		return Objects.equals(totalPuntosVida, other.totalPuntosVida) && Objects.equals(tropa, other.tropa);
	}
	@Override
	public String toString() {
		return "EquipoCombate [tropa=" + tropa + ", totalPuntosVida=" + totalPuntosVida + "]";
	}
	
}
