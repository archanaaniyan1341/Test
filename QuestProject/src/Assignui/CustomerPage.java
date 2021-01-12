package Assignui;

import java.util.Scanner;

import getterandsetter.GetterAndSetter;
import getterandsetter.Setter;

public class CustomerPage {
	static String customerName; // Username of Admin
	static String customerPassword; //Password of Admin
	static Scanner sc=new Scanner(System.in);
	public static void customerVerification() {
		System.out.println("Enter Customer Username ");
		customerName=sc.next();
		System.out.println("Enter Customer Password");
		customerPassword=sc.next();
		if(customerName.equals("User")) {
			if(customerPassword.equals("User1234")) {
				System.out.println("User Login Successful");
				displayItems(AdminPage.addItems());
				LoginPage.mainMenu();
			}//end of nested if
			else{System.out.println("Password entered is wrong!!! User Login Unsuccessful.");}
		}//end of if
		else {
			System.out.println("Username entered is wrong!!! User Login Unsuccessful.");
		}//end of else

	}//end of customerVerification method
	public static void displayItems(Items i) {
	    int no[];
	    String name[];
	    int price[];
	    int quantity[];
	   no=i.getItemNo();
	  price=i.getItemPrice();
	  name=i.getItemName();
	  quantity=i.getItemQuantity();
	  System.out.println("Item No"+"Item Name"+"Item Price"+"Item Quantity");
	  for(int inc=0;inc<no.length;inc++) {
	  System.out.println(no[inc]+" "+name[inc]+" "+price[inc]+" "+quantity[inc]);
	 }
	}
	}//end of class

	
