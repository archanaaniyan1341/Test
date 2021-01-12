import java.util.Scanner;
public class CustomerDetailsTester1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the email");
		String email=sc.next();
		System.out.println("Enter the phone no");
		long phone=sc.nextLong();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		CustomerDetails cd1=new CustomerDetails(name,email,phone,age);

	}

}
