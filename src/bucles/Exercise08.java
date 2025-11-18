/*
 * Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado. 
 * La introducción de números finaliza con la introducción de un 0. Al final se mostrará:
 * El total de números introducidos, excluido el 0.
 * El total de números fallados.
 */

package bucles;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		int aux = 0;
		int fails = 0;
		int numbers = 0;
		
		System.out.println("Input the first number: ");
		num = sc.nextInt();
		
		while (num != 0 || num>aux) {
			//Ask the user for a number
			System.out.println("Please, input a number: ");
			num = sc.nextInt();
			
			while (num<aux && num != 0) {
				System.out.println("ERROR, this number is smaller, try again");
				num = sc.nextInt();
				aux = num;
				fails ++;
			}
			
			//Save the number in another variable
			aux = num;
			
			numbers ++;
		}
		
		System.out.println("Entered numbers: " + (numbers));
		System.out.println("Fails: " + fails);

		//Close the Scanner
		sc.close();
		
	}

}
