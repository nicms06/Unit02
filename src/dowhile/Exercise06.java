package dowhile;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {

		//Create a new Scanner
				Scanner sc = new Scanner(System.in);
				
				//Declare the variables
				int player1;
				int player2;
				
				//We explain the game to the user
				System.out.println("Stone = 1\n Paper = 2\n Scissors = 3\n");
				
				//Ask the player 1 to input a number between 1 and 3
				System.out.println("<-----PLAYER 1----->\n Enter 1, 2 or 3");
				player1 = sc.nextInt();
				
				//If player 1 input a number that isn't between 1 and 3 error
				if(player1 < 1 || player1 > 3) {
					System.out.println("ERROR");
				}
				else {
					//Ask the player 2 to input a number between 1 and 3
					System.out.println("<-----PLAYER 2----->\n Enter 1, 2 or 3");
					player2 = sc.nextInt();
					
					//If player 1 input a number that isn't between 1 and 3 error
					if(player2 < 1 || player2 > 3) {
						System.out.println("ERROR");
					}
					else {
						//If player1 and player 2 has selected the same number = draw
						if((player1 == 1 && player2 == 1) || (player1 == 2 && player2 == 2) || (player1 == 3 && player2 == 3)) {
							System.out.println("Draw");
						}
						else if((player1 == 1 && player2 == 3) || (player1 == 2 && player2 == 1) || (player1 == 3 && player2 == 2)) {
							System.out.println("PLAYER 1 WINS ");
						}
						else{
							System.out.println("PLAYER 2 WINS ");
						}
					}
				}
				
				//Close the Scanner
				sc.close();
		
	}

}
