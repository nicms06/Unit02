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
			
		//Ask the user for A and B
		System.out.println("Please, input A: ");
		numA = sc.nextInt();
		
		System.out.println("Please, input B: ");
		numB = sc.nextInt();
		
		if (numA < numB) {
            System.out.println("Numbers between " + numA + " and " + numB + ":");
            for (int i = numA + 1; i < numB; i++) {
                System.out.print(i + " ");
            }
        } else if (numB < numA) {
            System.out.println("Numbers between " + numB + " and " + numA + ":");
            for (int i = numB + 1; i < numA; i++) {
                System.out.print(i + " ");
            }
		}
		
		else {
			System.out.println("Same number");
		}
			
		//Close the Scanner
		sc.close();
		
	}

	
}
