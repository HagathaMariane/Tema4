package ejercicio1;

public class Ejercicio1 {
	
	public static void main(String[]args) {
	//Crea un método llamado getMayusculas que reciba una cadena por parámetro	
    String palavraMayuscula = getMayusculas("Hola, soy Hagatha.     ");
    System.out.println(palavraMayuscula);
  }
	//Estoy pasando la palabra a letras Mayusculas
	public static String getMayusculas(String cadena) {
		//Cadena que será el resultado de quitar los espacios en blanco de los extremos de la primera
		return cadena.trim().toUpperCase();
	}
}
