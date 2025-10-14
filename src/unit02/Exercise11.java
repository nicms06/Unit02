package unit02;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        
    	//Create a new Scanner
    	Scanner sc = new Scanner(System.in);

    	//Declare the variables
    	String name;
    	double hours;
    	double rate;
    	double taxes;
    	double grossSalary;
    	double netSalary;
    	
        //We ask the user for the name
        System.out.print("Please input your name: ");
        name = sc.nextLine();

        System.out.print("Please, input the hours: ");
        hours = sc.nextDouble();

        System.out.print("Please input the rate in one hour: ");
        rate = sc.nextDouble();

        //Calculate gross salary
        
        if (hours <= 35) {
        	grossSalary = hours * rate;
        } else {
        	grossSalary = 35 * rate + (hours - 35) * rate * 1.5;
        }

        //Calculate the taxes
        if (grossSalary <= 500) {
            taxes = 0;
        } else if (grossSalary <= 900) {
            taxes = (grossSalary - 500) * 0.25;
        } else {
            taxes = (400 * 0.25) + (grossSalary - 900) * 0.45;
        }

        //Calculate net salary
        netSalary = grossSalary - taxes;

        //Show the results
        System.out.printf("Nombre: %s%n", name);
        System.out.printf("Gross Salary: %.2f €%n", grossSalary);
        System.out.printf("Taxes: %.2f €%n", taxes);
        System.out.printf("Net Salary: %.2f €%n", netSalary);

        //Close the Scanner
        sc.close();
    }
}

