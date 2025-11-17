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
		
		//Ask the user for a number
		System.out.println("Please, input a number: ");
		num = sc.nextInt();
		
		System.out.println(num);
		
		//Close the Scanner
		sc.close();
		
	}

}
