package package2;
import questprograms.packages.ImpSuperClass;
public class ImpSubClass extends ImpSuperClass {
ImpSubClass(){
		super();
	}
	public void display1() {
		System.out.println("Company location is"+location);
		display();
	}
	public static void main(String[] args) {
		ImpSubClass isc=new ImpSubClass();
isc.display1();
	}
}
