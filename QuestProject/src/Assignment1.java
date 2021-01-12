import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the user name");
	String username=sc.next();
	System.out.println("Enter the password");
	String password=sc.next();
	String name="Archana";
	String pw="abcd";
	if(username.equals(name)) {
		if(password.equals(pw)){
			System.out.println("user is valid");
	}
	else {
		System.out.println("user not found");
	}	
	sc.close();
	}
	}	
}
