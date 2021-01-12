package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalizable {
	public static void main(String args[]) {
		EmployeeNew emp=new EmployeeNew();
		emp.setDepartment("ECE");
		emp.setEmployeeID(21);
		emp.setEmployeeName("Archana");
		emp.setNationality("Indian");
		try {
			FileOutputStream fileOut=new FileOutputStream("E:\\EmployeeNew.txt");
			ObjectOutputStream outStream=new ObjectOutputStream(fileOut);
			outStream.writeObject(emp);
			outStream.close();
			fileOut.close();
		}catch(IOException i){
			
		}
		emp=null;
				try {
					FileInputStream fileIn=new FileInputStream("E:\\EmployeeNew.txt");
					ObjectInputStream in=new ObjectInputStream(fileIn);	
					emp=(EmployeeNew) in.readObject();
					in.close();
					fileIn.close();
	}catch(IOException i){
		
	}catch(ClassNotFoundException c){
		
	}
				System.out.println("Deserialized employee");
				System.out.println("emp id "+emp.getEmployeeID());
				System.out.println("emp dept "+emp.getDepartment());
				System.out.println("emp  "+emp.getNationality());
				System.out.println(emp.getEmployeeName());
}
}