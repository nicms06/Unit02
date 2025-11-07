/*
 * Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
 */

package buclefor;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		int prime = 0;
		
		//Ask the user for a number
		System.out.println("Please, input a number: ");
		num = sc.nextInt();
		
		for (int i = 2; i< num; i++) {
			if(num%i ==0) {
				prime ++;
			}
		}
		
		if(prime == 0) {
			System.out.println(num + " is a prime number");
		}
		else {
			System.out.println(num + " is not a prime number");
		}
		
		//Close the Scanner
		sc.close();

	}

}
