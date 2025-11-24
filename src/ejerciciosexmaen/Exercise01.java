/*
 * Escribe un programa que lea un número entero (lado) y a partir de él cree un cuadrado de asteriscos 
 * con ese tamaño. Los asteriscos sólo se verán en el borde del cuadrado, no en el interior:
 * Ejemplo para num = 5
 * 
 * 		*****
 * 		*   *
 * 		*   *
 * 		*   *
 * 		*****
 */

package ejerciciosexmaen;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int side;
		
		//Ask the user for the side
		System.out.print("Input the side: ");
		side = sc.nextInt();
		
		//Loop to create the square
		for (int i = 0; i<side; i++) {
			
			if (i == 0 || i == side -1) {
				for (int j = 0; j<side; j++) {
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
				for (int k = 0; k < side -2; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
			
		//Close the Scanner
		sc.close();
		
	}

}
