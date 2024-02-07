package ejercicio45;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio45 {
		
	public static void main(String[] args) {
		
		boolean correcto=false;
		//now es el dia de hoy y la hora actual
	    LocalDate hoy = LocalDate.now();
	    LocalDate nacimiento;
	    Scanner scanner = new Scanner (System.in);
		
	//Crea un programa que solicite al usuario su fecha de nacimiento.
	//Si la fecha no es correcta, vuelve a solicitarla hasta que lo sea.
		do {
		System.out.println("Dime su fecha de nacimiento (dd/MM/yyyy): ");
          String fecha = scanner.nextLine();
          Integer dia = Integer.parseInt(fecha.split("/")[0]);
          Integer mes = Integer.parseInt(fecha.split("/")[1]);
          Integer anyo = Integer.parseInt(fecha.split("/")[2]);
          
          nacimiento = LocalDate.of(anyo, mes, dia);
          
          // 
          if (dia>=1 && dia <=31 && mes>=1 && mes<=12 && anyo<= hoy.getYear()) {
        	  correcto=true;
          }
          //Si la fecha no es correcta, vuelve a solicitarla hasta que lo sea. 
            else 
            	System.out.println("¿Fecha correcta?");
          }
		while(!correcto);
		
		//Dile si nació o no en un año bisiesto.
		System.out.println("¿Naciste en un año bisiento? " + nacimiento.isLeapYear());
		
		//Dile el día de la semana en el que nació. 
		System.out.println("Naciste un " + nacimiento.getDayOfWeek());
		
		//Dile cuántos años tiene. 
		Period periodo = nacimiento.until(hoy);
		System.out.println("Tienes " + periodo.getYears() + " años");
		
		//Dile, suponiendo que va a vivir exactamente 100 años, cuánto tiempo de vida le queda (días, meses y años) 
		LocalDate muerte = nacimiento.plusYears(100);
		periodo = hoy.until(muerte);
		System.out.println("Te quedan: "
				           + periodo.getYears() + "años "
				           + periodo.getMonths() + "meses "
				           + periodo.getDays() + "días ");
		
		//Dile, ya de regalo, que hora es ahora en formato hora/minuto/segundo con 24 horas. Por ejemplo: 17:23:55 
		LocalTime hora = LocalTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("Hora actual: " + formato.format(hora));
		
		scanner.close();    
    }	
}  