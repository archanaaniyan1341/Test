package exceptions;
import java.util.Scanner;
public class CheckUsernamePasswordExample {
static String Username="Quest";
static String Username1;
static String Password="tvm";
static String Password1;
static Scanner sc=new Scanner(System.in);
static void getData() {
	System.out.println("Enter username");
	Username1=sc.next();
	System.out.println("Enter password");
	Password1=sc.next();
	sc.close();
}
static void validateUser() throws UsernameCorrectException,PasswordCorrectException,UsernameWrongException,PasswordWrongException{
	if(Username.equals(Username1)) {
		if(Password.equals(Password1)) {
			throw new PasswordCorrectException("Username is correct..");
		}
		else {
			throw new PasswordWrongException("pw not correct..");
		}
		}
	else {throw new UsernameWrongException("Username not correct..");
	}
	
	}
}

