/*
 * El DNI consta de un entero de 8 dígitos seguido de una letra 
 * que se obtiene a partir del número de la siguiente forma:
 * 		letra = número DNI módulo 23
 * Basándote en esta información, elige la letra a partir de la numeración de la siguiente tabla:
 * 
 * Prueba 1:
 * Valor entrada: 235235
 * Valor esperado: ERROR
 * Valor obtenido:ERROR
 * 
 * Prueba 2:
 * Valor entrada: 222222222
 * Valor esperado: ERROR
 * Valor obtenido: ERROR
 * 
 * Prueba3:
 * Valor entrada: 49161827
 * Valor esperado: V
 * Valor obtenido: V
 */

package conditionals;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		int letter;
		
		//Ask the user for the number of the DNI
		System.out.println("Please, input the number of tyhe DNI: ");
		num = sc.nextInt();
		
		//If the number has not 8 digits, error
		if(num < 10000000 || num >99999999) {
			System.out.println("Error");
		}
		else {
			
			//Calculate the letter
			letter = num%23;
			
			switch (letter) {
				case 0:
					System.out.println("T");
					break;
				case 1:
					System.out.println("R");
					break;
				case 2:
					System.out.println("W");
					break;
				case 3:
					System.out.println("A");
					break;
				case 4:
					System.out.println("G");
					break;
				case 5:
					System.out.println("M");
					break;
				case 6:
					System.out.println("Y");
					break;
				case 7:
					System.out.println("F");
					break;
				case 8:
					System.out.println("P");
					break;
				case 9:
					System.out.println("D");
					break;
				case 10:
					System.out.println("X");
					break;
				case 11:
					System.out.println("B");
					break;
				case 12:
					System.out.println("N");
					break;
				case 13:
					System.out.println("J");
					break;
				case 14:
					System.out.println("Z");
					break;
				case 15:
					System.out.println("S");
					break;
				case 16:
					System.out.println("Q");
					break;
				case 17:
					System.out.println("V");
					break;
				case 18:
					System.out.println("H");
					break;
				case 19:
					System.out.println("L");
					break;
				case 20:
					System.out.println("C");
					break;
				case 21:
					System.out.println("K");
					break;
				case 22:
					System.out.println("E");
					break;
			}
			
		}
		
		//close the Scanner
		sc.close();
		
	}

}
