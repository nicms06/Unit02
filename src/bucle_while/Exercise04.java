/*
 * Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser positivos, negativos o cero). 
 * Cuando acabe de insertar los números, el algoritmo debe mostrar la suma de los números positivos, la 
 * media de los números negativos y el número de ceros que ha introducido el usuario.
 */

package bucle_while;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		int sumPos = 0;
		int sumNeg = 0;
		int numberOfNeg = 0;
		double meanNeg;
		int numberOfZero = 0;
		int count = 0;
		
		//The loop
		while (count < 10) {
			
			//Ask the user for a number
			System.out.println("Please, input a number: ");
			num = sc.nextInt();
			
			if (num > 0) {
				sumPos += num;
			}
			else if (num <0) {
				sumNeg += num;
				numberOfNeg ++;
			}
			else {
				numberOfZero ++;
			}
			
			count ++;
		}
		
		//calculate the mean of the negative numbers
		meanNeg = (double) sumNeg / numberOfNeg;
		
		//Show the result
		System.out.println("Addition of the positive numbers: " + sumPos);
		System.out.println("Mean of the negative numbers: " + meanNeg);
		System.out.println("Number of zeros: " + numberOfZero);
		
		//Close the Scanner
		sc.close();
		
	}

}
