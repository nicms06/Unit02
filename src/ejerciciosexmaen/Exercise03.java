/*
 * Escribe un programa que lea un número entero (lado del triángulo) y a partir de él cree 
 * un triángulo invertido de asteriscos con ese tamaño. Los asteriscos sólo se verán en el 
 * borde del triángulo, no en el interior. Por ejemplo, para el tamaño=5. Nótese que en la 
 * primera fila (la base) hay un espacio entre cada dos asteriscos:
 * 
 *  * * * * *
 *   *     *
 *    *   *
 *     * *
 *      * 
 */	

package ejerciciosexmaen;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int side;
		
		//Ask the user for the side
		System.out.print("Input the side: ");
		side = sc.nextInt();
		
		//Loop for the figure
		for (int i = side; i > 0; i--) {
			
			for (int j = 0; j < side - i; j++) {
				System.out.print(" ");
			}
			
			if (i == side) {
				for (int k = 0; k < i; k++) {
					System.out.print("* ");
				}
			}
			else if (i == 1) {
					System.out.print("*");
				}
			else {
				System.out.print("*");
				for (int l = 0; l < 2 * i-3; l++) {
					System.out.print(" ");
			}
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		//Close the Scanner
		sc.close();
	}

}
