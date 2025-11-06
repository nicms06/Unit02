/*
 * Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará todos los números del 1 al n.
 */

package buclefor;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		
		//ask the user for a number
		System.out.println("Input a number: ");
		num = sc.nextInt();
		
		//For
		for (int i=1; i <= num; i++) {
			System.out.println(i);
		}
		
		//Close the Scanner
		sc.close();
		
	}

}
