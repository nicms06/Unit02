/*
 * Dibuja el ordinograma de un programa que lee 2 números y muestra el mayor.
 */

package unit02;

import java.util.Scanner;

class Exercise04 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare num1 and num2
		double num1;
		double num2;
		
		//We ask the user for num1 and num2		
		System.out.println("Please input num1: ");
		num1 = sc.nextDouble();
		
		System.out.println("Please input num2: ");
		num2 = sc.nextDouble();
		
		//The logic of the exercise
		if (num1 > num2) {
			System.out.println(num1 + " is bigger");
		}
		else {
			System.out.println(num2 + " is bigger");
		}
		
		//Close the Scanner
		sc.close();

	}

}
