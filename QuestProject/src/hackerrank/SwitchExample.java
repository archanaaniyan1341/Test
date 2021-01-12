package hackerrank;

/* public class SwitchExample {
	/** * @param args */
	/*public static void main(String[] args) {
		int expr = 1; 
		switch (expr)
		{ case 0: int var1 = 0; 
		System.out.print(var1); 
		case 1: int var2 = 1; 
		System.out.print(var2); 
		case 2: int var3 = 2; 
		System.out.print(var3);
		default: int var4 = -1;
		System.out.print(var4); 
		}//end of switch }//end of main method}//end of class SwitchExample
	}
}*/
public class SwitchExample {
	public static void main(String args[]) {
		int myArr[] = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int var = 6;
		var = myArr[myArr[var] / 2];
		System.out.println(myArr[var] / 2); 
		
		}//end of main method}//end of class TestArray
}





