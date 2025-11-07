/*
 * Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se denota 5! y es igual a 5x4x3x2x1 = 120.
 */

package buclefor;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		int factorial = 1;
		
		//Ask the user for a number
		System.out.println("Please, input a number: ");
		num = sc.nextInt();
		
		//Loop 
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		
		//Show the factorial
		System.out.println("The factorial of " + num + " is: " + factorial);
		
		//Close the Scanner
		sc.close();
		
	}

}
