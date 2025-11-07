/*
 * Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que introducimos por teclado.
 */

package buclefor;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		
		//Ask for a number to the user
		System.out.println("Please, input a number: ");
		num = sc.nextInt();
		
		//The number must be bigger than 1
		while (num < 2) {
			System.out.println("The number must be bigger than 1, please try again: ");
			num = sc.nextInt();
		}
		
		//Create a loop (for)
		for (int i=1; i <= num; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		//Close the Scanner
		sc.close();
		
	}

}
