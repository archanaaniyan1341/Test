package assignments;

import java.util.Scanner;

public class ItemMenu {
	public void menu() {
	Scanner sc=new Scanner(System.in);
	System.out.println("1) Administrator");
	System.out.println("2) User");
	System.out.println("3) Exit");
	System.out.println("Input");
	int var1=sc.nextInt();
	switch(var1) {
	case 1:
	
break;
	case 2:
		System.out.println("Enter userName");
		String user=sc.next();
		System.out.println("Enter password");
		String upw=sc.next();
		if(user.equals("Achu")&&upw.equals("User1234")) {
			new Item();	
			int pay=sc.nextInt();
			if(pay==0) {
			
			}
	}
		break;
}
	}
}
