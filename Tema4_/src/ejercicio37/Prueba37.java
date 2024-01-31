package ejercicio37;

public class Prueba37 {
	public static void main (String [] args) {
		
		//1. Crea un objeto cola. 
		ColaCadenas cola = new ColaCadenas();
		System.out.println("1:" + cola);
		
		
		//2. Añade a la cola las palabras “primero” y “segundo” 
		cola.añadirCadena("primero");
		cola.añadirCadena("segundo");
		System.out.println("2:" + cola);
		
		//3. Saca de la cola un elemento e imprímelo. 
		String elemento = cola.sacarCadena();
		System.out.println("3:" + cola);
		System.out.println(cola);	
		
		//4. Añade a la cola la palabra “tercero” 
		cola.añadirCadena("tercero");
		System.out.println("4:" + cola);
		
		//5. Saca todos los elementos que queden en la cola e imprímelos. 
		while (cola.getTamaño() > 0 ) {
			elemento = cola.sacarCadena();
			System.out.println("5:" + cola);
		}
		
		//6. Añade a la cola la palabra cuarto.
		cola.añadirCadena("cuarto");
		System.out.println("6:"+cola);
	}

}