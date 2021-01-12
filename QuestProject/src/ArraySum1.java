
public class ArraySum1 {
	// intialising the array
	int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int evenSum=0;
	int oddSum=0;
	int diagonalSum=0;
	int offDiagonalSum=0;
	
	void Sum() {
		
		for(int incr=0;incr<arr1.length;incr++) {
			for(int incrC=0;incrC<arr1[incr].length;incrC++) {
				if(arr1[incr][incrC]%2==0) {// to chek if even
					evenSum=evenSum+arr1[incr][incrC];// even sum
				}
				else {
					 oddSum=oddSum+arr1[incr][incrC];//odd sum
				}
			 }
			}
		System.out.println(" even sum is"+evenSum);
			System.out.println(" odd sum is"+oddSum);
	}//end of method
    void diagonal() {
    	
    	for(int incr=0;incr<arr1.length;incr++) {
			for(int incrC=0;incrC<arr1[incr].length;incrC++) {
			if(incr==incrC) {// to find diagonal elements
				diagonalSum=diagonalSum+arr1[incr][incrC];
			   }// end of if
			 }// end of for loop
			}// end of method
    	System.out.println("diagonal sum is"+diagonalSum);
    	
    }
    void offDiagonal() {
    	
    	for(int incr=0;incr<arr1.length;incr++) {
			for(int incrC=0;incrC<arr1[incr].length;incrC++) {
			if(incr+incrC==2) {// to find off diagonal elements
				offDiagonalSum=offDiagonalSum+arr1[incr][incrC];
			   }// end of if
            }//end of for loop
    	    }// end of method
    	System.out.println("offDiagonalSum is"+offDiagonalSum);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySum1 as=new ArraySum1();
		as.Sum();
		as.diagonal();
		as.offDiagonal();
	}

	}


