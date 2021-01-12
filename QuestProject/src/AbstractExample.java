
public abstract class AbstractExample {
long var1;

abstract void method1(); 
abstract void method2();
void method3() {
	System.out.println("Method 3");
}
AbstractExample(long var1){
	this.var1=var1;
	System.out.println(var1);
}

}
