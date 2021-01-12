package exceptions;

public class CheckUsernamePasswordTest {

	public static void main(String[] args) {
		CheckUsernamePasswordExample.getData();
		try {
			CheckUsernamePasswordExample.validateUser();	
		}catch(UsernameCorrectException|PasswordCorrectException|UsernameWrongException|PasswordWrongException e) {
			System.out.println(e);
		}
	}

}
