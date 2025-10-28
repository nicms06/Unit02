/*
 * Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el árbol más alto. 
 * Para ello se introducirá por teclado la altura (en centímetros) de cada árbol (terminando la introducción de 
 * datos cuando se utilice -1 como altura). La aplicación debe devolver la altura del árbol más alto.
 */

package bucle_while;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		double height;
		int numberTrees = 0;
		double bigger = 0;
		
		//Ask the user for the height
		System.out.println("Please input the height of tree (cm): ");
		height = sc.nextDouble();
		
		//Loop
		while (height != -1) {
			//Loop to invalid inputs
			while (height < 0) {
				System.out.println("Error: the height must be positive, try again:  ");
				height = sc.nextDouble();
			}
			numberTrees ++;
			if (height > bigger) {
				bigger = height;
			}
			System.out.println("Please input the height of tree (cm): ");
			height = sc.nextDouble();
		}
		
		//Show the results
		System.out.println("There are " + numberTrees + " trees and the biggest one has " + bigger + " cm of height");
		
		//Close the Scanner
		sc.close();

	}

}
