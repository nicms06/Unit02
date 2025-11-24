/*
 * Escribe un programa que pida por teclado un número entero mayor o igual que 0 y determine 
 * cuántas de sus cifras son pares y cuántas son impares. Ejemplo: 
 * 
 * Si se introduce el número 78436 debe devolver: 
 * 3 números pares y 2 impares.
 */

package ejerciciosexmaen;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		int even = 0;
		int odd = 0;
		int digit;
		
		//Ask the user for num, must be bigger or equal to 0
		System.out.println("Input a number (>= 0)");
		num = sc.nextInt();
		
		while (num < 0) {
			System.out.println("ERROR. The number must be bigger or equal to 0");
			num = sc.nextInt();
		}
	
		
		//Separate the digits
		while (num > 0) {
			digit =num % 10;
			if (digit % 2 == 0) {
				even++;
			}
			else {
				odd++;
			}
			num = num / 10;
		}
		
		//Show the results 
		System.out.println("There are " + even + " even numbers and " + odd + " odd numbers");
		
		//Close the Scanner
		sc.close();
		
	}

}
