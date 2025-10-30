/*
 * Realiza un programa que muestre la tabla de multiplicar de un número introducido por teclado. 
 * Por ejemplo, si se introduce el número 3 se debe imprimir lo siguiente:
 * 3 x 1 = 3
 * 3 x 2 = 6
 * 3 x 3 = 9
 * 3 x 4 = 12
 * 3 x 5 = 15
 * 3 x 6 = 18
 * 3 x 7 = 21
 * 3 x 8 = 24
 * 3 x 9 = 27
 * 3 x 10 = 30
 */

package dowhile;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		int num1 = 0;
		
		//Ask the user for a number
		System.out.println("Please, input a number: ");
		num = sc.nextInt();
		
		//The loop
		do {
			num1++;
			System.out.println(num + " x " + num1 + " = " + num*num1);
		}
		while (num1 < 10);
		
		//close the Scanner
		sc.close();
		
	}

}
