package ejercicio20;

import java.util.Scanner;

public class App3 {

    public static void main(String[] args) {                                      
	Scanner scanner = new Scanner (System.in);                                
	                                                                          
	//Usando sin parametros.                                                  
	Alumno3 alumno = new Alumno3 ();  
	
	System.out.println("Dime su nombre ");                                    
	//Estoy dando valor al objeto                                             
	String nombre = scanner.nextLine();                                       
	// Estoy registrando en un objeto de la clase que he acabado de crear.        
	alumno.setNombre(nombre);                                                 
	                                                                          
	System.out.println("Dime su DNI ");         
	String dni = scanner.nextLine();   
	// Estoy registrando en un objeto de la clase que he acabado de crear.
	alumno.setDni(dni);                                                       
	                                                                          
	System.out.println("Dime su edad ");                                      
	Integer edad = scanner.nextInt();   
	// Estoy registrando en un objeto de la clase que he acabado de crear.        
	alumno.setEdad(edad);                                                     
	                                                                          
	System.out.println("Dime su nota ");                                      
	Double nota = scanner.nextDouble();
	// Estoy registrando en un objeto de la clase que he acabado de crear.        
	alumno.setNota(nota);     
	                                                                               
	System.out.println("Nombre: " + alumno.getNombre());                  
	System.out.println("DNI: " + alumno.getDni());                                        
	System.out.println("Edad: " + alumno.getEdad());                                      
	System.out.println("Nota: " + alumno.getNota()); 
	
	//Estoy recogendo un meto de la clase que establece la nota en un 5
	alumno.Aprobar ();
	System.out.println("Nueva NOTA:" + alumno.getNota());
	
	scanner.close();                                                       
 }                                                                             
}                                                                