package assignments;

import java.util.Scanner; 

public class Assignment6 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*

		Program: ${Assignment 6}.java          Date: ${4/26/2022}


		Author: Tarun Jaikrishnan 
		School: CHHS
		Course: Computer Science 10
	//
	*/
		String line;
		String loop;
		String lobsang;
		String lopsang;
		String lobbyschlobby;
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in); //Create scanner to take user input

        System.out.print("What is your name?: "); //prompts user for their first name
        line = in.nextLine();
        System.out.print("What is your last name?: "); //prompts user for their last name
        loop = in.nextLine();
        System.out.print("What grade are you in?: "); //prompts user for their grade
        lobsang = in.nextLine();
        System.out.print("What school do you attend?: "); //prompts user for what school they attend
        lopsang = in.nextLine();
        System.out.print("What is your favorite hobby?: "); //prompts user for their hobby
        lobbyschlobby = in.nextLine();
        System.out.println("Hello, your name is: "+ line +" "+ loop +" , you are currently in grade " + lobsang + " at " + lopsang + ". Your favourite hobby is " + lobbyschlobby + "."); //prints a sentence using the user's inputs
    }
}

/* Screen Dump
What is your name?: Tarun
What is your last name?: Jai
What grade are you in?: 10
What school do you attend?: Crescent Heights High School
What is your favorite hobby?: Exercising
Hello, your name is: Tarun Jai , you are currently in grade 10 at Crescent Heights High School. Your favorite hobby is Exercising.
*/