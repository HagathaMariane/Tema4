package ejercicio29;

import java.util.Scanner;

public class Prueba {
	
	public static void main(String[] args) {                                      
		Scanner scanner = new Scanner (System.in);                                
		                                                                          
		//Usando sin parametros.                                                  
		Alumno8 alumno = new Alumno8 ();                                                  
		                                                                          
		Curso curso = new Curso ();
		curso.setIndentificador(1L);
		curso.setDescripción ("DAM/DAW");
		
		//Crea un array de 3 Alumnos
		//Usando con parameters.
            Alumno8[] Alumnos = new Alumno8 [3];
            for (int i = 0; i < Alumnos.length; i++) {
            	Alumno8 alumno7 = null;
            	Boolean dniCorrecto = false;
            	do {
        	System.out.println("Dime su DNI "); 
        	String dni = scanner.nextLine();
        	alumno = new Alumno8 (dni);
        	if (!alumno.validarDni( ) ) {
        		System.out.println("DNI no valido" );
        	}                                                                                               
        	else {
        		dniCorrecto = true;
        	}
 
	     	scanner.close();                                                       
            }
      }
   }
}