package assignments;

import java.util.Scanner;

public class Assignment9 {

	
	public static void main(String[] args) {
		/*

		Program: ${Assignment 9}.java          Date: ${5/2/2022}


		Author: Tarun Jaikrishnan 
		School: CHHS
		Course: Computer Science 10
	//
	*/
	int a,b, div=0, mod=0, div2=0, mod2=0;
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in); //Create scanner to take user input
	System.out.print("Enter an Integer: "); // Prompts user to enter an integer
	a=sc.nextInt();
	System.out.print("Enter an Integer: "); // Prompts user to enter another integer
	b=sc.nextInt();
	div= a/b; //creating the division function
	mod= a%b; //creating the modulus function
	div2= b/a; //creating the second division function
	mod2= b%a; //creating the second modulus function
	System.out.println(a+"/"+b+"="+div); //printing out the quotient of your first integer divided by your second.
	System.out.println(a+"%"+b+"="+mod); //printing out the remainder of your first integer divided by your second.
	System.out.print(" ");
	System.out.println(b+"/"+a+"="+div2);//printing out the quotient of your second integer divided by your first.
	System.out.println(b+"%"+a+"="+mod2);//printing out the remainder of your second integer divided by your first.

	}

}
/* Screen Dump
Enter an Integer: 4
Enter an Integer: 2
4/2=2
4%2=0

2/4=0
2%4=2
*/