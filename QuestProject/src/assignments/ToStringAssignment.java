package assignments;


public class ToStringAssignment {
	int var1;
	
	ToStringAssignment(int arg1){
		var1=arg1;
	}//end of constructor
	public String toString() {
		if(var1==1) {
			return "Username entered is wrong...";
		}// end of if
		else if(var1==2) {
			return "Password entered is wrong...";
		}//end of else if
		else
		{
			return "Welcome user...";
		}//end of else
	}// end of method toString
}//end of class ToStringAssignment