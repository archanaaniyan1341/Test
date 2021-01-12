package assignments;

import java.util.Scanner;

public class ToStringTester {

	public static void main(String[] args) {
		int var1=0;
		String name="QuestGlobal";
		String pw="Campus1234";
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the user name");
		String username=sc.next();
		
		System.out.println("Enter the password");
		String password=sc.next();
		
		if(username.equals(name)) {
		if(password.equals(pw))	{
			var1=0;
			ToStringAssignment tsa=new ToStringAssignment(var1);
			System.out.println(tsa);
		}//end of nested if
		else {
			var1=2;
			ToStringAssignment tsa=new ToStringAssignment(var1);
			System.out.println(tsa);
		}
	}//end of if
		else {
			var1=1;
			ToStringAssignment tsa=new ToStringAssignment(var1);
			System.out.println(tsa);
		}//end of else
		sc.close();
		}

	}

