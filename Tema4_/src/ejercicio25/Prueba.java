package ejercicio25;

import java.util.Scanner;

public class Prueba {
	
	public static void main(String[] args) {                                      
		Scanner scanner = new Scanner (System.in); 
		
		Curso curso = new Curso ();
		curso.setIndentificador(1L);
		curso.setDescripción ("DAM/DAW");
		
		//Crea un array de 3 Alumnos
		//Usando con parameters.
            Alumno6[] Alumnos = new Alumno6 [3];
            for (int i = 0; i < Alumnos.length; i++) {
        	System.out.println("Dime su DNI "); 
        	String dni = scanner.nextLine();
         	Alumno6 alumno = new Alumno6 (dni);
        	System.out.println("Dime su nombre ");                                      
    		String nombre = scanner.nextLine();	
    		alumno.setNombre(nombre);
    		System.out.println("Dime su edad ");                                      
    		int edad = scanner.nextInt();	
    		alumno.setEdad(edad);
    		System.out.println("Dime su nota ");                                      
    		Double nota = scanner.nextDouble();	
    		scanner.nextLine();
    		alumno.setNota(nota);
    		alumno.setCurso(curso); 
    		Alumnos[i] = alumno;
        }                                                                                                
		System.out.println(Alumnos);
		
		scanner.close();                                                       
	 } 
}    