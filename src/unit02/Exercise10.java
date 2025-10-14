/*
 * Dibuja un ordinograma que recibe como datos de entrada una hora expresada en 
 * horas, minutos y segundos que nos calcula y escribe la hora, minutos y segundos  
 * que serán, transcurrido un segundo.
 */

package unit02;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables hours, minutes and seconds
		int hours;
		int minutes;
		int seconds;
		
		//Ask the user for the hours
		System.out.println("Please input the hours: ");
		hours = sc.nextInt();
		
		//Ask the user for the minutes
		System.out.println("Please input the minutes: ");
		minutes = sc.nextInt();
				
		//Ask the user for the seconds
		System.out.println("Please input the seconds: ");
		seconds = sc.nextInt();
		
		seconds ++;
		
		if (seconds > 59) {
			seconds = 0;
			minutes ++;
		}
		if (minutes > 59) {
			minutes = 0;
			hours ++;
		}
		if (hours > 23) {
			hours = 0;
		}
		
		//Show the result
		System.out.println(hours + " : " + minutes + " : " + seconds);
		
		//Close the Scanner
		sc.close();

	}

}
