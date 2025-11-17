/*
 *Para dos números dados, a y b, es posible calcular el máximo común divisor (el número más grande que divide a ambos) 
 *mediante un algoritmo ineficiente pero sencillo: desde el menor de a y b, ir buscando, de forma decreciente (-1), 
 *el primer número que divide a ambos simultáneamente. Teniendo en cuenta lo que se acaba de explicar, realiza un programa 
 *que calcule el máximo común divisor de dos números. 
 */

package bucles;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num1, num2, min, i;
		int gcd = 1;
		
		//Ask for num1 and num2
		System.out.println("Please, input num1: ");
		num1 = sc.nextInt();
		
		System.out.println("Please, input num2: ");
		num2 = sc.nextInt();
		
		//See the smallest
		min = (num1 < num2) ? num1 : num2;
		
		i = min;
		
		//loop to see the gcd
		while (i > 1 && gcd == 1) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
			i--;
		}
		
		//show the gcd
		System.out.println("The GCD is: " + gcd);
				
		//Close the Scanner
		sc.close();
		
	}

}
