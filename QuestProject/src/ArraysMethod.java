
public class ArraysMethod {
	void findingEvenSingle() {
		int arrS[]= {9,18,27,36,45};
		System.out.print("The even nos in single dimensional array are ");
		for(int incr=0;incr<arrS.length;incr++) {
			if(arrS[incr]%2==0) {
				System.out.print(arrS[incr]+" ");
			}
		}
	}
    void findingEvenMultiple() {
    	int arrM[][]= {{10,11,12},{23,24},{1,3,7,9}};
    	System.out.println("");
    	System.out.print("The even nos in multi dimensional array are");
    	for(int incr=0;incr<arrM.length;incr++) {
			for(int incrC=0;incrC<arrM[incr].length;incrC++) {
				if(arrM[incr][incrC]%2==0) {
					System.out.print(arrM[incr][incrC]+" ");	
				}
			}
				
			}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysMethod am=new  ArraysMethod();
		am.findingEvenSingle();
		am.findingEvenMultiple();
		
	}

}
