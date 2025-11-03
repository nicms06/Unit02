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
		int max = 101;
		int min = 0;
		int randNum;
		int option;
		
		do {
			//Show a random number
			randNum = rand.nextInt(min, max);
			System.out.println(randNum);
			
			//Ask the user if is smaller or bigger
			System.out.println("Bigger = 1 | Smaller = 2 | Correct = 3");
			option = sc.nextInt();
			
			//The number must be 1 or 2
			while (option != 1 && option != 2 && option != 3) {
				System.out.println("ERROR, the number must be 1, 2 or 3. Please, try again: ");
				option = sc.nextInt();
			}
			
			if (option == 1) {
				min = randNum + 1;
			}
			else if (option == 2){
				max = randNum - 1;
			}
			
		}
		while (option != 3);
		
		//Show a message of correct
		System.out.println("I've guessed your number!!!");
		
		//Close the Scanner
		sc.close();

	}

}
