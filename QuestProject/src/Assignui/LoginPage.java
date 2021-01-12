package Assignui;

import java.util.Scanner;

public  class LoginPage {
	static Scanner sc=new Scanner(System.in);
	static int var;
	public static void mainMenu() {
		System.out.println("1) Administrator");
		System.out.println("2) Customer");
		System.out.println("3) Exit");
		System.out.println("Enter option: ");
		var=sc.nextInt();
		switch(var) {
		case 1: AdminPage.adminVerification();
		break;
		case 2: CustomerPage.customerVerification();
		break;
		case 3: System.out.println("Successfully logged out");
			System.exit(0);
		break;
		 default : System.out.println("Choose an option between 1 to 3");
		break;
		}//end of switch 	
	}//end of mainMenu method
}//end of class
