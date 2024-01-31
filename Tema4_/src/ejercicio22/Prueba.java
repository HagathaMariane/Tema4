package ejercicio22;

import java.util.Scanner;

public class Prueba {
	
	public static void main(String[] args) {                                      
		Scanner scanner = new Scanner (System.in);                                
		                                                                          
		//Usando sin parametros.                                                  
		Alumno5 alumno = new Alumno5 ();                                                  
		                                                                          
		System.out.println("Dime su DNI ");         
		String dni = scanner.nextLine();   
		// Estoy registrando en un objeto de la clase que he acabado de crear.
		alumno.setDni(dni);                                                       
		                                                                                                                               
		System.out.println("Dime su nota ");                                      
		Double nota = scanner.nextDouble();
		// Estoy registrando en un objeto de la clase que he acabado de crear.        
		alumno.setNota(nota);    
		
		
		System.out.println("Dime la descripción del  Curso ");                                      
		String Descripción = scanner.nextLine();	
		scanner.nextLine();

		System.out.println("Dime el identificador del  Curso ");                                      
		Integer Indentificador = scanner.nextInt();
	
		Curso curso = new Curso();
		curso.setDescripción(Descripción);
		curso.setIndentificador(Indentificador);
		
		
		// Estoy registrando en un objeto de la clase que he acabado de crear.        
		alumno.setCurso(curso);    
		                                                                                                
		System.out.println("DNI: " + alumno.getDni());                                                                          
		System.out.println("Nota: " + alumno.getNota()); 
		System.out.println("Curso: " + curso.getDescripción()); 
		System.out.println("Curso: " + curso.getIndentificador()); 
		System.out.println("Curso: " + alumno.getCurso()); 
		
		System.out.println("*********");
		System.out.println(alumno);
		
		scanner.close();                                                       
	 } 
}                   