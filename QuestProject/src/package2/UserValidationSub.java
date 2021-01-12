package package2;
import java.util.Scanner;
import questprograms.packages.UserValiationSup;
public class UserValidationSub extends UserValiationSup {
	public UserValidationSub(){
		super("Archana","Arc123");
	}//end of constructor
public void getDetails() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the username");
	String username=sc.next();
	System.out.println("Enter the password");
	String pw=sc.next();
	validate(username,pw);
	sc.close();
}//end of method get details
}//end of class
