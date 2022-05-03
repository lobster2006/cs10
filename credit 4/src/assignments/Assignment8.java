package assignments;

import java.util.Scanner;

public class Assignment8{

	public static void main(String[] args) {
		/*

		Program: ${Assignment 8}.java          Date: ${5/2/2022}


		Author: Tarun Jaikrishnan 
		School: CHHS
		Course: Computer Science 10
	//
	*/
		
		
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); //Create scanner to take user input.

        
        int hundreds = 0; //value of the hundreds digit.
        int tens = 0; //value of the tens digit.
        int ones = 0; //value of the ones digit.

                   
        System.out.print("Enter a 2 or a 3 digit number: "); //Prompt the user to input a 2 or a 3 digit number.
        int number = input.nextInt();

if (number <= 999 && number > 99)   // Checking if you printed a 3 digit number.
{

        
        hundreds = number / 100;
        System.out.println("Hundreds place digit: " + hundreds); //Displays digit in the hundreds place

        
        tens = (number - (hundreds*100)) / 10;  
        System.out.println("Tens place digit: " + tens); //Displays digit in the tens place


        ones = (number - (tens*10) - (hundreds*100));   
        System.out.println("Ones place digit: " + ones); //Displays digit in the ones place  
}
                        
else                                                                    
{      
if (number > 999)
        System.out.println("Error! Number more then 3 digits.");
        //Displayed message if you print a number with more than 3 digits

if (number <= 99 && number > 10);

tens = (number/ 10);  
System.out.println("Tens place digit: " + tens); //Displays digit in the tens place


ones = (number - (tens*10));   
System.out.println("Ones place digit: " + ones); //Displays digit in the ones place
}

	}

}
/* Screen Dump
Enter a 3 digit number: 245
Hundreds place digit: 2
Tens place digit: 4
Ones place digit: 5
*/