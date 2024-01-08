package ejercicio19;

import java.util.Scanner;

public class App2 {
	
	public static void main(String[] args) {                                      
		Scanner scanner = new Scanner (System.in);                                
		                                                                          
		//Usando sin parametros.                                                  
		Alumno2 alumno = new Alumno2 ();                                            
		                                                                          
		System.out.println("Dime su nombre ");                                    
		//Estoy dando valor al objeto                                             
		String nombre = scanner.nextLine();                                       
		// Estoy registrando en un objeto de la clase que acabas de crear.        
		alumno.setNombre(nombre);                                                 
		                                                                          
		System.out.println("Dime su DNI ");                                       
		String dni = scanner.nextLine();                                          
		alumno.setDni(dni);                                                       
		                                                                          
		System.out.println("Dime su edad ");                                      
		Integer edad = scanner.nextInt();                                         
		alumno.setEdad(edad);                                                     
		                                                                          
		System.out.println("Dime su nota ");                                      
		Double nota = scanner.nextDouble();                                       
		alumno.setNota(nota);     
		                                                                               
		System.out.println("Nombre: " + nombre);                  
		System.out.println("DNI: " + dni);                                        
		System.out.println("Edad: " + edad);                                      
		System.out.println("Nota: " + nota); 
		
		alumno.Aprobar ();
		System.out.println("Nueva NOTA:" + alumno.getNota());
		
		scanner.close();                                                       
    }                                                                             
}                                                                                 