/*
 *Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado:
 *Hora
 *Minutos
 *Segundos
 *Cantidad de segundos a incrementar
 *La aplicación debe mostrar la nueva hora. Por ejemplo, si el usuario introduce hora=13, minutos=59 y segundos=51, 
 *y se desea incrementar en 10 segundos, el resultado a mostrar es 14:00:01.
 */

package bucles;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int sec;
		int min;
		int hour;
		int addSec;
		
		//Ask the user for the hour, min, sec and addSec
		System.out.println("Hours: ");
		hour = sc.nextInt();
		
		System.out.println("Minutes: ");
		min = sc.nextInt();
		
		System.out.println("Seconds : ");
		sec = sc.nextInt();
		
		System.out.println("How many seconds do you want to add? : ");
		addSec = sc.nextInt();
		
		//Create a loop to add the seconds
		for (int i=addSec; i>0 ; i--) {
			
			sec ++;
			
			if (sec >= 60) {
				min ++;
				sec = 0;
			}
			if (min >=60) {
				hour ++;
				min = 0;
			}
			if (hour >=24) {
				hour = 0;
			}
		}
		
		//Show the result
		System.out.println(hour + " : " + min + " : " + sec);
		
		//Close the Scanner
		sc.close();
		
	}

}
