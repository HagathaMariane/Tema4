package ejercicio3;

public class Ejercicio3 {
	
	public static void main(Integer[] args) {
		//Crea un método llamado getMayMin que reciba una cadena por parámetro:
		System.out.println(getMayMin(1,"  Hola Soy Hagatha  "));
		System.out.println(getMayMin(2," HolA SoY HagathA  "  ));
		System.out.println(getMayMin(3,"   HoLa SOy HaGaThA  "));
	}
	public static String getMayMin (int num,String cadena) {
		//Un número que podrá ser 1
		if (num == 1)
			//He quitando los espacios en blanco del principio y del final y he puesto la cadena en mayúsculas.
			cadena= cadena.trim().toLowerCase();
		// Un número que podrá ser 2
		else if (num == 2) 
			//He quitando los espacios en blanco del principio y del final y he puesto la cadena en minúsculas.
			cadena= cadena.trim().toUpperCase();
		
		return cadena;
   }
}


