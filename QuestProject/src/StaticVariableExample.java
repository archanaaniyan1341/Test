
public class StaticVariableExample {
static int number;
static String name;
static {
	int number1 =109;
	number=20;
	name="achu";
	System.out.println("number is"+number1);
}
static {
	String name1="ammu";
	System.out.println("number is"+name1);
}
StaticVariableExample(){
	
}
StaticVariableExample(int number,String name){
	//this.number=number;
	//this.name=name;
}
static void print() {
	// void print()nonstatic method cannot be used inside static method
}
static void display() {
	System.out.println("number is"+number);
	System.out.println("name is"+name);
	//System.out.println("number is"+number1);
	//System.out.println("name is"+name1);non-static variables cannot be used inside static method
	print();
}
}
