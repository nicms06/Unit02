/*
 * Realiza un programa que sume los números desde el 1 hasta un número N que se introducirá por teclado. 
 * Si el usuario introduce un 5, el programa debe devolver la suma de 1+2+3+4+5. 
 */

package dowhile;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num = 0;
		int userNum;
		int sum = 0;
		
		//ask the user for a number
		System.out.println("Please, input a number: ");
		userNum = sc.nextInt();
		
		//The loop
		do {
			num ++;
			sum += num;
		}
		while(num < userNum);
		
		System.out.println(sum);
		
		//Close the Scanner
		sc.close();

	}

}
