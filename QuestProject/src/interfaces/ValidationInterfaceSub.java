package interfaces;

import java.util.Scanner;
public class ValidationInterfaceSub implements ValidationUsingInterface {
	@Override
	public void getUserDetails() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the user name");
		String username=sc.next();
		
		System.out.println("Enter the password");
		String password=sc.next();
		sc.close();
		validate(username,password);
	}//end of getUserDetails method

	@Override
	public void validate(String arg1,String arg2) {
		String name="QuestGlobal";
		String pw="Campus1234";
        int var1=0;
		
		if(arg1.equals(name)) {
		if(arg2.equals(pw))	{
			var1=0;
			ValidationInterface1 vi=new ValidationInterface1(var1);
			System.out.println(vi);
		}//end of nested if
		else {
			var1=2;
			ValidationInterface1 vi=new ValidationInterface1(var1);
			System.out.println(vi);
		}//end of nested else
	}//end of if
		else {
			var1=1;
			ValidationInterface1 vi=new ValidationInterface1(var1);
			System.out.println(vi);
		}//end of else
		
		
	}//end of validate method

}//end of class
