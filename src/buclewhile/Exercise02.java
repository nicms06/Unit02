/*
 * Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir contando. 
 * Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, 
 * antes de acabar, mostrará la cantidad de números positivos introducidos por el usuario.
 */

package buclewhile;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		//Create a new scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		int accountant = 0;
		
		//Ask the user for a number
		System.out.println("Please, input a number: ");
		num = sc.nextInt();
		
		//Create a loop
		while (num >= 0) {
			accountant += 1;
			
			System.out.println("Please, input a number: ");
			num = sc.nextInt();
			
			
		}
		
		System.out.println("You introduced " + accountant + " numbers");
		
		//Close the Scanner
		sc.close();
		
	}

}
