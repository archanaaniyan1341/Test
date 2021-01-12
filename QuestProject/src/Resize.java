
public class Resize{
	void  increaseSizeOfArray() {

	int array[] = {12,23,34,45,56,67,78};
    System.out.println("content before increasing size");
    for(int i=0;i<array.length;i++) {
 	   System.out.print(array[i]+" ");
 	   }//end of for loop
    int temp[]=array;
    array=new int[10];
    System.out.println();
    System.out.println("content after increasing size");
    for(int i=0;i<array.length;i++) {
 	   System.out.print(array[i]+" ");
 	   }//end of for loop
    System.arraycopy(temp, 0, array, 0, temp.length);
    System.out.println();
    System.out.println("content after increasing size");
    for(int i=0;i<array.length;i++) {
 	   System.out.print(array[i]+" ");
    }//end of for loop
	}//end of method
	public static void main(String[] args) {
		new Resize().increaseSizeOfArray();
	}//end of main method
       }//end of class
		
		
