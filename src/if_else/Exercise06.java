/*
 * Escribir un programa que pida al usuario tres números enteros, y que muestre por pantalla si la suma de dos de esos números da como resultado el otro número.
 */

package if_else;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare variables
		int num1;
		int num2;
		int num3;
		
		//Ask the user for num1, num2 and num3
		System.out.println("Please input num1: ");
		num1 = sc.nextInt();
		
		System.out.println("Please input num2: ");
		num2 = sc.nextInt();
		
		System.out.println("Please input num3: ");
		num3 = sc.nextInt();
		
		//The logic of the exercise
		if(((num1 + num2) == (num3))){
			System.out.println("The sum of " + num1 + " and " + num2 + " is " + num3);
		}
		else if ((num1 + num3) == (num2)) {
			System.out.println("The sum of " + num1 + " and " + num3 + " is " + num2);
		}
		else if ((num2 + num3) == (num1)) {
			System.out.println("The sum of " + num2 + " and " + num3 + " is " + num1);
		}
		else {
			System.out.println("The sum of any two of these numbers does not equal the other");
		}
		
		//Close the Scanner
		sc.close();

	}

}
