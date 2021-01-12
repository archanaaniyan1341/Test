package exceptions;

public class SingleTryMultipleCatch {
	static void calculate(int arg1,int arg2) {
		int res=0;
		int arr1[]=new int[5];
		SingleTryMultipleCatch stmc=null;
		try {
			stmc.hashCode();
			 res=arg1/arg2;
			 arr1[5]=res;	 
		}
		catch(NullPointerException npr){
			System.out.println(npr);
			System.out.println("NullSystem.out.printl");
			
		}
		catch(ArithmeticException e) {
			 res=arg1/2;
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("ArrayIndexOutOfBoundException");
			arr1[4]=res;
		}//end of catch
		finally {
			System.out.println("This will be executed whether there is exception or not");
		}
		System.out.println("result is "+res);
		
	}//end of calculate method
}//end of class
