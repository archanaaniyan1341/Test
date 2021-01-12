package exceptions;

public class CheckedThrows {
	static void compute(int num) throws CheckedException {
		System.out.println("number "+num);
		if(num<10) {
			System.out.println("less than 10");
		}
		else {
			
			throw new CheckedException(num);
		
	}
}
}