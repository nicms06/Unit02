/*
 * Diseñar una aplicación que solicite al usuario un número e indique si es par o impar.
 */

package if_else;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);

		//Declare the variable num
		int num;
		
		//Ask the user for a number
		System.out.println("Please, import a number: ");
		num = sc.nextInt();
		
		//The logic of the exercise and print if is even or odd
		if (num % 2 == 0) {
			System.out.println(num + " is Even");
		}
		else {
			System.out.println(num + " is Odd");
		}	
		
		//Close the Scanner
		sc.close();
	}

}
