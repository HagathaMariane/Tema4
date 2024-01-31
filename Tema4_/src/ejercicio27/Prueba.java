package ejercicio27;

import java.util.Scanner;

import ejercicio25.Alumno6;
import ejercicio25.Curso;

public class Prueba {
	
	public static void main(String[] args) {                                      
		Scanner scanner = new Scanner (System.in);                                
		                                                                          
		//Usando sin parametros.                                                  
		Alumno7 alumno = new Alumno7 ();                                                  
		                                                                          
		Curso curso = new Curso ();
		curso.setIndentificador(1L);
		curso.setDescripción ("DAM/DAW");
		
		//Crea un array de 3 Alumnos
		//Usando con parameters.
            Alumno7[] Alumnos = new Alumno7 [3];
            for (int i = 0; i < Alumnos.length; i++) {
            	Alumno7 alumno7 = null;
            	Boolean dniCorrecto = false;
            	do {
        	System.out.println("Dime su DNI "); 
        	String dni = scanner.nextLine();
        	
        	alumno7 = new Alumno7 (dni);
        	
        	if (!alumno.validarDni( ) ) {
        		System.out.println("DNI no valido" );
        	}                                                                                               
        	else {
        		dniCorrecto = true;
        	
	}

	private static ejercicio27.Alumno7 Alumno(String dni) {
		// TODO Auto-generated method stub
		return null;
	}
}