package exceptions;

public class CheckedExcMain {

	public static void main(String[] args)  {
		try {
			CheckedThrows.compute(9);
			CheckedThrows.compute(10);
		} catch (CheckedException e) {
			System.out.println("caught"+e);
			//e.printStackTrace();
		}
		// TODO Auto-generated method stub
		/*CheckedCase.compute(10);
		CheckedCase.compute(9);*/
	}

}
