package ejercicio33;

public class Prueba {
	
	public static void main (String[]args) {
		//PASO 1
		Semaforo semaforo = new Semaforo ();
		System.out.println(semaforo);
		
		//PASO 2
		semaforo.setColor("azul");
		System.out.println(semaforo);
		
		//PASO 3 
		semaforo.setColor (Semaforo.VERDE);
		System.out.println(semaforo);
		
		//PASO 4
		semaforo.setParpadeando(true);
		System.out.println(semaforo);
		
		//PASO 5 
		semaforo.setColor(Semaforo.AMBAR);
		System.out.println(semaforo);
		
		//PASO 6
		semaforo.setParpadeando(true);
		System.out.println(semaforo);
		
		//PASO 7
		for (int i = 0; i < 5; i++) {
			semaforo.cambiarEstado();
		}
		System.out.println(semaforo);
		
		//PASO 8
		Semaforo copia = new Semaforo ();
		copia.setColor((semaforo.getColor());
		 
		
	}

}
