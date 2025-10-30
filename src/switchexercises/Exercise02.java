/*
 * Idear un programa que solicite al usuario un número comprendido entre 1 y 7, 
 * correspondiente a un día de la semana. Se debe mostrar el nombre del día de la semana 
 * al que corresponde. Por ejemplo, el número 1 corresponde a “Lunes” y el 6 a “Sábado”.
 */

package switchexercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int day;
		
		//We ask the user for a number 
		System.out.print("Please input the day (1-7): ");
		day = sc.nextInt();
		
		switch (day) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miércoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("The number of the day must be between 1 and 7.");
			}
		
		
		//Close the Scanner
		sc.close();

	}

}
