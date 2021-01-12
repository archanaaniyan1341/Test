
public class PassByMethod {
	void min(int arr[]){
		int min= arr[0];
		for(int inc=1;inc<arr.length;inc++) {
		if(min>arr[inc]) {
			min=arr[inc];
			}//end of if
		}
	System.out.println(min)	;
			}//end of min method

	public static void main(String[] args) {
	 int actual[]= {56,23,37,11};
	 new PassByMethod().min(actual);
	}//end of main method
}//end of class
