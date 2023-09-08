/*
 * Programming_Exercise1_Tyler_Fuller
 * Tyler Fuller
 * 01261802
 * 09/06/2023
 */

import java.util.*; // Import Scanner to get user input

public class Programming_Exercise1_Tyler_Fuller {

	public static void main(String[] args) {
		
		// Define variables
		double pounds;
		double kilograms;
		
		// Prompt user for a weight in pounds (e.g. 54)
		System.out.print("Enter a value in pounds: ");
		Scanner input = new Scanner(System.in);
		pounds = input.nextDouble();
		input.close();
		
		// Convert pounds to kilograms
		kilograms = pounds * 0.4536;
		
		// Print result to console
		System.out.print(pounds + " is equal to " + kilograms + " kilograms");
		
	}
}