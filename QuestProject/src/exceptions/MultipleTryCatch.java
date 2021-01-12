package exceptions;

public class MultipleTryCatch {
	static void calculate(int arg1,int arg2) {
		int res=0;
		int arr1[]=new int[5];
		try {
			 res=arg1/arg2;
			 
		}catch(ArithmeticException e) {
			 res=arg1/2;
		}
		try {
			arr1[5]=res;
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("ArrayIndexOutOfBoundException");
			arr1[4]=res;
		}
		System.out.println(res);
	}
}
