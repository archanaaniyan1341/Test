package assignments;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
public class EmployeeDeSerialze {
	Scanner sc=new Scanner(System.in);
	Employee1 e1=new Employee1();
	
	public void deserialization() {
		try(ObjectInputStream objStream1=new ObjectInputStream(new FileInputStream("E://Employee1.txt") )){
			Employee1 obj2=(Employee1) objStream1.readObject();
			System.out.println("After serialization");
			System.out.println(obj2);
				}catch(IOException|ClassNotFoundException cnf) {
					System.out.println("Exception during deserialization...");
					}//end of catch
				}//end of deserialization method
	public void validation() {
		System.out.println("Enter first name");
		String fname=sc.next();
		System.out.println("Enter password");
		String pw=sc.next();
		if(e1.getFirstName().equals(fname)) {
			if(e1.getPassword().equals(pw)) {
				System.out.println("Valid user");
			}//end of nested if
		}else {System.out.println("InValid user");
		}//end of else
	}//end of validation method
	}//end of class

