package ejercicio23;

import java.util.Scanner;

public class Prueba {
	
	public static void main(String[] args) {                                      
		Scanner scanner = new Scanner (System.in);    
		                                                               
		//Usando sin parametros.                                                  
		ProfesorNuevo profesor = new ProfesorNuevo ();                                                  
		                                                                          
		System.out.println("Dime su edad ");         
		Integer edad = scanner.nextInt();   
		// Estoy registrando en un objeto de la clase que he acabado de crear PROFESORNUEVO.
		profesor.setEdad(edad);                                                       
		
		//He hecho este scanner porque no estaba recogendo el que el usuario ponia por teclado.
		scanner.nextLine();
		
		System.out.println("Dime su nombre ");                                      
		String nombre = scanner.nextLine();
		// Estoy registrando en un objeto de la clase que he acabado de crear PROFESORNUEVO.        
		profesor.setNombre(nombre);    
		
                                                 
		System.out.println("Edad: " + profesor.getEdad());                                                                          
		System.out.println("Nombre: " + profesor.getNombre()); 
		System.out.println(profesor);
		
		scanner.close();                                                       
	 } 
}                   