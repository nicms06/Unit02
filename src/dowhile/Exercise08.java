/*
 * Repetir el ejercicio de los dados del boletín de SWITCH. 
 * Mientras en la primera tirada no se introduzca un valor válido se le seguirá preguntando. 
 * Lo mismo con la segunda tirada.
 */
package dowhile;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		// Create a new Scanner
		Scanner sc = new Scanner(System.in);

		// Declare the variables
		String roll1;
		String roll2;
		int num1 = 0;
		int num2 = 0;
		int sum;

		// Ask the user for roll 1
		System.out.print("Please input the number of the first roll: ");
		roll1 = sc.nextLine().toUpperCase();
		
		while (!roll1.equals("ONE") && !roll1.equals("TWO") && !roll1.equals("THREE")
                && !roll1.equals("FOUR") && !roll1.equals("FIVE") && !roll1.equals("SIX")) {
			System.out.println("ERROR, try again: ");
			roll1 = sc.nextLine().toUpperCase();
		}

		// Transform the roll1 to numbers
		switch (roll1) {
		case "ONE":
			num1 = 1;
			break;
		case "TWO":
			num1 = 2;
			break;
		case "THREE":
			num1 = 3;
			break;
		case "FOUR":
			num1 = 4;
			break;
		case "FIVE":
			num1 = 5;
			break;
		case "SIX":
			num1 = 6;
			break;
		default:
			System.out.println("Incorrect");
			System.exit(0);
		}

		// Ask the user for roll 2
		System.out.println("Please input the number of the second roll: ");
		roll2 = sc.nextLine().toUpperCase();
		
		while (!roll2.equals("ONE") && !roll2.equals("TWO") && !roll2.equals("THREE")
                && !roll2.equals("FOUR") && !roll2.equals("FIVE") && !roll2.equals("SIX")) {
			System.out.println("ERROR, try again: ");
			roll1 = sc.nextLine().toUpperCase();
		}

		// Transform the roll1 to numbers
		switch (roll2) {
		case "ONE":
			num2 = 1;
			break;
		case "TWO":
			num2 = 2;
			break;
		case "THREE":
			num2 = 3;
			break;
		case "FOUR":
			num2 = 4;
			break;
		case "FIVE":
			num2 = 5;
			break;
		case "SIX":
			num2 = 6;
			break;
		default:
			System.out.println("Incorrect");
			System.exit(0);
		}

		// Calculate the sum
		sum = num1 + num2;

		System.out.println("The sum is: " + sum);

		// Close the Scanner
		sc.close();
	}

}
