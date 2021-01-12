
public class arrayCopy {

	public static void main(String[] args) {
		char[] copyFrom= {'a','b','s','d','f','i','j','k'};
		char[] copyTo=new char[7];
		
		System.arraycopy(copyFrom, 2, copyTo, 2, 5);
		
		for(int i=0;i<copyTo.length;i++) {
			System.out.print(copyTo[i]);
		}//end of for loop
	}//end of main method

}//end of class
