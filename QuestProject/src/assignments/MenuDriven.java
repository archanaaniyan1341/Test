package assignments;
import java.util.Scanner;
public class MenuDriven {
static	Scanner sc=new Scanner(System.in);
static	String adName;  //Admin username
static	String adPw;   //Admin Password
static	 String userName;   //username of user
static	 String userPw;       //user password
	
	//Verify method directs to the particular login based on the argument passed
	public static void verify(int arg1) {
		if(arg1==1) {
			System.out.println("Enter username of  Admin");
		   adName=sc.next();
			System.out.println("Enter Admin password");
			 adPw=sc.next();
			verifyAdmin(adName,adPw);
		}//end of if
		else if(arg1==2) {
			System.out.println("Enter username of user");
			 userName=sc.next();
			System.out.println("Enter user  password");
			 userPw=sc.next();
			verifyUser(userName,userPw);
		}//end of else if
		else if(arg1==3) {
			System.out.println("Successfully logged out");
			System.exit(0);
		}	
	}//end of verify method
	//Admin validation 
	public static void verifyAdmin(String admin,String pw) {
		if(admin.equals("Archana")) {
			if(pw.equals("Admn1234")) {
			System.out.println("Admin Login Successfull");
			System.out.println("1) Add Items");
			System.out.println("2) Modify Items");
			System.out.println("3) Delete Items");
			System.out.println("4) Exit");
			int var2=sc.nextInt();
			if(var2==4) {
			MainMenu.menu();
			}//end of if
		}//end of outer if
			System.out.println("Password entered is wrong");
			System.out.println("Admin Login unsuccessfull");
			MainMenu.menu();
		}else {
			System.out.println("Username entered is wrong");
			System.out.println("Admin Login unsuccessfull");
			MainMenu.menu();
		}//end of else
	}//end of verifyAdmin method
	//User validation
	public static void verifyUser(String user,String upw) {
		if(user.equals("Achu")){
			if(upw.equals("User1234")) {
			System.out.println("User Login Successfull");
			MainMenu.menu();
			}System.out.println("Password entered is wrong");
			System.out.println("User Login unsuccessfull");
			MainMenu.menu();
}//end of if
		else {
			System.out.println("Username entered is wrong");
			System.out.println("User Login unsuccessfull");
			MainMenu.menu();
	}//end of else
}//end of verifyUser method
}//end of class
