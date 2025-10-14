/*
 * Dibuja un ordinograma que lea una calificación numérica entre 0 y 10 y la
 * transforma en calificación alfabética, escribiendo el resultado:
 * De 0 a <3 Muy Deficiente.
 * De 3 a <5 Insuficiente.
 * De 5 a <7 Bien.
 * De 7 a <9 Notable
 * De 9 a 10 Sobresaliente
 */

package unit02;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare num
		int num;
		
		//We ask the user for a number
		System.out.println("Please input a number: ");
		num = sc.nextInt();
		
		//The logic of the exercise
		if (num < 0 || num >10) {
			System.out.println("ERROR. The number must be between 0 and 10");
		}
		else if(num >= 0 && num<3) {
			System.out.println("Muy deficiente");
		}
		else if(num >= 3 && num<5) {
			System.out.println("Deficiente");
		}
		else if(num >= 5 && num<7) {
			System.out.println("Bien");
		}
		else if(num >= 7 && num<9) {
			System.out.println("Notable");
		}
		else {
			System.out.println("Sobresaliente");
		}
		
		//Close the Scanner
		sc.close();

	}

}
