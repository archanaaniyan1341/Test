
public class ConstructorOverloading {
String empName="Archana";
int empID= 353784;
int empSalary= 20000;
//ConstructorOverloading(){
private ConstructorOverloading(){
	String name="Anjana";
	 empID= 353784;
	 empSalary= 40000;
	System.out.println("employ name is"+empName);
	System.out.println("employ ID is"+empID);
	System.out.println("employ salary is"+empSalary);
}
//ConstructorOverloading(int empID){

private ConstructorOverloading(int empID){
	this();
	String name="Anju";
	 this.empID= empID;
	 empSalary= 440000;
	System.out.println("employ name is"+empName);
	System.out.println("employ ID is"+this.empID);
	System.out.println("employ salary is"+empSalary);
}
ConstructorOverloading(String empName, int empID, int empSalary){
	this(empID);
	this.empName=empName;
	//this.empID= empID;
	this.empSalary= empSalary;
	System.out.println("employ name is"+this.empName);
	System.out.println("employ ID is"+this.empID);
	System.out.println("employ salary is"+this.empSalary);
}
}
