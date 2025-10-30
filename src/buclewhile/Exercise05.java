/*
 * Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos de un centro educativo. 
 * Se introducirán datos hasta que uno de ellos sea negativo, y se mostrará: la suma de todas las edades introducidas, 
 * la media, el número de alumnos y cuántos son mayores de edad.
 */

package buclewhile;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int age;
		int sum = 0;
		double mean;
		int adult = 0;
		int accountant = 0;
		
		//Ask the user for an age
		System.out.println("Please, input an age: ");
		age = sc.nextInt();
		
		//Loop
		while (age >= 0){
			sum += age;
			accountant ++;
			
			if (age >= 18) {
				adult ++;
			}
			System.out.println("Please, input an age: ");
			age = sc.nextInt();
		}
		
		//Calculate the mean
		mean = (double) (sum / accountant);
		
		//Show the results 
		System.out.println("The sum of all the ages is " + sum);
		System.out.println("The mean is " + mean);
		System.out.println("The number of students is " + accountant);
		System.out.println("The are " + adult + " adults");
		
		//Close the Scanner
		sc.close();
		
	}

}
