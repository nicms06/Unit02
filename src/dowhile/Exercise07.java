/*
 * Repetir el ejercicio de la calculadora del boletín de SWITCH de forma que se añada una opción más al menú, quedando el menú así:
 * SUMAR LOS NÚMEROS
 * RESTAR LOS NÚMEROS
 * MULTIPLICAR LOS NÚMEROS
 * DIVIDIR LOS NÚMEROS
 * SALIR
 * De forma que se vuelva a pedir los dos números y la operación a realizar hasta que se pulse la letra E para salir del programa
 */

package dowhile;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		// Create a new Scanner
		Scanner sc = new Scanner(System.in);

		// Declare the variables
		double num1, num2;
		String option;
		double sol;

		do {
			// MENU
			System.out.println("<---MENU--->\n" + "A. SUMAR LOS NUMEROS\n" + "B. RESTAR LOS NUMEROS\n"
					+ "C. MULTIPLICAR LOS NUMEROS\n" + "D. DIVIDIR LOS NUMEROS\n" + "E. SALIR\n" + "Select a option:");

			option = sc.nextLine().toUpperCase();

			// We ask the user for num1 and num2
			System.out.print("Please input num1: ");
			num1 = sc.nextDouble();

			System.out.print("Please input num2: ");
			num2 = sc.nextDouble();

			sc.nextLine();

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
				} else {
					sol = (num1 / num2);
					System.out.println(sol);
				}
				break;
			case "E":
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("The option must be A, B, C, D or E.");
			}
		} while (!option.equals("E"));

		// Close the Scanner
		sc.close();

	}
}
