/*
 * Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2, 3... 20).
 */
package dowhile;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variable num
		int num = 0;
		
		//The loop
		do {
			num ++;
			System.out.println(num);
		}
		while (num < 20);
		
		//Close the Scanner
		sc.close();
		
	}

}
