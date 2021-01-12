package serialization;

public class Employee implements java.io.Serializable {

private String firstName=null;
private transient String lastName=null;
private int age=0;
Employee(String string, String string2, int i) {
	this.firstName=firstName;
	this.lastName=lastName;
	this.age=age;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


public String toString() {
	return " First name is "+firstName+"\n Last name is "+lastName+"\n Age is "+age;
}
}