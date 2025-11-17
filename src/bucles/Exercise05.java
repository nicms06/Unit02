/*
 * Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los 
 * números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su valor.
 */

package bucles;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		
		//Ask for a number between 0 and 20
		System.out.println("Input a number (0-20): ");
		num = sc.nextInt();
		
		while (num > 20 || num <0) {
			System.out.println("Error, try again: ");
			num = sc.nextInt();
		}
		
		for (int i = 1; i<=num; i++) {
			for (int j =1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		//Close the Scanner
		sc.close();
		
	}

}
