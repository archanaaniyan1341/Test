package exceptions;

public class CheckedCase {
	static void compute(int num) {
		System.out.println("number "+num);
		if(num<10) {
			System.out.println("less than 10");
		}
		else {
			try {
			throw new CheckedException(num);
		}
			catch(CheckedException ce) {
				System.out.println("caught"+ce);
			}
		}
	}
}
