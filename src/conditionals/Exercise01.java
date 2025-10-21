/*
 * Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. 
 * La aplicación tendrá que indicar si el número introducido es capicúa. 
 * Un número es capicúa si se lee igual de izquierda a derecha que de derecha a izquierda.
 */

/*
 * Prueba 1:
 * Valor entrada: -1
 * Valor esperado: ERROR
 * Valor obtenido:ERROR
 * 
 * Prueba 2:
 * Valor entrada: 5
 * Valor esperado: is palindrome
 * Valor obtenido: is palindrome
 * 
 * Prueba3:
 * Valor entrada: 55
 * Valor esperado: is palindrome
 * Valor obtenido: is palindrome
 * 
 * Prueba 4:
 * Valor entrada: 45
 * Valor esperado: no palindrome
 * Valor obtenido: no palindrome
 * 
 * Prueba 5:
 * Valor entrada: 554
 * Valor esperado: no palindrome
 * Valor obtenido: no palindrome
 * 
 * Prueba 6:
 * Valor entrada: 555
 * Valor esperado: is palindrome
 * Valor obtenido: is palindrome
 * 
 * Prueba 7:
 * Valor entrada: 5445
 * Valor esperado: is palindrome
 * Valor obtenido: is palindrome
 * 
 * Prueba 8:
 * Valor entrada: 5678
 * Valor esperado: no palindrome
 * Valor obtenido: no palindrome
 * 
 * Prueba 9:
 * Valor entrada: 30000
 * Valor esperado: ERROR
 * Valor obtenido:ERROR
 */

package conditionals;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		int digit1, digit2, digit3, digit4;
		
		//Ask the user for a number
		System.out.println("Please, input a number (0-9999): ");
		num = sc.nextInt();
		
		//If the number is bigger than 9999 or smaller than 0, ERROR
		if (num > 9999 || num < 0) {
			System.out.println("Error");
		}
		//If the number is between 0 and 9, the number is always palindrome
		else if (num < 10) {
			System.out.println("The number is palindrome.");
		}
		//If the number is between 10 and 999 and the 1st and 3rd digits are the same number, the number is palindrome
		else if (num < 100) {
			digit1 = num / 10;
			digit2 = num%10;
			
			if(digit1 == digit2) {
				System.out.println("The number is palindrome.");
			}
			else {
				System.out.println("The number is not palindrome.");
			}
		}
		//If the number is between 1000 and 9999 and the 1st and 4th, and 2nd and 3rd digits and the same number, the number is palindrome
		else if (num < 1000) {
			digit1 = num / 100;
			digit3 = num % 10;
			
			if(digit1 == digit3) {
				System.out.println("The number is palindrome.");
			}
			else {
				System.out.println("The number is not palindrome.");
			}
		}
		else {
			digit1 = num / 1000;
			digit2 = (num/100)%10;
			digit3 = (num/10)%10;
			digit4 = num%10;
			
			if ((digit1 == digit4)&&(digit2 == digit3)) {
				System.out.println("The number is palindrome.");
			}
			else {
				System.out.println("The number is not palindrome.");
			}
		}
		
		//Close the Scanner
		sc.close();
		
	}

}
