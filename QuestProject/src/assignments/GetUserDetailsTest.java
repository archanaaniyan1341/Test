package assignments;

public class GetUserDetailsTest {

	public static void main(String[] args) {
		GetUserDetails.getDetails();
		try{GetUserDetails.validateName();
		}
		catch(UsernameLargeException|UsernameSmallException e) {
			System.out.println(e);
		}
		
		try {
			GetUserDetails.validatePassword();
		}catch(PasswordIncorrectException f) {
			System.out.println(f);
		}
	}
}
