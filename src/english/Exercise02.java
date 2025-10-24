/*
 * Consider a bank that offers four different types of account (‘A’, ‘B’, ‘C’ and ‘X’). The following 
 * table illustrates the annual rate of interest offered for each type of account:
 * 
 * Account ---> Annual rate of interest (%)
 * A ---> 1.5
 * B ---> 2
 * C ---> 1.5
 * X ---> 5
 * 
 * Design and implement a program that allows the user to enter an amount of money and a type of bank account, 
 * before displaying the amount of money that can be earned in one year as interest on that money for the given 
 * type of bank account. You should use the switch statement when implementing this program.
 * Hint: be careful to consider the case of the letters representing the bank accounts. You 
 * might want to restrict this to, say, just upper case. Or you could enhance your program by 
 * allowing the user to enter either lower case or upper case letters.
 */

package english;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		String typeAccount;
		char letter;
		double money;
		final double RATE_A = 1.5;
		final double RATE_B = 2;
		final double RATE_C = 1.5;
		final double RATE_X = 5;
		double rate;
		
		//Ask the user for the money
		System.out.print("Input the money: ");
		money = sc.nextDouble();
		
		sc.nextLine();
		
		if (money < 0) {
			System.out.println("ERROR: Money cannot be negative.");
		}
		else {
			//Ask the user for a type of account 
			System.out.print("Please, input a type of acccount (A, B, C, X): ");
			typeAccount = sc.nextLine();
			letter = Character.toUpperCase(typeAccount.charAt(0));
			
			switch (letter) {
			case 'A':
				rate = (money * RATE_A)/100;
				System.out.println("You can earn " + rate + " money in a year.");
				break;
			case 'B':
				rate = (money * RATE_B)/100;
				System.out.println("You can earn " + rate + " money in a year.");
				break;
			case 'C':
				rate = (money * RATE_C)/100;
				System.out.println("You can earn " + rate + " money in a year.");
				break;
			case 'X':
				rate = (money * RATE_X)/100;
				System.out.println("You can earn " + rate + "EUR in a year.");
				break;
			default:
				System.out.println("ERROR: Invalid account type.");
			}
		}
		
		//Close the Scanner
		sc.close();
		
	}

}
