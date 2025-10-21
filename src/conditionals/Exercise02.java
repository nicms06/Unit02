/*
 * Utiliza un operador ternario para calcular el valor absoluto 
 * de un número que se solicita al usuario por teclado.
 * 
 * Prueba 1:
 * Valor entrada: 0
 * Valor esperado: 0
 * Valor obtenido:0
 * 
 * Prueba 2:
 * Valor entrada: 5
 * Valor esperado: 5
 * Valor obtenido: 5
 * 
 * Prueba3:
 * Valor entrada: -5
 * Valor esperado: 5
 * Valor obtenido: 5
 */

package conditionals;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int absoluteValue;
		int num;
		
		//Ask the user for a number
		System.out.println("Please, input a number: ");
		num = sc.nextInt();
		
		//The absolute value is equal to the number if the number is  positive of -num if is negative
		absoluteValue = (num >= 0) ? num : -num;
		
		System.out.println("The absolute value of " + num + " is: " + absoluteValue);
		
		//Close the Scanner
		sc.close();
		
	}

}
