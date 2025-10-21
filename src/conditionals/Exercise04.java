/*
 * Realiza el “juego de la suma”, que consiste en que aparezcan dos números aleatorios (comprendidos entre 1 y 99) 
 * y el usuario tiene que sumarlos. La aplicación le pedirá al usuario que introduzca el resultado de la suma. 
 * La aplicación le indicará si el resultado es correcto o no.
 * 
 * Prueba 1:
 * Valor entrada (8 + 72): 80
 * Valor esperado: Correcto
 * Valor obtenido: Correcto
 * 
 * Prueba 2:
 * Valor entrada (55 + 50): 30
 * Valor esperado: Incorrecto
 * Valor obtenido: Incorrecto
 */

package conditionals;

import java.util.Scanner;
import java.util.Random;

public class Exercise04 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		Random aleatorio = new Random();
		
		//Declare the variables
		int num1;
		int num2;
		int sum;
		int sumUser;
		
		//Show the 2 random numbers
		num1 = aleatorio.nextInt(99) + 1;
		num2 = aleatorio.nextInt(99) + 1;
		
		sum = num1 + num2;
		
		//Ask the user for the sum
		System.out.println(num1 + " + " + num2 + " = ");
		sumUser = sc.nextInt();
		
		//See the sum of the user is correct
		if(sumUser == sum) {
			System.out.println("Correct");
		}
		else {
			System.out.println("Wrong, the sum is: " + sum);
		}
		
		//Close the Scanner
		sc.close();
		
	}

}
