package ejercicio43;

public class App{
	public static void main(String[] args) {
		
    //Crea 4 actores: 
	//Blas Blau de España nacido en 1983 
	Actor actor1 = new Actor();
	actor1.setNombre("Blas Blau");
	actor1.setAñoDeNacimiento("1983");
	actor1.setNacionalidad("España");
	
	//Laura Pozo de Italia nacida en 1981 
	Actor actor2 = new Actor();
	actor2.setNombre("Blas Blau");
	actor2.setAñoDeNacimiento("1983");
	actor2.setNacionalidad("España");
	
	//Marcel Cade de Suiza nacido en 2001 
	Actor actor3 = new Actor();
	actor3.setNombre("Blas Blau");
	actor3.setAñoDeNacimiento("1983");
	actor3.setNacionalidad("España");
	
	//Violeta Volo de Rusia nacida en 1999
	Actor actor4 = new Actor();
	actor4.setNombre("Blas Blau");
	actor4.setAñoDeNacimiento("1983");
	actor4.setNacionalidad("España");
	
	//Crea 2 guionistas:
	Guionista guionista = new Guionista();
	//Marco Smith de Reino Unido nacido en 1988 
	guionista.setNombre("Marco Smith");
	guionista.setAñoDeNacimiento("1988");
	guionista.setNacionalidad("Reino Unido");
	
	//Cheng Shu de China nacido en 1977
	Guionista guionista2 = new Guionista();
	guionista2.setNombre("Cheng Shu");
	guionista2.setAñoDeNacimiento("1977");
	guionista2.setNacionalidad("China");
}
}
