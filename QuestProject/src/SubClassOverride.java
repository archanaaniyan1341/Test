
public class SubClassOverride extends SupClassOverride {
   //double calculate(float arg1,float arg2) { in this case no overriding method is called
	//float var1=arg1+20;
	int rollNo=22;
	void calculate(int arg1,float arg2) {
		float var1=arg1+20;
	float var2=arg2*1.76f;
	double res=(var1+var2)*1000;
	System.out.println("Result is :"+res);
	super.calculate(10, 22.7f);
	//calculate(10, 22.7f);in thhis case stack overflow will occur
	System.out.println("Roll no in the super class is :"+rollNo);
	//return res;
	}
	void calculate1() {
		System.out.println("");
	}
	void calculate2() {
		System.out.println("");
	}

}
