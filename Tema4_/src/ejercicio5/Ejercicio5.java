package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Dame un numero");
		Integer numero = scanner.nextInt();
		
		System.out.println("Dame otro numero");
		Integer numero2 = scanner.nextInt();
		
		//Crea un método llamado sumar que reciba dos números enteros
		Integer suma = sumar(numero, numero2);
		System.out.println(suma);
		
		scanner.close();
	}
	public static Integer sumar(Integer numero, Integer numero2) {
		Integer suma = numero + numero2;
		//y que devuelva el resultado de la suma.
		return suma;
	}
}
	

