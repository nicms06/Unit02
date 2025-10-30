/*
 * Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta adivinarlo. 
 * Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo (el usuario deberá indicarle 
 * al ordenador si es mayor, menor o igual al número que ha pensado).
 */

package dowhile;

import java.util.Scanner;
import java.util.Random;

public class Exercise05 {

	public static void main(String[] args) {
		
		// Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create random class
		Random rand = new Random();
		
		//Declare the variables
		int num;
		int computerNum;
		int option;
		
		//Ask the user for the number
		System.out.println("Please, input a number (1-100): ");
		num = sc.nextInt();
		
		//The number must be between 1 and 100
		while (num < 1 || num > 100) {
			System.out.println("ERROR: the number must be between 1 and 100: ");
			num = sc.nextInt();
		}
		
		computerNum = (int) (Math.random() * 100);
		System.out.println(computerNum);
		
		do {
			
			//Ask the user if the number is bigger or smaller
			System.out.println("The number is bigger or smaller? (1= bigger, 2= smaller): ");
			option = sc.nextInt();
				
			while (option > 2 || option <1) {
				System.out.println("ERROR, try again: ");
				option = sc.nextInt();
				}
			if (option == 1) {
				computerNum = rand.nextInt(computerNum, 101);
				System.out.println(computerNum);
				}
			else {
				computerNum = rand.nextInt(1, computerNum+1);
				System.out.println(computerNum);
			}
		}
		while (computerNum != num);
			
		System.out.println("Correct");

		
		//Close the Scanner
		sc.close();

	}

}
