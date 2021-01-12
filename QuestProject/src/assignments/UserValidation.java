package assignments;
import java.util.Scanner;
public class UserValidation {
	String id;
	int pin;
	Scanner sc=new Scanner(System.in);
	User u=new User();
	public void scan() {
		System.out.println("Enter user id");
		id=sc.next();
		System.out.println("Enter pin");
		pin=sc.nextInt();
		u.setUserID(id);
		u.setPin(pin);	
	}//end of scan method
	public void validation() {
		if(u.getUserID().equals("Admin")) {
			if(u.getuserPin()==1234) {
				System.out.println("Welcome user");
			}//end of nested if
			else{
				System.out.println("Incorrect pin");
				}//end of inner else
		}//end of if
		else {
			System.out.println("Login unsuccessful");
		}//end of else
	}//end of validation method
}//end of class
