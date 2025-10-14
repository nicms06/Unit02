/*
 * Dibuja el ordinograma de un programa que lee un número y me dice si 
 * es positivo o negativo, consideraremos el cero como positivo.
 */

package unit02;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare num1
		int num1;
		
		//We ask the user for num1
		System.out.println("Please, input num1: ");
		num1 = sc.nextInt();
		
		//The logic of the exercise
		if (num1 > 0) {
			System.out.println(num1 + " is positive");
		}
		else if (num1 < 0) {
			System.out.println(num1 + " is negative");
		}
		else {
			System.out.println("The number is 0");
		}
		
		//Close the Scanner
		sc.close();
		
	}

}
