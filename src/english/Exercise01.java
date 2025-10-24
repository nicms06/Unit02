/*
 * Write a program to take an order for a new computer. The basic system costs 375.99. 
 * The user then has to choose from a 38 cm screen (costing 75.99) or a 43 cm screen (costing 99.99). 
 * The following extras are optional. 
 */

package english;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		final double PRICE = 375.99;
		double screen;
		final double ANTIVIRUS = 65.99;
		final double PRINTER = 125;
		double finalPrice;
		String antivirusYesOrNo;
		String printerYesOrNo;
		
		//Ask the user for the cm of the screen
		System.out.print("What do you want, 38 cm or 43 cm screen?: ");
		screen = sc.nextInt();
		
		//If screen isn't 38 or 43 ERROR
		if ((screen != 38) && (screen != 43)) {
			System.out.println("ERROR");
		}
		else {
			//If screen is 38 cm,add 75.99
			if (screen == 38) {
				 finalPrice = PRICE + 75.99;
			}
			//else if screen is 43 add 99.99
			else {
				finalPrice = PRICE + 99.99;
			}
			
			//Ask the user if he wants antivirus
			System.out.print("Do you want antivirus software? (yes = Yes, no = No): ");
			antivirusYesOrNo = sc.next();
			
			//If he doesn't write yes or no, error
			if (!antivirusYesOrNo.equalsIgnoreCase("yes") && !antivirusYesOrNo.equalsIgnoreCase("no")) {
				System.out.println("ERROR");
			}
			else {
				//If he wants it, add 65.99
				if (antivirusYesOrNo.equalsIgnoreCase("yes")) {
					finalPrice += ANTIVIRUS;
				}
				//If he doesn't want it, nothing happens
				else if (antivirusYesOrNo.equalsIgnoreCase("no")) {
					
				}
				
				//Ask the user if he wants the printer
				System.out.print("Do you want the printer? (yes = Yes, no = No): ");
				printerYesOrNo = sc.next();
				
				//If he doesn't write yes or no, error
				if (!printerYesOrNo.equalsIgnoreCase("yes") && !printerYesOrNo.equalsIgnoreCase("no")) {
					System.out.println("ERROR");
				}
				else {
					//If he wants it, add 125
					if (printerYesOrNo.equalsIgnoreCase("yes")) {
						finalPrice += PRINTER;
					}
					//If he doesn't want it, nothing happens
					else if (printerYesOrNo.equalsIgnoreCase("no")) {
					}
				//Show the result
				System.out.printf("You have to pay %.2f€%n", finalPrice);
				}
			}
		}
		
		//Close the Scanner
		sc.close();
		
	}

}
