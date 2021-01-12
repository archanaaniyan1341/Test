package inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserValidation {

	public static void main(String[] args) {
		String username= "";
		String password="";
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	try {	System.out.println("Enter user name");
		username=(String) br.readLine();
		System.out.println("Enter password");
		password=(String) br.readLine();
	}catch(IOException i) {
		
	}
	if(username.equals("User")) {
		if(password.equals("1234")) {
			System.out.println("valid user");
		}
	}else {System.out.println("Invalid user");}
	
}
}