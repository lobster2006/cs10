package assignments;

import java.util.Scanner;

public class PizzaCostAssignment {

	public static void main(String[] args) {
		/*

		Program: ${PizzaCost}.java          Date: ${4/15/2022}


		Author: Tarun Jaikrishnan 
		School: CHHS
		Course: Computer Science 10
		 
	*/
		@SuppressWarnings("resource")
		
			 // Declare variables
			
	        Scanner sc = new Scanner(System.in);
	        double size = 0.0;
	        double cost = 0.0;
	        
	        // Display instructions
	        System.out.println("\nEnter the size of the pizza(diameter): ");
	        size = sc.nextDouble();
	        
	        // Calculate total cost
	        cost = ((.05 * size * size) + 1 + .75);
	        
	        // Output the total
	        System.out.println("Total cost: $" + cost);	

	}

}
/* Screen Dump
Enter the size of the pizza(diameter):
*/