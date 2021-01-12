package assignments;
import java.util.Scanner;
public class GetUserDetails {
	static String username;
	static String password;
static void getDetails() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter username");
	username=sc.next();
	System.out.println("Enter password");
    password=sc.next();
    sc.close();
}
static void validateName() throws UsernameLargeException,UsernameSmallException {
	if(username.length()>10) {
		throw new UsernameLargeException("Username should not have more than 10 characters");
	}
	else if(username.length()<6) {
		throw new UsernameSmallException("Username should not be less than 6 characters");
		}	
	}

static void validatePassword() throws PasswordIncorrectException{
	if(password.length()!=8) {
		throw new PasswordIncorrectException("Password should not be greater than or less than 8 characters");
	}
}
}
