
public class SuperClass {
	String name_superclass="Quest";
	
	 SuperClass() {
		System.out.println("Inside the super class constructor ");
		
	}
	SuperClass(int var1){
		System.out.println("Inside the super class constructor ");
		System.out.println("variable1 is  "+var1);
	}
    void display_super() {
    	System.out.println("Name is "+name_superclass);
    	System.out.println("Inside the super class ... ");
    }
}
