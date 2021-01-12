package serialization;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class TestSerialization {

	public static void main(String[] args) {
		try(ObjectOutputStream objStream=new ObjectOutputStream(new FileOutputStream("E://Employee.txt") )){
			Employee obj1=new Employee("Ann","Annu",35);
			System.out.println("Before serialization");
			System.out.println(obj1);
			objStream.writeObject(obj1);
		}catch(IOException ie) {
			System.out.println("Exception during serialization...");
		}
		try(ObjectInputStream objStream1=new ObjectInputStream(new FileInputStream("E://Employee.txt") )){
Employee obj2=(Employee) objStream1.readObject();
System.out.println("After serialization");
System.out.println(obj2);
	}catch(IOException|ClassNotFoundException cnf) {
		System.out.println("Exception during deserialization...");
		}
	}

}
