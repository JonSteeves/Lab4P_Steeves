package lab4p_Steeves;

import java.util.Scanner;

public class lab4p_steeves {

	public static void main(String[] args) {
		
		//Creates the scanner sc that i will use
		Scanner sc = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		//Asks for and stores needed variables
		System.out.print("What is the loan amount? ");
		double loan = sc.nextDouble();
		System.out.print("What is the down payment? ");
		double down = sc.nextDouble();
		System.out.print("Have you held your current job for at least a year? ");
		String s1 = input.next();
		System.out.print("What is your annual salary? ");
		double sal = sc.nextDouble();
		
		//Sets string for later comparison
		String s2 = "yes";
		
		//Calculates whether the user is eligible for the loan
		if (s1.equalsIgnoreCase(s2) && (sal >= (loan * .5)) ) {
				System.out.print("You are eligible for this loan.");
		}else if(down >= (loan * .2)) {
				System.out.print("You are eligible for this loan.");
	}else {
			System.out.print("You are not eligible for this loan");
	}
			//Closes the scanner
		sc.close();
		input.close();
	}

}
