/*
 * Escribe un algoritmo que le pida al usuario dos números. A continuación debe mostrar el siguiente menú por pantalla:
 * SUMAR LOS NÚMEROS
 * RESTAR LOS NÚMEROS
 * MULTIPLICAR LOS NÚMEROS
 * DIVIDIR LOS NÚMEROS
 * Después, el algoritmo debe pedirle al usuario que seleccione una opción y que haga la operación que 
 * marca esa opción, mostrando por último el resultado de la operación elegida por el usuario. 
 * Si el usuario elige una opción incorrecta, el algoritmo se lo hace saber al usuario	y no haría nada.
 */

package switch_;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		double num1, num2;
		String option;
		double sol;
		
		//We ask the user for num1 and num2
			System.out.print("Please input num1: ");
			num1 = sc.nextDouble();
					
			System.out.print("Please input num2: ");
			num2 = sc.nextDouble();
			
			sc.nextLine();
			
		//MENU
		System.out.println("<---MENU--->\n"
				+ "A. SUMAR LOS NUMEROS\n"
				+ "B. RESTAR LOS NUMEROS\n"
				+ "C. MULTIPLICAR LOS NUMEROS\n"
				+ "D. DIVIDIR LOS NUMEROS\n"
				+ "Select a option:");
		option = sc.nextLine();
		
		
		switch (option) {
			case "A":
				sol = num1 + num2;
				System.out.println(sol);
				break;
			case "B":
				sol = num1 - num2;
				System.out.println(sol);
				break;
			case "C":
				sol = num1 * num2;
				System.out.println(sol);
				break;
			case "D":
				if (num2 == 0) {
					System.out.println("A number cant be divided by 0");
				}
				else {
					sol = (num1/num2);
					System.out.println(sol);
				}
				break;
			default:
				System.out.println("The option must be A, B, C or D.");
			}
			
		//Close the Scanner
		sc.close();
		
	}

}
