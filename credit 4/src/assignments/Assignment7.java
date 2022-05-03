package assignments;

import java.util.Scanner; 


public class Assignment7 {

	public static void main(String[] args) {
		/*

		Program: ${Assignment 7}.java          Date: ${4/29/2022}


		Author: Tarun Jaikrishnan 
		School: CHHS
		Course: Computer Science 10
	//
	*/
		int amount, originalAmount,
		              quarters, dimes, nickels;

		System.out.println("Enter a whole number."); //prompts the user for a whole number.
	     System.out.println("I will find a combination of coins");//explaining what the command will do.
		 System.out.println("that equals that amount of change.");//continuing what the last sentence said.
		  
		          @SuppressWarnings("resource")
				Scanner keyboard = new Scanner(System.in); //Create scanner to take user input
		        amount = keyboard.nextInt();
		  
		          originalAmount = amount;
		          quarters = amount / 25;
		          amount = amount % 25;
		          dimes = amount / 10;
		          amount = amount % 10;
		          nickels = amount / 5;
		          amount = amount % 5;
		         
		 
		         System.out.println(originalAmount +
		                             " cents in coins can be given as:");
		          System.out.println(quarters + " quarters"); //stating how many quarters can cleanly fit in your value.
		          System.out.println(dimes + " dimes and ");//stating how many dimes ($0.10) could cleanly fit in your remaining value.
     System.out.println(nickels + " nickels.");//stating how many nickels ($0.05) could cleanly fit in your remaining value. 
	        

	}

}
/* Screen Dump
Enter a whole number.
I will find a combination of coins
that equals that amount of change.
215
215 cents in coins can be given as:
8 quarters
1 dimes and 
1 nickels.
*/