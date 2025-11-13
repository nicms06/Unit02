/*
 * Realiza un programa que pida dos números enteros A y B. Luego visualiza los números que hay entre A y B. 
 * Si A es menor que B, entonces debe mostrar los números desde A hasta B. Si B es menor que A, 
 * entonces debe mostrar los números desde B hasta A.
 */

package buclefor;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables 
		int numA;
		int numB;
		int bigger = 0;
		int smaller = 0;
			
		//Ask the user for A and B
		System.out.println("Please, input A: ");
		numA = sc.nextInt();
		
		System.out.println("Please, input B: ");
		numB = sc.nextInt();
		
		if (numA > numB) {
			bigger = numA;
			smaller = numB;
		}
		else if (numB > numA) {
			bigger = numB;
			smaller = numA;
		}
		
		for (int i = smaller; i<= bigger; i++) {
			System.out.println(i);
		}
			
		//Close the Scanner
		sc.close();
		
	}

	
}
