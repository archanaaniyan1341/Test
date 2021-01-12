
public class ThisDemo {
	String name="Archana";
	int rollNo=21;
	float sem1Mark=8.10f;
	float sem2Mark=8.00f;
	
	ThisDemo(String name,int rollNo,float sem1Mark,float sem2Mark){
		this.name=name;//this refer to particular instance variable
		this.rollNo=rollNo;
		this.sem1Mark=sem1Mark;
		this.sem2Mark=sem2Mark;
	}// end of constructor
void display() {
	System.out.println("name is "+name);
	System.out.println("roll no is "+rollNo);
	System.out.println("sem1Mark is "+sem1Mark);
	System.out.println("sem2Mark "+sem2Mark);
	
	
}//end of method
}//end of class
