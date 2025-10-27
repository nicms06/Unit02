/*
 * Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir sumando. 
 * Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, 
 * antes de acabar, mostrará la suma de los números positivos introducidos por el usuario.
 */

package bucle_while;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		int sum = 0;
		
		//Ask the user for a number
		System.out.println("Please, input a number: ");
		num = sc.nextInt();
		
		//While the number is positive, do it again
		while (num >= 0) {
			sum += num;
			System.out.println("Please, input a number: ");
			num = sc.nextInt();
		}
		
		//Show the result
		System.out.println("The sum is " + sum);
		
		//Close the Scanner
		sc.close();
		
	}

}
