/*
 * Escribe un programa que lea un número entero positivo. 
 * A continuación debe dibujar un hexágono regular cuyos lados midan el número introducido.
 */

package ejerciciosexmaen;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the the variables
		int base;
		
		//Ask the user for a base
		System.out.println("Please, input a number: ");
		base = sc.nextInt();
		
		//Draw
		for (int i= 0; i < base; i++) {
			
			for (int j = 0; j < base - 1 -i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < base + 2 * i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (int j = base - 2; j >= 0; j--) {
			
			for (int k = base - 1 - j; k >= 1; k-- ) {
				System.out.print(" ");
			}
			
			for (int l = 0; l < base + 2 * j; l++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//Close the Scanner
		sc.close();
		
	}

}
