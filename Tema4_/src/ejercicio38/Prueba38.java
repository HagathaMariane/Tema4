package ejercicio38;


public class Prueba38 {
	
	public static void main (String [] args) {
	
	//7. Crea un objeto pila. 
	PilaCadenas pila = new PilaCadenas();
	System.out.println(pila);
	
	//8. Añade a la pila las palabras “primero” y “segundo” 
	pila.añadirCadena("primero");
	pila.añadirCadena("segundo");
	System.out.println(pila);
	
	//9. Saca de la pila un elemento e imprímelo.
	String elemento = pila.sacarCadena();
	System.out.println(elemento);
	System.out.println(pila);	
	
	//10. Añade a la pila la palabra “tercero” 
	pila.añadirCadena(elemento);
	System.out.println(pila);
	
	//11. Saca todos los elementos que queden en la pila e imprímelos. 
	while (pila.getTamaño() > 0 ) {
		elemento = pila.sacarCadena();
		System.out.println(pila);
	}
	
	//12. Añade a la pila la palabra cuarto. 
	pila.añadirCadena("cuarto");
	System.out.println(pila);
	}
}