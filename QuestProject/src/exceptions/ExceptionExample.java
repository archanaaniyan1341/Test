package exceptions;

public class ExceptionExample {
static void calculate(int arg1,int arg2) {
	int res=0;
	try {
		 res=arg1/arg2;
	}catch(ArithmeticException e) {
		 res=arg1/2;
	}
	System.out.println(res);
}
}
