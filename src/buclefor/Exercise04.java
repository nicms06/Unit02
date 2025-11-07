/*
 * Diseñar un programa que muestre la suma de los 10 primeros números impares.
 */

package buclefor;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int sum = 0;
		int num = 1;
		
		//Create a loop to show the result
		for (int i = 1; i <= 10; i++) {
			sum += num;
			num += 2;
		}
		
		System.out.println(sum);
		
		//Close the Scanner
		sc.close();
		
	}

}
