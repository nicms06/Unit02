/*
 * Pedir diez números por teclado y mostrar la media.
 */

package buclefor;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		int sum = 0;
		double mean;
		
		//Ask the user for 10 numbers
		for (int i = 1; i <= 10; i++) {
			System.out.print("Number " + i + ": ");
			num = sc.nextInt();
			sum += num;
		}
		
		//Calculate the mean
		mean = (double)sum / 10;
		
		//Show the mean
		System.out.println("Mean = " + mean);
		
		//Close the Scanner
		sc.close();
		
	}

}
