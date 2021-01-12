
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		//System.out.println(str.length());//this will throw an exception
 try {
	 int var1=30;
	 int var2=0;
	 int res=var1/var2;
	 System.out.println(res);
 }
 catch(ArithmeticException e) {
	 System.out.println("Cannot divide by 0");
	 
 }
	
	}
}
