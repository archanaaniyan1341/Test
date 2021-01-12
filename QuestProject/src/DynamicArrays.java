
public class DynamicArrays {
	int arr[]=new int[20];
	void createArray() {
		int empNo=101;
		for(int inc=0;inc<arr.length;inc++) {
			arr[inc]=empNo;
			empNo+=1;
		}
	}
	void display() {
		for(int inc=0;inc<arr.length;inc++) {
			System.out.println(arr[inc]);
		}
	}

	public static void main(String[] args) {
		DynamicArrays da=new DynamicArrays();
		da.createArray();
		da.display();
	}

}
