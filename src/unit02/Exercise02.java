/*
 * Dibuja un ordinograma de un programa que pide la edad por teclado y nos muestra el mensajede 
 * “eres mayor de edad” o el mensaje de “eres menor de edad”.
 */

package unit02;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
				
		//Declare variables age
		int age;		
				
		//We ask for an age
		System.out.println("Please input your age: ");
		age = sc.nextInt();
				
		//We apply the logic 
		if (age<18) {
			System.out.println("You are not of legal age");
		}
		else {
			System.out.println("You are of legal age");
		}
				
		//Close the Scanner
		sc.close();
	}

}
