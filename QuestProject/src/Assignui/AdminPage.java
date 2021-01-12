package Assignui;

import java.util.Scanner;

public class AdminPage {
	static String adminName; // Username of Admin
	static String adminPassword; //Password of Admin
	static Scanner sc=new Scanner(System.in);
	static int[] ItemNo;
	static String[] ItemName;
	static int[] ItemPrice;
	static int[] ItemQuantity;
	
public static void adminVerification() {
	System.out.println("Enter Admin Username ");
	adminName=sc.next();
	System.out.println("Enter Admin Password");
	adminPassword=sc.next();
	if(adminName.equals("Admin")) {
		if(adminPassword.equals("Admin1234")) {
			System.out.println("Admin Login Successful");
			addItems();
			LoginPage.mainMenu();
		}//end of nested if
		else{System.out.println("Password entered is wrong!!! Admin Login Unsuccessful.");}
	}//end of if
	else {
		System.out.println("Username entered is wrong!!! Admin Login Unsuccessful.");
	}//end of else
}//end of adminVerification method

 static Items addItems() {	
	System.out.println("Enter no of  items");
	int no=sc.nextInt();
	ItemNo=new int[no];
	ItemName=new String[no];
	ItemPrice=new int[no];
	ItemQuantity=new int[no];
		for(int incr=0;incr<no;incr++) {
ItemNo[incr]=incr+1;
ItemName[incr]="Item"+(incr+1);
System.out.println("Enter item price");
ItemPrice[incr]=sc.nextInt();
if(ItemPrice[incr]==0) {
	System.out.println("ItemPrice must be larer than zero");
	ItemPrice[incr]=sc.nextInt();
}
System.out.println("Enter item quantity");
ItemQuantity[incr]=sc.nextInt();
if(ItemQuantity[incr]==0) {
	System.out.println("ItemQuantity must be larer than zero");
	ItemQuantity[incr]=sc.nextInt();
}
	}//end of for loop
		Items i=new Items();
		i.setItemName(ItemName);
		i.setItemNo(ItemNo);
		i.setItemPrice(ItemPrice);
		i.setItemQuantity(ItemQuantity);
		return i;
}	//end of add items method	
public static void displayItems(int[] arg1,String[] arg2,int[] arg3,int[] arg4) {
	System.out.println("ItemNo"+"ItemName"+"ItemPrice"+"ItemQuantity");
	for(int i=0;i<arg1.length;i++) {
	System.out.println(arg1[i]+" "+arg2[i]+" "+arg3[i]+" "+arg4[i]);
}//end of for loop
}//end of display items method
}//end of class
