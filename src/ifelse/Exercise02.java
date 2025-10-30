/*
 * Implementar un programa que pida por teclado un número decimal e indique si es un número casi-cero, que son aquellos, positivos o negativos, 
 * que se acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 no se considera un número casi-cero. Es decir, un número casi-cero es el 
 * que se encuentra en el intervalo (-1, 1), donde se excluye el -1, el 0 y el 1.
 */

package ifelse;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variable num
		double num;
		
		//Ask the user for a number
		System.out.println("Please, input a number:");
		num = sc.nextDouble();
		
		//The logic of the exercise and print the result
		if (num < 1 && num > 0 || num > -1 && num < 0) {
			System.out.println(num + " is almost-zero");
		}
		else {
			System.out.println(num + " isn't almost-zero");
		}
		
		//Close the Scanner
		sc.close();

	}

}
