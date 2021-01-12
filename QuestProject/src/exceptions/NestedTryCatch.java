package exceptions;

public class NestedTryCatch {
	static void calculate(int arg1,int arg2) {
		int res=0;
		int arr1[]=new int[5];
		try {
			 res=arg1/arg2;
			try { arr1[5]=res;
			}
			catch(ArrayIndexOutOfBoundsException ae) {
				System.out.println("ArrayIndexOutOfBoundException");
				arr1[4]=res;
			}//end of catch
			}	 
		catch(ArithmeticException e) {
			 res=arg1/2;
		}finally {
			System.out.println("This will be executed whether there is exception or not");
		}
		System.out.println("result is "+res);	
	}
	}//end of calculate method

