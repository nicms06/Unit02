/*
 * Solicita al usuario un número n y dibuja un triángulo de base y altura n. 
 * Por ejemplo para n=4 debe dibujar lo siguiente:
 *    *
 *   * *
 *  * * *
 * * * * *

 */
package bucles;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		// Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		
		//Ask the user for num
		System.out.println("Input the value: ");
		num = sc.nextInt();
		
		for (int i= 1; i<=num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k<i ; k++) {
				System.out.print("*");
				if (k < i - 1) {
                    System.out.print(" ");
                }
			}
			
			System.out.println();
		}
		
		//Close the Scanner
		sc.close();
	}

}
