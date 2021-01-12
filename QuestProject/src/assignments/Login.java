package assignments;

import java.util.Scanner;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Login{
	Scanner sc=new Scanner(System.in);
	int var1;
	public void menu() {
		System.out.println("1) Administrator");
		System.out.println("2) User");
		System.out.println("3) Exit");
		System.out.println("Input");
		var1=sc.nextInt();
		category(var1);
}
	public void category(int arg1) {
		
		if(arg1==1) {
			System.out.println("Enter Admin name");
			String admin=sc.next();
			System.out.println("Enter password");
			String password=sc.next();
			if(admin.equals("Admin")&&password.equals("Admin1234")) {
				new Login();
			}
		}
	}
	
}