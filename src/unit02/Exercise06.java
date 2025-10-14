/*
 * Dibuja un ordinograma de un programa que lee dos números y los visualiza en orden ascendente.
 */

package unit02;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare num1 and num2
		int num1;
		int num2;
		
		//We ask the user for num1 and num2
		System.out.println("Please, input num1: ");
		num1 = sc.nextInt();
		System.out.println("Please, input num2: ");
		num2 = sc.nextInt();
		
		//The logic of the exercise
		if (num1 > num2) {
			System.out.println(num2 + " < " + num1);
		}
		else {
			System.out.println(num1 + " < " + num2);
		}
		
		//Close the Scanner
		sc.close();

	}

}
