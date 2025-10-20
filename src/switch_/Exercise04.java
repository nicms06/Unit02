/*
 * Escribe un algoritmo para sumar dos tiradas de un dado de seis caras que tiraría el usuario. 
 * El algoritmo pregunta al usuario cuánto ha sacado en la primera tirada y el usuario le dará 
 * esa información pero en formato cadena (“UNO”, “DOS” … “SEIS”).
 * Después el algoritmo volverá a preguntar al usuario cuánto ha sacado en la segunda tirada 
 * y el usuario también dará esa información en formato cadena.
 * Por último, el algoritmo mostrará por pantalla la suma de las dos tiradas en formato numérico.
 */

package switch_;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		String roll1;
		String roll2;
		int num1 = 0;
		int num2 = 0;
		int sum;
		
		//Ask the user for roll 1 
		System.out.print("Please input the number of the first roll: ");
		roll1 = sc.nextLine();
		
		//Transform the roll1 to numbers
		switch (roll1) {
			case "UNO":
				num1 = 1;
				break;
			case "DOS":
				num1 = 2;
				break;
			case "TRES":
				num1 = 3;
				break;
			case "CUATRO":
				num1 = 4;
				break;
			case "CINCO":
				num1 = 5;
				break;
			case "SEIS":
				num1 = 6;
				break;
			default:
				System.out.println("Incorrect");
				System.exit(0);
				}
				
		//Ask the user for roll 2
		System.out.println("Please input the number of the second roll: ");
		roll2 = sc.nextLine();
		
		//Transform the roll1 to numbers
		switch (roll2) {
		case "UNO":
			num2 = 1;
			break;
		case "DOS":
			num2 = 2;
			break;
		case "TRES":
			num2 = 3;
			break;
		case "CUATRO":
			num2 = 4;
			break;
		case "CINCO":
			num2 = 5;
			break;
		case "SEIS":
			num2 = 6;
			break;
		default:
			System.out.println("Incorrect");
			System.exit(0);
		}
		
		//Calculate the sum
		sum = num1 + num2;
		
		System.out.println("The sum is: " + sum);
		
		//Close the Scanner
		sc.close();

	}

}
