package assignments;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class EmployeeInput {
	Employee1 e=new Employee1();
	Scanner sc=new Scanner(System.in);
	public void input() {
		System.out.println("Enter first name");
		e.setFirstName(sc.next());
		System.out.println("Enter last name");
		e.setLastName(sc.next());
		System.out.println("Enter age");
		e.setAge(sc.nextInt());
		System.out.println("Enter password");
		e.setPassword(sc.next());
		try(ObjectOutputStream objStream=new ObjectOutputStream(new FileOutputStream("E://Employee1.txt") )){
			System.out.println("Before serialization");
			System.out.print(e);
			objStream.writeObject(e);
		}catch(IOException ie) {
			System.out.println("Exception during serialization...");
		}//end of catch
	}//end of input method

}//end of class
