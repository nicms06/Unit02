//Realiza un programa que nos diga si un número introducido por teclado es capicúa o no. El número debe ser mayor o igual que 0.

package bucles;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int num;
		int aux;
		int last;
		int inverted = 0;
		
		//Ask for a number
		System.out.println("Input a number: ");
		num = sc.nextInt();
		
		aux = num;
		
		while (aux>0) {
			last = aux % 10;
			inverted = inverted * 10 + last;
			aux /= 10;
		}
		
		System.out.println(inverted == num ? "Palindrome" : "Not palindrome");
		
		//Close the scanner
		sc.close();
		
	}

}
