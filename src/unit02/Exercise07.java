/*
 * Dibuja un ordinograma que lee dos números y nos dice cuál es el mayor o si son iguales.
 */

package unit02;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare num1 and num2
		int num1;
		int num2;
		
		//We ask the user for num1 and num2
		System.out.println("Please input n1: ");
		num1 = sc.nextInt();
		
		System.out.println("Please input n2: ");
		num2 = sc.nextInt();
		
		//The logic of the exercise
		if (num1 > num2) {
			System.out.println(num1 + " is bigger");
		}
		else if(num2 > num1) {
			System.out.println(num2 + " is bigger");
		}
		else {
			System.out.println("It's the same number");
		}
		
		//Close the Scanner
		sc.close();

	}

}
