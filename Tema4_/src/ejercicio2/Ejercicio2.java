package ejercicio2;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		//Crea un método llamado getMinusculas que reciba una cadena por parámetro
		String palavraMinuscula= getMinusculas ("    Hola, soy Hagatha.     ");
		System.out.println(palavraMinuscula);
	}
	//Estoy pasando la palabra a letras Minusculas.	
	public static String getMinusculas (String cadena) {
		//Cadena que será el resultado de quitar los espacios en blanco de los extremos de la primera
		return cadena.trim().toLowerCase();
	}

}
