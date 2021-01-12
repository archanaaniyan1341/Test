
public class ReturnValue {
	int var1=12;
	int var2=21;
	int calculateProduct() {
		int product=var1*var2;
		return product;
	}
	public static void main(String[] args) {
		ReturnValue rv= new ReturnValue();
		System.out.println(rv.calculateProduct());
}
}