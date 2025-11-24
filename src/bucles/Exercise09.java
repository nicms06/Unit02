/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. 
 * El número introducido debe ser mayor que 0.
 */

package bucles;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		int aux;
		int digits = 0;

		//Ask the user for the number
		System.out.println("Input a number: ");
		num = sc.nextInt();
		
		if (num<=0) {
			System.out.println("The number must be greater than 0");
		}
		else {
			aux = num;
			while (aux > 0) {
				aux /= 10;
				digits++;
			}
		}
		
		System.out.println(num + " has " + digits + " digits");
		
		//Close the Scanner
		sc.close();
		
	}

}
