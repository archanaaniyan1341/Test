import java.util.Scanner;
public class DynamicArrayCreation {
	Scanner sc=new Scanner(System.in);	
	void size() {
		// reading row and column size
		System.out.println("enter the no of rows");
		int rowSize=sc.nextInt();
		System.out.println("enter the no of columns");
		int columnSize=sc.nextInt();
		
		System.out.println("enter the elements");
		// declaring array
		int arr[][]= new int[rowSize][columnSize];
		// reading values of array from user
		for(int incr=0;incr<rowSize;incr++) {	
		for(int incrC=0;incrC<columnSize;incrC++) {
		arr[incr][incrC]=sc.nextInt();
	    }
		}
		// printing array
		System.out.print("The matrix is : "+"\n");
		 for(int incr=0; incr<rowSize ;incr++){
		        for(int incrC = 0; incrC<columnSize ; incrC++) {
		        	System.out.print(arr[incr][incrC]+"\t" );
		        }	
		        System.out.println();
	    }
		      
	}
	public static void main(String[] args){
		
		DynamicArrayCreation dac=new DynamicArrayCreation();
		dac.size();
	}
	}


