/*
 * Determinar el precio de un billete de tren, conociendo la distancia a recorrer, y sabiendo que 
 * si el número de días de estancia es superior a 7 y la distancia superior a 800 km el billete 
 * tiene una reducción del 30%. El precio por kilómetro es de 2,5€. La distancia a recorrer y el 
 * número de días de estancia los debes solicitar al usuario por teclado.
 */

package conditionals;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int distance;
		int dayStay;
		final double PRICE_PER_KM = 2.5;
		double priceDistance;
		double finalPrice;
		
		//Ask the user for the distance
		System.out.println("Please input the distance of the travel (Km): ");
		distance = sc.nextInt();
		
		//Ask the user for the stay
		System.out.println("How many days of stay?: ");
		dayStay = sc.nextInt();
		
		priceDistance = distance*PRICE_PER_KM;
		
		if (distance < 0 || dayStay < 0){
			System.out.println("ERROR");
		}
		else {
			if (dayStay > 7 && distance > 800) {
				finalPrice = priceDistance *(1-(0.3));
				System.out.printf("You have to pay %.2f€%n", finalPrice);
			}
			else {
				System.out.printf("You have to pay %.2f€%n", priceDistance);
			}
		}
		
		//Close the Scanner
		sc.close();
		
	}

}
