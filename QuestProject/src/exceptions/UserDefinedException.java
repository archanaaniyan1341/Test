package exceptions;

public class UserDefinedException {
static void compute(int num) {
	System.out.println("number "+num);
	if(num<10) {
		System.out.println("less than 10");
	}
	else {
		try {
		throw new MyException(num);
	}
		catch(MyException me) {
			System.out.println("caught"+me);
		}
	}
}
}
