
public class CustomerDetails {
	String name= "Archana";
	String emailID="archanaaniyan1341@gmail.com";
	long phone= 9876543210L;
	int age= 22;
CustomerDetails(String name,String emailID,long phone,int age){
	this.name=name;
	this.emailID=emailID;
	this.phone=phone;
	this.age=age;
	if(age>=18) {
		System.out.println("Name :"+name);
		System.out.println("Email ID :"+emailID);
		System.out.println("Phone :"+phone);
		System.out.println("Age :"+age);
	}
	else {
		System.out.println("Inacceptable user");
	}
}//end of constructor
}//end of class
