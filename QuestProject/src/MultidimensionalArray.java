
public class MultidimensionalArray {
         void display1() {
		int arrM[][]=new int[3][3];
		arrM[0][0]=11;
		arrM[0][1]=110;
		arrM[0][2]=101;
		
		arrM[1][0]=111;
		arrM[1][1]=181;
		arrM[1][2]=113;
		
		arrM[2][0]=119;
		arrM[2][1]=211;
		arrM[2][2]=131;
		
		for(int incr=0;incr<arrM.length;incr++) {
			for(int incrC=0;incrC<arrM[incr].length;incrC++) {
				System.out.print(" "+arrM[incr][incrC]);
			}//end of for loop
			System.out.println();
		}
         }//end of method display1
		//Heterogenous Multidimensional array
		void display2() {
		int arrMul[][]=new int[3][];
		arrMul[0]=new int[3];
		arrMul[1]=new int[2];
		arrMul[2]=new int[1];
		
		arrMul[0][0]=1;
		arrMul[0][1]=10;
		arrMul[0][2]=101;
		
		arrMul[1][0]=191;
		arrMul[1][1]=182;
		
		arrMul[2][0]=169;
		
		System.out.println("Heterogenous Multidimensional array");
		
		for(int incr=0;incr<arrMul.length;incr++) {
			for(int incrC=0;incrC<arrMul[incr].length;incrC++) {
				System.out.print(" "+arrMul[incr][incrC]);
			}//end of inner for loop
			System.out.println();
		}//end of for loop
		}//end of method display2
		
		void display3() {
		int arr3[][]= {{10},{30,40},{20,60,70}};
		
		System.out.println("Heterogenous Multidimensional array 2");
		
		for(int incr=0;incr<arr3.length;incr++) {
			for(int incrC=0;incrC<arr3[incr].length;incrC++) {
				System.out.print(" "+arr3[incr][incrC]);
			}
			System.out.println();
		}//end of for loop
		
	}//end of method display3
}//end of class

