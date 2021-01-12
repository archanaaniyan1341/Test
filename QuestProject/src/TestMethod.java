
public class TestMethod {
int var1=10;
int var2=20;
void calculateSum() {
	int sum=var1+var2;
	System.out.println("The sum is "+sum);
}
public static void main(String[] args) {
	TestMethod tm= new TestMethod();
	 tm.calculateSum();
}
}