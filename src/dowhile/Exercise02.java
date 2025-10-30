/*
 * Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
 */

package dowhile;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);

		//Declare the variable num
		int num = 0;
		
		//The loop
		do {
			num ++;
			
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
		while (num < 200);
		
		//Close the Scanner
		sc.close();
	}

}
