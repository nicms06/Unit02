/*
 * Escribir una aplicación que indique cuántas cifras tiene un número introducido por teclado, que está comprendido entre 0 y 99999.
 */

package ifelse;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare variables
		int num;
		
		//We ask the user for a number. the number must be bigger or equal to 0 and smaller or equal to 99999
		System.out.println("Please input a number between 0 and 99999: ");
		num = sc.nextInt();
		
		//If the number isn't between 0 and 99999 show error
		if (num < 0 || num > 99999) {
			System.out.println("ERROR. The number must be between 0 and 99999.");
		}
		else {
			
			//If the number is between 0 and 99999 show the results
			if (num >= 0 && num <= 9) {
				System.out.println("In the number " + num + " there is 1 digit.");
			}
			else if (num >= 10 && num <= 99) {
				System.out.println("In the number " + num + " there are 2 digits.");
			}
			else if (num >= 100 && num <= 999) {
				System.out.println("In the number " + num + " there are 3 digits.");
			}
			else if (num >= 1000 && num <= 9999) {
				System.out.println("In the number " + num + " there are 4 digits.");
			}
			else {
				System.out.println("In the number " + num + " there are 5 digits.");
			}
		}
		
		//Close the Scanner
		sc.close();
		
	}

}
