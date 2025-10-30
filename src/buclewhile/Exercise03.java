/*
 * Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir sumando. 
 * Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, 
 * antes de acabar, mostrará la media de los números positivos introducidos por el usuario.
 */

package buclewhile;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		int sum = 0;
		int accountant = 0;
		double mean;
		
		//Ask the user for a number
		System.out.println("Please, input a number: ");
		num = sc.nextInt();
		
		//Loop
		while (num >= 0) {
			accountant += 1;
			sum += num;
			
			System.out.println("Please, input a number: ");
			num = sc.nextInt();
		}
		
		if (accountant > 0) {
			//Calculate the media
			mean = (double) sum / accountant;
			
			//Show the results
			System.out.println("The mean is " + mean);
		}
		else {
			System.out.println("No positive numbers were entered.");
		}
		
		//Close the Scanner
		sc.close();
		
	}

}
