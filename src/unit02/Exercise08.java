/*
 * Dibuja un ordinograma que lea tres números distintos y nos diga cuál es el mayor.
 */

package unit02;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//declare 3 numbers
		int num1;
		int num2;
		int num3;
		
		//We ask the user for the numbers
		System.out.println("Please input n1: ");
		num1 = sc.nextInt();
		
		System.out.println("Please input n2: ");
		num2 = sc.nextInt();
		
		System.out.println("Please input n3: ");
		num3 = sc.nextInt();
		
		//The logic of the exercise
		if (num1 > num2 && num1 >num3) {
			System.out.println(num1 + " is the bigger");
		}
		else if (num2 > num1 && num2 >num3) {
			System.out.println(num2 + " is the bigger");
		}
		else if (num3 > num1 && num3 >num2) {
			System.out.println(num3 + " is the bigger");
		}
		
		//Close the Scanner
		sc.close();
		
	}

}
