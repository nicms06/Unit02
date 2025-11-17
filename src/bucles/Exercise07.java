/*
 * Escribe un programa que lea un número n e imprima una pirámide 
 * de números con n filas como en la siguiente figura:
 * 
 * 1
 * 121
 * 12321
 * 1234321
 */

package bucles;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		
		//Ask the user for the number
		System.out.println("Input a number: ");
		num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			for (int j =1; j <= i; j++) {
				System.out.print(j);
		
			}
			for (int k = i-1; k>=1;k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		//Close the Scanner
		sc.close();
		
	}

}
