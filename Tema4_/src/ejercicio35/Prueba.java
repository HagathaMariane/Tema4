package ejercicio35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prueba {
	
	public static void main(String[] args) {                                      
		Scanner scanner = new Scanner (System.in); 
		
		Curso curso = new Curso ();
		curso.setIndentificador(1L);
		curso.setDescripción ("DAM/DAW");
		
		//Crea un array de 3 Alumnos
		//Usando con parameters.
            //Alumno6[] Alumnos = new Alumno6 [3];
		    //Vuele a hacer el ejercicio 25 utilizando List en lugar de arrays. 
		    List<Alumno6> alumnos = new ArrayList<>();
		    
            for (int i = 0; i < 3; i++) {
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
    		alumnos.add(alumno);
        }                                                                                                
		System.out.println(alumnos);
		
		if (alumnos.get(0).equals(alumnos.get(1))
			|| alumnos.get(0).equals(alumnos.get(2)) 
			|| alumnos.get(1).equals(alumnos.get(2))) {
			System.out.println("Error: hay al menos 2 alumnos");
		
		}
		
		scanner.close();                                                       
	 } 
}    