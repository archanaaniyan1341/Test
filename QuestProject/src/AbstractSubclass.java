
public class AbstractSubclass extends AbstractExample {

	AbstractSubclass(){
		super(123);
	}
	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1");
	}

	@Override
	void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method 2");
	}
//if not defined any of these methods in this subclass we have to define this subclass also as abstract

}
