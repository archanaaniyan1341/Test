package package2;

public class ToStringEx {
	int var1;
	public ToStringEx(int arg1) {
		arg1=var1;// TODO Auto-generated constructor stub
	}
	
public String toString() {
	if(var1>=0) {
	return "Hello";
	}
	else {
		return  "Hell";
	}
	
}
public static void main(String[]args) {
	ToStringEx t=new ToStringEx(-9);
	System.out.println(t);
}
}
