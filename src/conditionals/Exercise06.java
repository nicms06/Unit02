/*
 * Pedir al usuario el número de un mes y el año (comprobando si es o no bisiesto). 
 * Debe imprimir por pantalla el número de días que tiene el mes.
 * 
 * Prueba 1:
 * Valor entrada: año 2025, mes 2
 * Valor esperado: 28
 * Valor obtenido: 28
 * 
 * Prueba 2:
 * Valor entrada: año 2024, mes 2
 * Valor esperado: 29
 * Valor obtenido: 29
 * 
 * Prueba 3:
 * Valor entrada: año 2024, mes 5
 * Valor esperado: 31
 * Valor obtenido: 31
 * 
 * Prueba 4:
 * Valor entrada: año 2024, mes -3
 * Valor esperado: ERROR
 * Valor obtenido: ERROR
 */

package conditionals;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int year;
		int month;
		boolean leapYear;
				
		//We ask the user for a year
		System.out.println("Please, input a year: ");
		year = sc.nextInt();
		
		//We ask the user for a month
		System.out.println("Please input a month (1-12): ");
		month = sc.nextInt();
				
		//See if is a leap year
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			leapYear = true;
		}
		else {
			leapYear = false;
		}
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
			System.out.println("31 days");
			break;
		case 4:
		case 6:
		case 8:
		case 10:
		case 12:
			System.out.println("30 days");
			break;
		case 2:
			if(leapYear == true) {
				System.out.println("29 days");
			}
			else {
				System.out.println("28 days");
			}
			break;
		default:
			System.out.println("ERROR");
		}
		
		//Close the Scanner
		sc.close();

	}

}
