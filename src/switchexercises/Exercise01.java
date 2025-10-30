/*
 * Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: 
 * insuficiente (de 0 a 4), 
 * suficiente (5), bien (6), 
 * notable (7 y 8) y 
 * sobresaliente (9 y 10).
 */

package switchexercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int mark;
		
		//We ask the user for the mark
		System.out.print("Please, input your mark: ");
		mark = sc.nextInt();
		
		//The mark must be between 0 and 10
		if (mark < 0 || mark > 10) {
			System.out.println("The mark must be between 0 and 10.");
		}
		else {
			switch (mark) {
			case 0, 1, 2, 3, 4:
				System.out.println("Insufficient");
			break;
			case 5, 6:
				System.out.println("Sufficient");
			break;
			case 7, 8:
				System.out.println("Good");
			break;
			case 9, 10:
				System.out.println("Outstanding");
			break;
			}
		}
		
		//Close the Scanner
		sc.close();

	}

}
