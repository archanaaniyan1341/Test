
public class SubClass extends SuperClass {
	String name_subclass="Global";
	
	SubClass(){
		
		System.out.println("Inside the sub class constructor ");	
	}
	void display() {
		System.out.println("Inside the super class constructor "+name_subclass);
		System.out.println("Inside the sub class  ");
	}
    void callMethod() {
    	System.out.println("Name in super class is "+name_subclass);
    	display();
    }
}
