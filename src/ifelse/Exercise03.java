/*
 * Pedir los coeficientes de una ecuación de segundo grado y mostrar sus soluciones reales. Si no existen, habrá que indicarlo. 
 */

package ifelse;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variable a, b and c
		int a;
		int b;
		int c;
		final double SQRT;
		double result;
		double result2;
		
		//We ask the user for a
		System.out.println("Please, input a: ");
		a = sc.nextInt();
		
		//We ask the user for b
		System.out.println("Please, input b: ");
		b = sc.nextInt();
		
		//We ask the user for 
		System.out.println("Please, input c: ");
		c = sc.nextInt();
		
		//The logic of the exercise and show the results
		if (a == 0) {
			//If a = 0 is a first grade equation
			result = (double)(-c)/b;
			
			//Print the result
			System.out.println("The result is: " + result);
		}
		else if (b == 0) {
			//if b = 0 the result is +-SQRT ((-c)/a) 
			result = (double) Math.sqrt((-c)/a); 
			result2 = - (double) (Math.sqrt((-c)/a));
			
			//Print the results
			System.out.println("The results are: " + result + " and " + result2);
		}
		else if (c == 0) {
			result = (double)(-b)/a;
			
			//Print the result
			System.out.println("The result is: " + result);
		}
		else {
			SQRT = (double) (b*b)-(4*a*c);
			
			if (SQRT < 0) {
				//If sqrt < 0 print error
				System.out.println("Error, the sqrt is negative");
			}
			else {
				//Calculate the second grate equation
				result = (double)(-b + Math.sqrt(SQRT)/(2*a));
				result2 = (double)(-b - Math.sqrt(SQRT)/(2*a));
				
				//Print the results
				System.out.println("The results are: " + result + " and " + result2);
			}
		}
		
		//Close the Scanner
		sc.close();

	}

}
