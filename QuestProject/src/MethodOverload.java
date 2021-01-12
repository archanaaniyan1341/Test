
public class MethodOverload {
	 public void calculate(int arg1,float arg2){
		 System.out.println("Inside First method..."); 
		 }//end of method first calculate 
	 public void calculate(float arg1,int arg2){
		 System.out.println("Inside Second method..."); 
		 }//end of method second calculate
	 public static void main(String[]args){
		 MethodOverload mo=new MethodOverload();
		 mo.calculate(20F,20); 
		 }//end of main method}//end of class MethodOverload
	

}
