/*
 * De forma similar a la actividad 3, realiza un programa que calcule el mínimo común múltiplo de dos números dados. 
 * En este caso, habrá que partir del máximo de los dos e ir incrementando hasta encontrar el primer número que sea 
 * múltiplo de los dos números.
 */

package bucles;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num1, num2, max, mcm;
				
		//Ask for num1 and num2
		System.out.println("Please, input num1: ");
		num1 = sc.nextInt();
				
		System.out.println("Please, input num2: ");
		num2 = sc.nextInt();
	
		//See the biggest
		 max = (num1 > num2) ? num1 : num2;
	     mcm = max;
				
		//loop to see the mcm
	    while (mcm % num1 != 0 || mcm % num2 != 0) {
	            mcm++;
	    }				
		//show the mcm
		System.out.println("The GCD is: " + mcm);
						
		//Close the Scanner
		sc.close();

	}

}
