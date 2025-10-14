/*
 * Dibuja  un ordinograma que lee  dos  números,  calcula  y  muestra  el   valor 
 * de   su suma, resta, producto y división. (Ten en cuenta la división por cero ).
 */

package unit02;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables n1 and n2
		double num1;
		double num2;
		
		//Declare the variables add, sub, mult, div
		double add, sub, mult, div;
		
		//Ask the user for a value to n1 and n2
		System.out.println("Please input n1: ");
		num1 = sc.nextDouble();
		
		System.out.println("Please input n2: ");
		num2 = sc.nextDouble();
		
		//calculate
		add = num1 + num2;
		sub = num1 - num2;
		mult = num1 * num2;
		div = num1/num2;
		
		//Show the results
		System.out.println(num1 + " + " + num2 + " = " + add);
		System.out.println(num1 + " - " + num2 + " = " + sub);
		System.out.println(num1 + " * " + num2 + " = " + mult);
		
		if (num2 == 0) {
			System.out.println("Cannot divided by 0");
		}
		else {
			System.out.println(num1 + " % " + num2 + " = " + div );
		}
		
		//Close the Scanner
		sc.close();

	}

}
