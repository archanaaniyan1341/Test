package serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class EmployeeNew implements Externalizable {
	private int employeeID;
public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

private String employeeName;
private String department;
private String nationality;

@Override
public void readExternal(ObjectInput in) {
 System.out.println("Reading data");
 try {
	 employeeID=in.readInt();
	 employeeName=(String )in.readObject();
	 department=(String )in.readObject();
	 nationality=(String )in.readObject();
 }catch(IOException | ClassNotFoundException io) {
	 io.printStackTrace();
 }
	
}

@Override
public void writeExternal(ObjectOutput out)  {
	try {
	out.writeInt(employeeID);
	out.writeObject(department);
	out.writeObject(employeeName);
	out.writeObject(nationality);
	}catch(IOException i){
		
	}
}
}
