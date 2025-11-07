/*
 * Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
 */

package buclefor;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		double mark;
		int fail = 0;
		
		//Ask the user for 5 marks
		for (int i = 1; i <= 5; i++) {
			System.out.println("Mark " + i + ": ");
			mark = sc.nextDouble();
			
			//Calculate the number of fails
			if (mark < 5) {
				fail++;
			}
		}
		
		//Show the result
		if (fail > 0) {
			System.out.println("There are " + fail + " fails");
		}
		else {
			System.out.println("Everyone passed the exam");
		}
		
		//Close the Scanner
		sc.close();
		
	}

}
