package questprograms.packages;

public class UserValiationSup {
	
		protected String name;
		protected String password;

		protected UserValiationSup(String username, String passcode){
			name=username;
			password=passcode;
		}//end of constructor
		protected void validate(String arg1,String arg2) {
			if(name.equals(arg1)){
			if(password.equals(arg2)) {
				System.out.println("Valid user");
			}//end of nested if
			}//end of if
			else {
				System.out.println("Invalid user");
			}//end of else
		}//end of method validate
	}//end of class

